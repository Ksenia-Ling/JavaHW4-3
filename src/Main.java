public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPayment = service.calculate(1_000_000, 1, 9.99);
        System.out.printf(" При сроке кредита 1 год, ежемесячный платёж составит - %.0f", monthlyPayment);

        monthlyPayment = service.calculate(1_000_000, 2, 9.99);
        System.out.printf("%n При сроке кредита 2 года, ежемесячный платёж составит - %.0f", monthlyPayment);

        monthlyPayment = service.calculate(1_000_000, 3, 9.99);
        System.out.printf("%n При сроке кредита 3 года, ежемесячный платёж составит - %.0f", monthlyPayment);
    }
}
