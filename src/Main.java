public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double percent = 9.99;
        double monthlyPercent = percent / 100 / 12;

        int payment1 = service.calculate(1_000_000, 1 * 12, monthlyPercent);
        System.out.println("Ежемесячный платеж: " + payment1 + " руб.");

        int payment2 = service.calculate(1_000_000, 2 * 12, monthlyPercent);
        System.out.println("Ежемесячный платеж: " + payment2 + " руб.");

        int payment3 = service.calculate(1_000_000, 3 * 12, monthlyPercent);
        System.out.println("Ежемесячный платеж: " + payment3 + " руб.");
    }
}
