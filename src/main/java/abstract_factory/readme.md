===============================
ABSTRACT FACTORY DESIGN PATTERN
===============================

1. GoF Motivation
-----------------
• Provide an interface for creating families of related or dependent objects.
• Objects are created without specifying their concrete classes.
• Ensures consistency among products that belong to the same family.
• Avoids tight coupling between client code and concrete implementations.

2. Core Idea (One-liner)
-----------------------
• A factory of factories.
• Each concrete factory produces a complete product family.

3. Problem It Solves
--------------------
• Client code should not care about:
- Concrete classes
- How objects are instantiated
  • Prevents mixing incompatible product variants.
  (e.g., WindowsButton + MacCheckbox)

4. Structure
------------
• AbstractFactory → declares creation methods for each product type.
• ConcreteFactory → implements creation methods for a specific product family.
• AbstractProduct → common interface for a product type.
• ConcreteProduct → specific implementation of a product.
• Client → works only with abstract interfaces.

5. Relation with Factory Method
-------------------------------
• Factory Method:
- Creates one product.
- Uses inheritance.
  • Abstract Factory:
- Creates multiple related products.
- Uses composition.
  • Abstract Factory often implemented using multiple Factory Methods.

6. When to Use
--------------
Use when:
• System needs to support multiple product families.
• Products must be used together consistently.
• You want to isolate object creation logic.
• Framework or library design (UI toolkits, DB drivers).

Do NOT use when:
• Only one product type exists.
• No need for product families.
• Frequent addition of new product types (violates OCP).

7. SOLID Principles
-------------------
• SRP: Creation logic separated from business logic.
• OCP: Easy to add new product families.
• DIP: Client depends on abstractions, not concrete classes.

8. Pros
-------
• Ensures product compatibility.
• Enforces consistency across related objects.
• Decouples client from concrete implementations.
• Clean separation of concerns.

9. Cons
-------
• Adding a new product type requires changing all factories.
• Increased complexity and number of classes.
• Can be overengineering for simple use cases.

10. Design Considerations (Step-wise)
------------------------------------
1. Identify product families (themes / variants).
2. Define abstract product interfaces.
3. Define AbstractFactory interface with creation methods.
4. Implement ConcreteFactories for each family.
5. Client accepts AbstractFactory via constructor or DI.
6. Client creates products only via factory methods.

11. Common Real-world Examples
------------------------------
• UI Toolkits: WindowsUIFactory, MacUIFactory
• Database Drivers: MySQLFactory, PostgresFactory
• Cloud Providers: AWSFactory, AzureFactory
• Payment Gateways per region/provider

12. Key Interview Distinction
-----------------------------
• Abstract Factory = consistency across product families.
• Strategy = interchangeable behavior.
• State = behavior changes with internal state.
• Builder = step-by-step object construction.
