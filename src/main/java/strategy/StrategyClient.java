package strategy;

import strategy.strategies.CreditCardPayment;
import strategy.strategies.PaypalPayment;

/*
 STRATEGY PATTERN NOTES:

 1. Client talks ONLY to the Strategy interface
 2. Multiple algorithms exist for the same behavior
 3. Behavior can be swapped at runtime
 4. No if-else or switch inside context
 5. Open for extension, closed for modification (OCP)

 Difference from Adapter:
 - Adapter converts an interface
 - Strategy changes behavior/algorithm
*/

public class StrategyClient {

    public static void main(String[] args) {

        // Choose strategy at runtime
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentContext context = new PaymentContext(creditCard);

        context.makePayment(100);

        // Switch strategy dynamically

        context.setStrategy(new PaypalPayment());
        context.makePayment(300);
    }
}
