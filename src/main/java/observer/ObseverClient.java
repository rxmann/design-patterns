package observer;

// MOTIVATION: Observer Pattern is used when there is one-to-many relationship between objects such as if one object is modified, its dependent objects are to be notified automatically
// Similar Design Patterns: Chain of Responsibility, Command, Mediator
// Chain of Responsibililty: Behavioral Pattern that allows passing request along the sequence of potential handlers until one of them handles the request
// Command is to establish a unidirectional communication between sender and receiver
// Mediator: also known as controller, removes the direct connections between senders and receivers, forcing them to communicate indirectly via a mediator/controller object

// Use Cases:
// 1. Changes in one object need to be reflected in others without tight coupling
// 2. When an object needs to notify multiple dependent objects about state changes
// NOT when order of the notification is important

// PROS:
// 1. Loose Coupling: New subscribers implementation can be added without having to change the publisher's code. Open Close Principle.
// 2. Can establish dynamic relationships between objects at runtime
// 3. A key to reactive behavior in systems
// CONS:
// 1. Memory Leaks: If observers are not properly unsubscribed, it can l
// 2. Order of notifications is not guaranteed
// 3. Debugging Complexity: Can make debugging more difficult due to indirect relationships

// Design Considerations:
// 1. Look for elements in the business logic that needs to be aware of state changes and classify them to 2 parts :
// 1.1. The controller/receiver of the events will be a publisher/subject.
// 1.2. The components that need to be aware of those changes will be subscribers/observers.
// 2. Declare the subcriber interface with update and notify methods init.
// 3. Declare the publisher interface with contract to add and remove the subscirbers.
// 4. Create an abstract Publisher implementation with mechanism for subscriber management and notification dispatching.
// 5. Identify the state data that needs to be observed and create concrete Publisher implementaton for that state. Define a way for the subscribers to get access to the state.
// 6. Create concrete Subscriber implementations that will react to the state changes in the publisher.

public class ObseverClient {

    public static void main(String[] args) {

    }

}
