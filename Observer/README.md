Subject: Child
Observer: Parent
What is being observed: The child's health status.

The observer pattern lets you create a mechanism to notify objects about events that happen to other objects they are observing. 
You can use the observer pattern when changes to the state of one object require chaning other objects, and the actual set of objects is unknown beforehand or changes dynamically. 

Pros: 
Open/Closed Principle - You can introduce new observer classes without having to change the subject's code, and vice versa if there's a subject interface.
You can establish relations between objects at runtime
Cons:
Hard to identify/distinguish individual observers of a subject from within a Subject class.