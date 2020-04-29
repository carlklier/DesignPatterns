The builder pattern lets you create complex objects step by step, using only the steps that you really need. It allows you to produce different types and representations of an object using the same construction code. 

If you see your code using a ton of parameters to determine what apects of the object to create, you could benefit from the builder pattern. 

The builder pattern suggests that you extract the object construction code out of its own class and move it to separate objects called builders.

The director class defines the order in which to execute the building steps, while the builder provides the implementation for those steps. 

The builder pattern doesn't expose the unfinished product while running construction steps. This prevents the client code from fetching an incomplete result. 

Use the builder pattern to get rid of telescopic constructors.
Use the builder pattern when you want your code to be able to create different representations of the same product.

The builder pattern lets you run some additional construction steps before fetching the final product whereas the Abstract Factory pattern immediately returns the final product. 

Pros:
You can construct objects step by step, defer construction steps, and run steps recursively.
You can reuse the same construction code when building various representations of products.
Single Responsibility Principle - You can isolate complex construction code from the business logic of the product. 
Cons:
The complexity of the code increases since the pattern requires creating new classes. 