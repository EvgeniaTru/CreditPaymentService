public class CreditPaymentService {
    public int calculate(long amount, int period, float percent) {
        float monthlyPercent = percent / 12 / 100F;
        float index = monthlyPercent + 1;
        float power = (float) Math.pow(index, period);
        int payment = (int) ((power / (power - 1)) * monthlyPercent * amount);
        return payment;
    }
}
