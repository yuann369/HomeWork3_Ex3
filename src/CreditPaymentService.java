public class CreditPaymentService {
    public int calculate(int amount, int months, double percent) {
        int payment = (int) (amount * (percent + (percent / (Math.pow((1 + percent), months) - 1))));
        return payment;
    }
}
