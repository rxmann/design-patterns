===========================
PROXY DESIGN PATTERN
===========================

1. GoF Motivation
-----------------
• Provide a surrogate or placeholder for another object.
• Control access to the real object.
• Add behavior without changing the real object.
• Hide complexity, improve performance, or add security.

Proxy represents the real object and decides:
• When to create it.
• When to forward calls.
• When to block calls.
• When to add extra logic.

2. Problem It Solves
--------------------
Direct access to objects can be expensive or unsafe:

• Creating object is slow (network, IO, heavy init).
• Access should be restricted.
• Calls need logging, caching, retry, lazy loading.
• Client should not know the difference.

Proxy sits between client and real object.

3. Core Idea
------------
• Client talks to Proxy, not Real Object.
• Proxy and Real Object share the same interface.
• Proxy controls access to the real object.
• Proxy may create the real object lazily.
• Proxy delegates calls when allowed.

Flow:

Client → Proxy → RealObject

4. Structure
------------
Subject (interface)
• Declares operations.

RealSubject
• Implements real behavior.

Proxy
• Implements same interface.
• Holds reference to RealSubject.
• Controls access and delegates.

Client
• Uses Subject interface only.

5. Participants
---------------
• Subject
- Common interface.

• RealSubject
- Actual heavy / remote / sensitive object.

• Proxy
- Controls creation and access.
- Adds logic before / after delegating.

• Client
- Works with Subject.

6. Types of Proxy
-----------------
• Virtual Proxy
- Lazy initialization.

• Protection Proxy
- Access control / auth.

• Caching Proxy
- Cache results.

• Logging Proxy
- Log calls.

• Remote Proxy
- Represent remote service.

7. Relation with Other Patterns
-------------------------------
• Decorator: Adds behavior.
• Proxy: Controls access.
• Adapter: Changes interface.
• Composite: Builds trees.

Decorator enriches.
Proxy guards.

8. When To Use / When NOT To Use
--------------------------------
Use when:
• Object creation is expensive.
• Access must be controlled.
• Calls need logging, caching, lazy loading.
• Client should not know about real complexity.

Do NOT use when:
• Object is simple.
• No access control needed.
• Extra layer is unnecessary.

9. Pros
-------
• Lazy initialization.
• Access control.
• Performance optimization.
• Separation of concerns.
• Transparent for client.

10. Cons
--------
• Extra indirection.
• More classes.
• Slight performance overhead.
• Can hide complexity too much.

11. Design Guidelines
---------------------
1. Create Subject interface.
2. Implement RealSubject.
3. Create Proxy implementing Subject.
4. Proxy holds RealSubject reference.
5. Proxy controls access and delegates.
6. Client depends only on Subject.

12. Mental Model
----------------
Real object is expensive or sensitive.
Proxy stands in front of it and decides when and how to forward calls.

Think of Proxy as:
"Gatekeeper for an object."

13. One-Line Summary
--------------------
Proxy provides a placeholder that controls access to a real object while keeping the same interface.

===========================
