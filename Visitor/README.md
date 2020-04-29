The visitor pattern lets you separate algorithms from the objects on which they operate.
The visitor pattern says to place new behavior into a separate class called Visitor instead of trying to integrate the new behavior into the existing class.

If the visitor class defines a set of methods, each of which take arguments of different types, then we can't use polymorphism to call the correct method. To pick a proper visitor method to process the given object, we would need to check its class. We can't use method overloading because not every language supports it and since the exact class of a node object is unknown in advance, the overloading mechanism won't be able to determine the right method to run. It will just detault to the method that takes the base object class. 

The visitor pattern solves this problem by using a technique called double dispatch. Instead of letting the client select a proper version of the method to call, the decision is delegated to the object itself that gets passed to the visitor as an argument. This is the accept(Visitor v) method.

If we extract a common interface for visitors, existing nodes can work with any visitor you introduce so new behavior can just be introduced as a new visitor class. 

Use the visitor pattern when you need to perform an operation on all elements of a complex object structure.
Use the visitor pattern to clean up the business logic of auxiliary behavior. Primary classes can be more focused on their main job.
Use the pattern when a behavior makes sense only in some classes of a class hierarchy, but not in others.

Pros:
Open/Closed Principle - You can introduce a new behavior that can work with objects of different classes without changing these classes.
Single Responsibility Principle - You can move multiple versions of the same behavior into the same class.
A visitor object can accumulate some useful information while working with various objects. This might be handy when you want to traverse some complex object structure, such as an object tree, and apply the visitor to each object of this structure.
Cons:
You need to update all visitors each time a class gets added to or removed from the element hierarchy.
Visitors might lack the necessary access to the private fields and methods of the elements they are suppossed to work with.  