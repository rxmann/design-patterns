# State Design Pattern

## 1. GoF Motivation
* **Dynamic Behavior:** Allows an object to alter its behavior when its internal state changes.
* **Clean Code:** Eliminates large, messy conditional statements (`if/else` or `switch`) based on state.
* **Encapsulation:** Packages state-specific behavior into separate, dedicated classes.
* **Polymorphism:** The object appears to "change its class" at runtime.

## 2. Similar Design Patterns
* **Strategy Pattern:** Shares a similar structure but focuses on interchangeable algorithms rather than state transitions.
* **Composition:** State objects are composed inside a **Context** (HAS-A relationship).
* **Delegation:** The Context delegates work to helper state objects (wrapper-like delegation).

## 3. Relation with Strategy Pattern
* **Extension:** State is essentially an extension of the Strategy pattern.
* **Delegation:** The Context changes its behavior by delegating work to the currently active state object.
* **Internal Switching:** Unlike Strategy, State objects can decide and trigger the next state transition internally.

## 4. Key Difference: State vs. Strategy
| Feature | Strategy | State |
| :--- | :--- | :--- |
| **Selection** | The **Client** usually selects the strategy. | Transitions happen **automatically** inside the context or state classes. |
| **Focus** | Swapping algorithms. | Swapping behavior based on internal status. |

## 5. Why Singleton for States?
* **Efficiency:** State objects are often stateless (carrying no instance variables) and highly reusable.
* **Memory Management:** Only one instance is needed, reducing memory overhead.
* **Consistency:** Ensures consistent behavior across different contexts using the same state.

## 6. When to Use (and When Not to)
### Use when:
* Object behavior depends heavily on its current state.
* You find yourself writing deep conditional branches based on state variables.
* State transitions are well-defined and complex.

### Do NOT use when:
* You only have a few states with very simple logic.
* The state does not significantly affect the object's behavior.
* It would be overengineering for a small, straightforward problem.

## 7. Pros
* **Decoupling:** Removes complex conditional logic from the main class.
* **Maintainability:** Improves readability and makes debugging easier.
* **SRP:** Each state class follows the **Single Responsibility Principle**.
* **Open/Closed Principle:** Easy to add new states without modifying existing code.

## 8. Cons
* **Class Explosion:** Significantly increases the number of classes in your project.
* **Complexity:** State transition logic can become scattered across multiple classes if not managed well.
* **Overkill:** Can be unnecessarily complex for simple state machines.

---

## 9. Design Considerations (Step-wise)
1.  **Identify** all possible states of the object.
2.  **Define** a common **State Interface** or abstract class.
3.  **Implement** concrete state classes for each identified state.
4.  **Move** state-specific behavior out of the main class and into these state classes.
5.  **Maintain** a reference to the "Current State" within the **Context** class.
6.  **Delegate** behavior calls from the Context to the current State object.
7.  **Transition:** Allow state objects (or the Context) to update the current state reference.