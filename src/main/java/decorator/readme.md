============================
DECORATOR DESIGN PATTERN
============================

1. GoF Motivation
-----------------
• Attach additional responsibilities to an object dynamically.
• Provide a flexible alternative to subclassing for extending behavior.
• Add behavior at runtime without modifying existing classes.
• Follow Open/Closed Principle by wrapping objects instead of changing them.

2. Problem It Solves
--------------------
Without Decorator, adding features leads to:
• Large inheritance hierarchies.
• Class explosion (PizzaWithCheese, PizzaWithCheeseAndOlives, etc.).
• Rigid designs that cannot change behavior at runtime.

Decorator avoids this by composing behavior instead of inheriting it.

3. Core Idea
------------
• Both the original object and decorator share the same interface.
• Decorator wraps a Component object.
• Decorator delegates calls to the wrapped object and adds extra behavior.
• Multiple decorators can be stacked dynamically.

Thus:
component = new Extra(new Extra(new Base()));

4. Structure
------------
Component (interface / abstract class)
• Declares operations.

ConcreteComponent (base object)
• Implements default behavior.

Decorator (abstract wrapper)
• Implements Component.
• Holds a reference to Component.

ConcreteDecorator
• Extends Decorator.
• Adds behavior before or after delegation.

Client
• Works with Component interface only.

5. Participants
---------------
• Component
- Common interface for objects that can be decorated.

• ConcreteComponent
- Base implementation to be extended dynamically.

• Decorator
- Wraps a Component.
- Delegates calls to wrapped object.

• ConcreteDecorator
- Adds responsibilities before/after delegation.

• Client
- Uses only Component interface.

6. Key Mechanism
----------------
Instead of subclassing:

class A {}
class AWithX extends A {}
class AWithXAndY extends A {}

We do:

A base = new A();
A withX = new XDecorator(base);
A withXY = new YDecorator(withX);

Behavior is layered at runtime.

7. Relation with Other Patterns
-------------------------------
• Composite: Structures objects in trees (part-whole).
• Decorator: Structures objects in chains (wrapping).
• Proxy: Controls access.
• Adapter: Changes interface.

Decorator focuses on behavior extension, not structure or access control.

8. Example Use Cases
--------------------
• Coffee / Pizza toppings.
• Logging wrappers.
• Security checks.
• Metrics collection.
• Stream filters (Java IO).
• HTTP request enrichment.

9. When To Use / When NOT To Use
--------------------------------
Use when:
• Behavior must be added dynamically.
• You want to avoid subclass explosion.
• You want runtime composition.
• You follow Open/Closed Principle.

Do NOT use when:
• Behavior is static.
• Few variations exist.
• Performance overhead is critical.
• Simpler inheritance works.

10. Pros
--------
• Flexible behavior extension.
• Avoids large inheritance trees.
• Supports Open/Closed Principle.
• Allows stacking responsibilities.
• Promotes composition over inheritance.

11. Cons
--------
• Many small classes.
• Harder debugging due to wrapping layers.
• Order of decorators matters.
• Can be confusing to trace execution.

12. Design Guidelines
---------------------
1. Define Component interface.
2. Implement ConcreteComponent.
3. Create abstract Decorator implementing Component.
4. Store wrapped Component in Decorator.
5. Extend Decorator with concrete decorators.
6. Delegate calls and add behavior.
7. Let Client depend only on Component.

13. Mental Model
----------------
ConcreteComponent = core behavior.
Decorator = wrapper that adds behavior.
Client = unaware of wrapping.

Think of Decorator as:
"Object wrapped by objects."

14. One-Line Summary
--------------------
Decorator dynamically adds behavior to objects by wrapping them in layers that share the same interface.

============================
