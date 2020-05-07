public class CreditPaymentService {
    public double calculate(int amount, int term, double intRate) {
        double monthlyRate = intRate / 12 / 100;
        double coefficient = (monthlyRate * Math.pow(1 + monthlyRate, (term*12)) / (Math.pow(1 + monthlyRate, (term*12)) - 1));
        double monthlyPayment = coefficient * amount;
        return monthlyPayment;
    }
}