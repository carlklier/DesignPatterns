The memento pattern lets you save and restore the previous state of an object without revealing the details of its implementation. 

You can use the memento pattern to implement an undo feature when you don't want outside object peeking into the internal fields of the object you want to save state for. The memento pattern also solves the problem of having to change the class responsible for copying the state of the object everytime the object is modified.

The memento pattern delegates creating the state snapshots to the actual owner of that state, the originator object. 

Mementos can be stored inside Caretaker objects. Since caretakers only work with mementos via a limited interface, they can't tamper with the snapshot data. 

You can implement the memento pattern in three ways:
1. with nested classes
2. with an intermediate interface
3. with even stricter encapsulation

You use the memento pattern whn you want to produce snapshots of an object's state to be able to restore a previous state at a later point in time. 
You use the memento pattern when direct access to the object's fields/getters/setters violates its encapsulation. 

Pros:
You can produce snapshots of the object's state without violating its encapsulation.
You can simplify the originator's code by letting the caretaker maintain the history of the originator's state.
Cons:
The app might consume a lot of RAM if the clients create mementos too often.
Caretakers should track the originator's lifecycle to delete obsolete mementos.
Most dynamic programming languages can't guarantee that the state within a memento stays untouched.  