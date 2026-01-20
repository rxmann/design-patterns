# FACADE DESIGN PATTERN

---

## 1. GoF Motivation
* Provide a unified interface to a set of interfaces in a subsystem.
* Defines a higher-level interface that makes the subsystem easier to use.
* Acts as a "front-facing" entry point to mask complex underlying code.

## 2. Core Idea (One-liner)
* A simplified "front door" to a complex house of classes.
* Having a facade is handy when you need to integrate your app with a sophisticated library that has dozens of features, but you just need a tiny bit of its functionality.
* 

## 3. Problem It Solves
* **Complexity:** Clients shouldn't need to understand 10+ classes to perform one task.
* **Tight Coupling:** Prevents the client from depending on every internal part of a library.
* **API Bloat:** Hides methods that are only needed for internal subsystem logic.

## 4. Structure
* **Facade:** The "wrapper" class that coordinates subsystem calls.
* **Subsystem Classes:** The complex classes that do the work (they don't know the Facade exists).
* **Client:** Interacts only with the Facade.

## 5. Relation with Other Patterns
* **Adapter:** Changes an interface to match a client; **Facade** simplifies an interface.
* **Abstract Factory:** Can be used to hide the creation of subsystem objects inside the Facade.
* **Singleton:** Facades are often implemented as Singletons since one entry point is usually sufficient.

## 6. When to Use
* **Use when:** You need a simple interface to a complex framework or library.
* **Use when:** You want to layer your system (e.g., a "Service Layer" acting as a Facade).
* **Do NOT use when:** You only have 1 or 2 classes (it becomes redundant/overhead).

## 7. SOLID Principles
* **SRP:** The Facade handles the coordination, keeping the client code clean.
* **OCP:** You can add new Facades for different use cases without modifying the subsystem.
* **Principle of Least Knowledge (Law of Demeter):** The client only "talks" to the Facade, not "strangers" (subsystems).

## 8. Pros
* Isolates clients from subsystem components.
* Promotes weak coupling.
* Makes the system easier to learn and use.

## 9. Cons
* **Risk of "God Object":** A Facade can become a bloated class if it tries to do too much.
* **Restrictive:** Advanced users might lose access to specific subsystem power/features.

## 10. Design Considerations (Step-wise)
1. Identify a complex sequence of operations used frequently.
2. Create a Facade class that encapsulates these operations.
3. Inject the subsystem objects into the Facade.
4. Expose one simple method that triggers the complex sequence.

## 11. Common Real-world Examples
* **Home Theater:** `theater.watchMovie()` handles TV, Sound, and Lights simultaneously.
* **Banking:** `atm.withdraw()` handles Pin Check, Account Validation, and Ledger Updates.
* **Compilers:** A single `compile()` method hiding Lexers, Parsers, and Code Generators.

## 12. Key Interview Distinction
* **Facade** = Simplification (ease of use).
* **Adapter** = Compatibility (matching interfaces).
* **Proxy** = Control (adding security, logging, or lazy loading).