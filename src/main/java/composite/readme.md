===========================
COMPOSITE DESIGN PATTERN
===========================

1. GoF Motivation
-----------------
• Compose objects into tree structures to represent part-whole hierarchies.
• Let clients treat individual objects and compositions uniformly.
• Eliminates conditional logic for handling single vs group objects.
• Enables recursive composition of objects.

2. Problem It Solves
--------------------
Without Composite, clients must differentiate between:
• Single objects (Leaf)
• Groups of objects (Collections, Wrappers)

This leads to:
• instanceof checks
• if/else branching
• tight coupling
• poor extensibility

Composite removes this by enforcing a common interface for both individual and grouped objects.

3. Core Idea
------------
• Both Leaf and Composite implement the same Component interface.
• Composite stores a collection of Components.
• Composite delegates operations to its children.
• Client only depends on Component, not concrete types.

Thus:
component.operation() works for one object or many objects.

4. Structure
------------
Component (interface / abstract class)
• Declares common operations.

Leaf (concrete)
• Represents indivisible objects.
• Implements actual behavior.

Composite (container)
• Implements Component.
• Stores List<Component>.
• Delegates operations to children.

Client
• Uses Component interface.
• Does not care whether it is Leaf or Composite.

5. Participants
---------------
• Component
- Declares interface for objects in the composition.
- Defines default behavior if needed.

• Leaf
- Implements behavior for primitive objects.
- Has no children.

• Composite
- Stores child components.
- Implements child management (add/remove).
- Delegates operations to children.

• Client
- Manipulates objects via Component interface.

6. Why Composite Holds a List<Component>
---------------------------------------
Composite represents a group of objects.

To behave like its contents, it must:
• Store children.
• Forward method calls to them.
• Combine or coordinate results.

Without a collection, Composite cannot compose behavior.

Composite = Container + Same Interface as Leaf.

7. Example Use Cases
--------------------
• File systems (File + Folder)
• UI components (Button + Panel)
• Organization hierarchy (Employee + Team)
• Permission systems (Permission + Role)
• Workflow pipelines (Step + Group of Steps)
• Ordering systems (Item + Combo)

8. Example Domain: Food Ordering System
--------------------------------------
We model:

• MenuItem (Component)
• SingleFoodItem (Leaf)
• ComboMeal (Composite)
• Client builds meals and executes operations like:
- getPrice()
- prepare()
- describe()

Both single food and combo meals are treated the same.

9. When To Use Composite
------------------------
Use when:
• Objects form a hierarchy.
• You want uniform treatment.
• Clients shouldn't care about structure.
• Recursive behavior makes sense.

Do NOT use when:
• Structure is flat.
• No part-whole relationship exists.
• Performance is extremely sensitive.
• Simpler collections suffice.

10. Pros
--------
• Simplifies client code.
• Supports Open/Closed Principle.
• Encourages recursive design.
• Reduces conditionals.
• Makes hierarchy extensible.

11. Cons
--------
• Can make design overly generic.
• Harder to restrict component types.
• Debugging recursion may be tricky.
• Might hide performance costs.

12. Design Guidelines
---------------------
1. Identify part-whole hierarchy.
2. Define Component interface.
3. Implement Leaf classes.
4. Implement Composite with List<Component>.
5. Add child management methods.
6. Delegate operations recursively.
7. Keep client dependent only on Component.

13. Mental Model
----------------
Leaf = Does work.
Composite = Forwards work.
Client = Doesn't care.

Think of Composite as:
"A folder that behaves like a file."

===========================


```
           <<interface>>
           MenuComponent
           ----------------
           + getPrice()
           + prepare()
           + show()
                  ▲
        implements│
      ┌───────────┴───────────┐
      │                       │
Burger                  ComboMeal
   ----------------         ----------------
- name                  - name
- price                 - items : List<MenuComponent>
                        + add()
                        + remove()

ComboMeal ◆─────── MenuComponent
(Client) ───────▶ MenuComponent
```