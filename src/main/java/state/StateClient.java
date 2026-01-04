package state;

/*
========================
STATE DESIGN PATTERN
========================

1. GoF Motivation
-----------------
• Allow an object to alter its behavior when its internal state changes.
• Eliminates large conditional statements (if/else or switch) based on state.
• Encapsulates state-specific behavior into separate classes.
• The object appears to change its class at runtime.

2. Similar Design Patterns
--------------------------
• Strategy: Similar structure, but focuses on interchangeable algorithms.
• State objects are composed inside Context (HAS-A relationship).
• Context delegates work to helper state objects (wrapper-like delegation).

3. Relation with Strategy Pattern
---------------------------------
• State is an extension of Strategy.
• Context changes behavior by delegating work to state objects.
• State objects can decide and switch the next state internally.

4. Key Difference: State vs Strategy
------------------------------------
• Strategy: Client selects the strategy.
• State: State transitions happen automatically inside the context.

5. Why Singleton for States?
----------------------------
• State objects are stateless and reusable.
• Only one instance needed to reduce memory usage.
• Ensures consistent behavior across contexts.

6. When to Use / When NOT to Use
--------------------------------
Use when:
• Object behavior depends heavily on its state.
• Many conditional branches exist based on state.
• State transitions are well-defined.

Do NOT use when:
• Only a few states with simple logic.
• State does not affect behavior significantly.
• Overengineering for small problems.

7. Pros
-------
• Removes complex conditional logic.
• Improves readability and maintainability.
• Each state follows Single Responsibility Principle.
• Easy to add new states without modifying existing ones (Open/Closed Principle).

8. Cons
-------
• Increases number of classes.
• State transition logic may become scattered.
• Can be overkill for simple state handling.

9. Design Considerations (Step-wise)
------------------------------------
1. Identify all possible states.
2. Create a common State interface.
3. Implement concrete state classes.
4. Move state-specific behavior into state classes.
5. Context holds a reference to current state.
6. Delegate behavior calls from Context to State.
7. Allow states to change the Context’s state.

========================
*/

public class StateClient {

}
