Strategies: HideStrategy, AttackStrategy
Context class: Situtation

You use the strategy pattern when you want to use differnt algorithms with an object and be able to switch between algorithms at runtime.
You can use this pattern to isolate the business logic of a class from the implementation details of the algorithms. 

Pros:
You can swap algorithms used inside the context object at runtime.
You can isolate the implementation details of an algorithm from the code that uses it.
You can replace inheritance with composition.
Open/Closed Principle - You can introduce new strategies without having to change the context.
Cons:
Additional complexity. 
You could use anonymous functions to implement different versions of an algorithm and this would save you from having to create extra classes and interfaces. 