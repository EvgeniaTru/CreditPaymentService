public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment = service.calculate (1_000_000,12,9.99F);
        System.out.println(payment);
        int payment2 = service.calculate (1_000_000,24,9.99F);
        System.out.println(payment2);
        int payment3 = service.calculate (1_000_000,36,9.99F);
        System.out.println(payment3);
    }
}
