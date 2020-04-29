An example where you have a certain type of math problem you need help on : algebra, calculus, geometry, linear algebra
You start with the algebra teacher (who might be able to solve your problem) and progress up the list of math teachers until someone can solve your problem

The chain of responsibility patern lets you pass requests along a chain of handler. Upon receiving the request, each handler decides wither to process the request or to pass it along the chain to the next handler to see if they can process the request. 

The chain of responsibility relies on transforming particular behaviors into stand-alone objects called handlers. Each check is made into its own class and has a method that performs the check. The request and its data is passed to this method as an argument. 

Each handler class implements the same interface.

The chain of responsibility pattern is used when your program is expected to process different kinds of requests in various ways, but the exact types of requests and their sequences are unknown beforehand.
Use the pattern when it is necessary to execute several handlers in a particular order.
Use the pattern when the set of handlers and thier order are suppossed to change at runtime.

Pros:
You control the order of request handling.
Single Responsibility Principle - You can decouple classes that invoke operations from classes that perform operations.
Open/Closed Principle - You can introduce new handlers into the app without breaking existing client code.
Cons:
Some requests may end up not being handled. 