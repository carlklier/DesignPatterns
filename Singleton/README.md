The goal of the singleton pattern is to ensure a class only has one instance at any given time and to provide a way to access that single instance.
Makes use of lazy instantiation - wait to create the object until the first time it is needed.
Initialization code is encapsulated in a public static method.
Uses a private method to define a constructor. 
A singleton is pretty much just a global variable. 

In this example, there is only one instance of a streaming account shared among family members. This streaming account maintains a list of the watched content. When multiple movie watchers want to use the streaming account, we use the singleton pattern to ensure that each watcher uses the same account and their movies are added to the watchlist of that single streaming account. We print out the identity hash code to ensure we are manipulating the same streaming account. 

Pros:
You can be sure the class only has a single instance.
The singleton instance is only initialized when it is needed for the first time.
Cons:
Violates Single Responsibility Principle - the singleton class has two responsibilities: makeing sure there is only one instance and the core functionality of the class.
Often difficult to unit test with mocks.
The singlton pattern needs to be handled differently in a multithreaded environment so that multiple threads won't create a singlton object more than once. 