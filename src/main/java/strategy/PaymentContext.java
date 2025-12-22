package strategy;

public class PaymentContext {

    private PaymentStrategy strategy;

    // Strategy is injected (DI)
    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // Can even change strategy at runtime
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void makePayment(int amount) {
        strategy.pay(amount);
    }
}
