test update

Need to update sources/references

A place to practice basic design patterns.

Basic Object Oriented Design Principles: 
Low coupling - classes should be as independent as possible from each other so that changes to one class don't heavily impact other classes. 

High cohesion - the elements of a class should belong together. Related code should be close to teahc other. The elements of a class should all directly relate to the functionality the class is meant to provide.

Law of Demeter - a specific case of loose coupling. Each class should have only limited knowledge of other classes and only interact with its immediate friends. Long chains of method calls mean there is a large amount of coupling between classes.

The Law of Demeter says that a class should only send messages to
1.	this object itself
2.	this object’s instance variables
3.	the method’s parameters
4.	any object the method creates
5.	any object returned by a call to one of this object’s methods
6.	the objects in any collection that falls into these categories

It should not send messages to objects that are returned by calls to other objects.


SOLID Principles: 

Open/Closed principle - Software entities like classes should be open for extension but closed for modification. An entity can allow its behavior to be extended without modifying the source code.

The Open/Closed Principle uses interfaces instead of superclasses to allow different implementations which you can easily substitute without changing the code that uses them. The interfaces are closed for modifications, and you can provide new implementations to extend the functionality of the software. Interfaces enable loose coupling. 

Dependency Inversion principle - High level classes should be easily reusable and unaffected by changes in low-level classes. To achieve this, you need to use an abstraction that decouples the high-level and low-level classes from each other. 

1. High-level modules should not depend on low-level modules. Both should depend on abstractions.
2. Abstractions should not depend on details. Details should depend on abstractions. 

Single responsibility principle - A class should have one, and only one, reason to change. Each class should have only one responsibility. This makes classes easier to understand and implement

Loskov substitution principle - Objects of a superclass should be replacable with objects of its subclasses without breaking the application. This requires objects of subclasses to behave in the same way as objects of the superclass. 

An overridden method of a subclass needs to accept the same input parameter values as the method of the superclass. You can implement less restrictive validation rules, but can't enforce stricter rules in your subclass. 

The return value of a method of the subclass needs to comply with the same rules as the return value of the method of the superclass. You can only decide to apply stricture rules by returning a specific subclass of the defined return value or by returing a subset of the valid return values of the superclass.

Interface Segregation principle - clients should not be forced to depend on interfaces they do not use.

The goal of the interface segregation principle is to reduce the side effects and frequency of required changes by splitting the software into multiple, independent parts. 

If you have a class that implements an interface but doesn't use one of the methods so you set that method to throw an Unsupported Method exception, that is a violation of the interface segregation principle. 
