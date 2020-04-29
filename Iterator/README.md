The iterator design pattern lets you traverse elements of a collection without exposing its underlying representation. The iterator pattern extrats the traversal behavior of a collection into a separate object called an iterator. 

The iterator interface declares the operations for traversing a collection.
The iterator objects should track the traversal progress on their own. This allows several iterators to traverse the same collection at the same time. 

The iterator encapsulates the details of working with a complex data structure, providing the client with several simple methods of accessing the collection elements. 

Use the iterator pattern when your collection has a complex data structure under the hood, but you want to hide its complexity from clients.
Use the iterator patten when you want your code to be able to traverse different data structures or when the types of these structures are unknown beforehand. Given that your code uses the generic interfaces for collections and iterators, code will still work if you pass it various kinds of collections and iterators that implement these interfaces. 

Pros:
Single Responsibility Principle - You can clean up the client code and the collections code by extracting the traversal algorithms into separate classes.
Open/Closed Principle - You can implement new types of collections and iterators and pass them to existing code without breaking anything. 
You can iterate over the same collection in paralle because each iterator object contains its own iteration state.
You can delay an iteration and continue when needed since each iterator object contains its own iteration state. 
Cons:
Applying the pattern can be overkill if your app only works with simple collections.
Using an iterator may be less efficient than going through the elements of some specialized collections directly. 