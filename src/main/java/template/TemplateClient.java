package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Template Method is a behavioral design pattern that allows you to define a skeleton of an algorithm in a base class and
 * let subclasses override the steps without changing the overall algorithm’s structure.
 * <p>
 * =============================
 * TEMPLATE METHOD DESIGN PATTERN
 * =============================
 * 1. GoF Motivation
 * ------------------------------------
 * Define the skeleton of an algorithm in a base class.
 * • Let subclasses redefine certain steps without changing the algorithm structure.
 * • Promotes code reuse for common behavior.
 * • Controls the order of execution while allowing customization.
 * ------------------------------------
 * 2. Core Idea
 * ------------------------------------
 * • Base class defines a template method.
 * • Template method calls several steps in a fixed order.
 * • Some steps are implemented in the base class.
 * • Some steps are abstract or hook methods overridden by subclasses.
 * ------------------------------------
 * 3. Structure
 * ------------------------------------
 * • AbstractClass → defines template method and common logic.
 * • Template Method → final method defining algorithm steps.
 * • Primitive Operations → abstract methods implemented by subclasses.
 * • ConcreteClass → provides specific implementations for steps.
 * ------------------------------------
 * 4. Relation with Other Patterns
 * ------------------------------------
 * • Strategy: Uses composition to change algorithms.
 * • Template Method: Uses inheritance to change parts of an algorithm.
 * • Template focuses on flow control, Strategy focuses on behavior swapping.
 * ------------------------------------
 * 5. Why Use Template Method?
 * ------------------------------------
 * • Avoid duplication of algorithm structure.
 * • Enforce execution order.
 * • Share common logic among subclasses.
 * • Let subclasses customize only what varies.
 * ------------------------------------
 * 6. When to Use / When NOT to Use
 * ------------------------------------
 * Use when:
 * • Multiple classes follow the same algorithm structure.
 * • Only some steps vary.
 * • You want to control the flow but allow extensions.
 * • Framework-style development.
 * Do NOT use when:
 * • Algorithm changes frequently.
 * • You need runtime switching of behavior.
 * • Inheritance hierarchy becomes too deep.
 * • Steps are not stable.
 * 7. Pros
 * ------------------------------------
 * • Promotes code reuse.
 * • Enforces algorithm consistency.
 * • Follows Open/Closed Principle.
 * • Removes duplication of workflow logic.
 * • Easy to extend by adding subclasses.
 * 8. Cons
 * ------------------------------------
 * • Uses inheritance (tight coupling).
 * • Harder to change algorithm structure later.
 * • Can lead to many subclasses.
 * • Limited flexibility compared to Strategy.\
 * ------------------------------------
 * 9. Java-Specific Design Points
 * -------------------------------
 * • Template method should be final to prevent override.
 * • Common logic goes into abstract base class.
 * • Variable steps are abstract methods.
 * • Hooks are protected methods with default behavior.
 * • Subclasses override only required parts.
 * ------------------------------------
 * 10. Design Considerations (Step-wise)
 * ------------------------------------
 * 1. Identify the common algorithm steps.
 * 2. Fix the execution order in a template method.
 * 3. Declare the template method as final.
 * 4. Implement shared steps in base class.
 * 5. Mark varying steps as abstract or hooks.
 * 6. Create subclasses to implement variable steps.
 * 7. Let base class control the flow, not subclasses.
 */

public class TemplateClient {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Create proper network object and send the message.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new LinkedIn(userName, password);
        }
        assert network != null;
        network.post(message);
    }

}
