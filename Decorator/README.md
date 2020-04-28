Base Layer: NakedTorso
Additonal Optional Layers: SweatshirtDecorator, JacketDecorator
Client: Dresser

The decorator pattern is used when you need to be able to assign extra behavior to objects at runtime without breaking the code that uses these objects. 
You can use the decorator pattern when it is not possible to extend an object's behavior using inheritance.
The decorator pattern enhances an object without changing its interface.

In this example, we start off with a basic naked torso and, using decorators, add additonal layers of clothing.

Pros:
You can extend an object's behavior without making a new subclass.
You can add or remove responsibilities from an object at runtime.
You can combine multiple behaviors by wrapping an object into more than one decorator.
Single Responsibility Principle - You can divide a monolithic class that implements many possible variants of behavior into several smaller classes. 
Cons:
It is difficult to remove a specific wrapper from a wrapper stack.
It's hard to implement a decorator in a way that its behavior doesn't depend on the order of the decorators stack.
The initial configuration code of layers could get ugly. 