package adapter;

import java.rmi.UnexpectedException;
import java.util.List;

import adapter.factory.UserAdapterFactory;
import adapter.target.UserParser;

// Motivation: Convert the interface of a class into another interface clients expect.
// Adapter lets the classes work together that could not otherwise
// because of incompatible interface

// Bridge, State and Strategy are composotion based pattern that delegates the work to the other objects
// Adapter is one of them 
// Adapter provides a different interface to the wrapped object.
// Proxy provides the exact same interface and Decorator enhances an exisiting interface

// When to use one ?
// When exisiting class or contract that we would like to reuse exists
// but the interface is not compatible with the rest of the code

// SOLID: SRP, OCP

// Design Consideration
// 1. Identify the service : adaptee class that you want to create an adapter for
// 2. Declare the client interface and define how clients will communicate with the service
// 3. Define the adapter class by implementing the client interface. Leave methods stubbed: empty.
// 4. Add private field to the adapter class to store a reference to the Adaptee object.
// 5. Implement each of the methods of the client interface in the adapter class. The adapter should delegate most of the actual work to the adaptee service object, handling only the interface or data format conversion.

public class AdapterClient {

    public static void main(String[] args) throws UnexpectedException {

        UserParser parser = UserAdapterFactory.getUserParser("CSV");
        List<User> users = parser.parseUsers();

        users.stream().forEach(System.out::println);

    }

}

