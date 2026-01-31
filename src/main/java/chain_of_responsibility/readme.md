# CHAIN OF RESPONSIBILITY (CoR) DESIGN PATTERN

## 1. GoF Motivation
* **Decouple** the sender of a request from its receivers.
* Give **multiple objects** a chance to handle the request.
* Chain the receiving objects and pass the request along until an object handles it.

## 2. Core Idea (One-liner)
> **"Pass the hot potato"** — A request travels down a line of handlers; each one either processes it and stops the chain, or passes it to the next link.

---

## 3. Problem It Solves
* **Spaghetti Code:** Eliminates massive `if-else` or `switch` blocks used to determine request handling.
* **Tight Coupling:** The sender doesn't need to know the specific class or hierarchy of the receiver.
* **Rigid Pipelines:** Allows you to change the order or composition of handlers at runtime without touching the sender.

## 4. Structure
1. **Handler (Interface/Abstract):** Defines the `handle()` method and usually holds a reference to the `next` handler.
2. **Concrete Handlers:** Contains the actual logic. If it can't handle the request, it calls `next.handle()`.
3. **Client:** Configures the chain (links the objects) and kicks off the process by calling the first handler.

---

## 5. Relation with Other Patterns
* **Decorator:** Both have recursive structures. **Decorator** adds responsibilities (everyone works), while **CoR** handles requests (usually only one works).
* **Command:** Often used together; the "request" being passed through the chain can be a Command object.
* **Facade:** A Facade can provide a simple entry point to a complex CoR chain.
* **Mediator:** CoR passes the request sequentially; Mediator centralizes communication in a "hub."

## 6. When to Use
* **YES:** When more than one object can handle a request, and the handler isn't known a priori.
* **YES:** When you want to issue a request to one of several objects without specifying the receiver explicitly.
* **NO:** When only one specific object should ever handle a request (just use a direct call).
* **NO:** When every handler in the chain *must* execute (use **Decorator**).

---

## 7. SOLID Principles
* **SRP (Single Responsibility):** Each class handles one specific type of check or logic.
* **OCP (Open/Closed):** You can add new handlers to the system without breaking existing code.
* **DIP (Dependency Inversion):** Clients and handlers depend on the `Handler` interface, not concrete implementations.

## 8. Pros & Cons
| Pros | Cons |
| :--- | :--- |
| Reduced coupling between sender/receiver. | Request may reach the end and stay unhandled. |
| **Flexibility:** Can reorder the chain at runtime. | Can be difficult to debug (no clear call stack). |
| Follows Single Responsibility Principle. | Performance overhead if the chain is excessively long. |

---

## 9. Common Real-world Examples
* **Java Servlet Filters:** `FilterChain.doFilter()` is the classic implementation.
* **Logging Frameworks:** Deciding whether to log to File, Console, or Cloud based on severity level.
* **Spring Security:** Authentication/Authorization filter chains.
* **UI Events:** JavaScript/Android event bubbling (Button -> Layout -> Activity).

## 10. Key Interview Distinctions
* **CoR vs. Decorator:** CoR is "one of many" (stops when handled); Decorator is "all of many" (wraps and adds).
* **CoR vs. Strategy:** Strategy is about *how* to do something (swapping algorithms); CoR is about *who* does it.

---

## 11. Java Boilerplate (Quick Reference)

```java
public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle(String request) {
        if (canHandle(request)) {
            process(request);
        } else if (next != null) {
            next.handle(request);
        }
    }

    protected abstract boolean canHandle(String request);
    protected abstract void process(String request);
}
