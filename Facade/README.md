Book checked out, other copy available
Book reserved
Book requested at another library
User has pending fines

return book, calculate fines, 

reserve book, check if book is actually available, book available at another library

User interacts with a library and methods like checkout("The life of Pi", "Yann Martel")

The facade pattern provides a simplified interface to a complex set of classes and methods.
You use the Facade pattern when you want to have a limited but straightforward interface to a complex subsystem.
You can use the facade pattern when you want to structure a subsystem into layers. 
The facade pattern defines a new interface for existing objects but doesn't introduce any new functionality.
The subsystem itself is unaware of the facade. Objects within the subsystem can communicate directly. 


Pros:
You can isolate your code from the complexity of a subsystem.
Cons:
A facade can become a god object coupled to all classes of an app.