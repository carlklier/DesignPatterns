Commands: OrderPizzaCommand, OrderPastaCommand
Receivers: CheapChainRestaurant, FancyItalianRestaurant
Client: UberEatsApp

The command pattern encapsulates a request as an object. This allows you to parameterize methods with different requests, queue a request's execution, and support undoable operations. 
It is used when you need to issue requests to objects without knowing about the operation being requested or the receiver of the request.
It decouples the object that invokes the operation (the UberEatsApp) from the one that knows how to perform it (the Restaurant). 
In this example, the client UberEatsApp issues requests to receivers (Restaurants) to start cooking food when an item (Command) is ordered (executed). 

Pros:
Single Responsibility Principle - you can decouple classes that invoke operations from classes that perform operations.
Open/Closed Principle - You can introduce new commands without breaking the client code.
You can assemble a set of simple commands into a complex one.
Cons:
The code becomes more complicated since you introduce a new layer between senders and receivers. 
