# Design-Patterns
Design patterns represent the best practices used by experienced object-oriented software developers. Design patterns are solutions to general problems that software developers faced during software development. These solutions were obtained by trial and error by numerous software developers over quite a substantial period of time.

These authors are collectively known as Gang of Four (GOF). According to these authors design patterns are primarily based on the following principles of object orientated design.

Program to an interface not an implementation

Favor object composition over inheritance

## Types of Design Patterns

## Creational Patterns
These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator. This gives program more flexibility in deciding which objects need to be created for a given use case.

## Structural Patterns
These design patterns concern class and object composition. Concept of inheritance is used to compose interfaces and define ways to compose objects to obtain new functionalities.

## Behavioral Patterns
These design patterns are specifically concerned with communication between objects.

## J2EE Patterns
These design patterns are specifically concerned with the presentation tier. These patterns are identified by Sun Java Center.

## Dive Into Creational Patterns
### Singleton Design Pattern

Creating a class with a method that creates a new instance of the class if one does not exist. 

If an instance already exists, it simply returns a reference to that object. 

To make sure that the object cannot be instantiated any other way, the constructor is made private.

Example: Simple Login Module 

### Factory Design Pattern

Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

Example: OS differs for Android, IOS & Windows (Object Creation without exposing the logic)

### Builder Design Pattern

Builder pattern builds a complex object using simple objects and uses step by step approach.
A Builder class builds the final object step by step. This builder is independent of other objects.

Example : Coco Cola, Mobile Phone

Tips: 
Use this pattern when there is multiple parameters in the constructor.

## Dive Into Structural Patterns
### Adapter Design Pattern

The adapter pattern converts the interface of a class into another interface the clients expects.
Adapter allows to reuse existing coding without changing it, as the adapter ensures the conversion between the different interfaces.

Example:
- Yashwanth is having iPhone 8 he needs a charger to charge it but he have iPhone 5 charger with him given by his friend.
- Pen, Pilot Pen (Yashwanth having Pen doesn't work, so he get Pilot Pen from his friend)

Tips: 
Provide an Adapter between two different classes or interfaces
