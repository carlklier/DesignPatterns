The prototype pattern lets you copy existing objects without making your code dependent on their classes.

The problem the prototype pattern solves is that some classes can't be copied by going though the object's fields and copying the state to a new object since those fields may be private and not visible from outside the object itself. Also, your code to copy an object becomes dependent on the object class. This can be a problem since sometimes you only know the interface of the object but not its concrete class. 

The prototype pattern delegates the cloning process to the actual objects that are being cloned.
The pattern declares a common interface for all objects that support cloning, usually just a clone() method.

Pre-built prototypes can be an alternative to subclassing. You create a set of objects that are configured in various ways. When you need an object like the on you configured, you clone a prototype instead of constructing a new object from scratch. 

Use the prototype pattern when your code shouldn't depend on the concrete classes of objects that you need to copy. The interface for cloning objects makes the client code independent from the concrete classes of objects that it clones.

Use the prototype pattern when you want to reduce the number of subclasses that only differ in the way they intialize their respective objects. These subclasses could just have been created to create objects with specific configuration.

Prototype isn't based on inheritance, so it doesn't have those drawbacks. But it requires a complicated initialization of the clone object. Factory Method is based on inheritance but doesn't require an initialization step.

Prototype could be a simpler alternative to Memento pattern. This is the case if the object state which you want to store in history is simple/straightforward and doesn't have links to external resources, or the linkes are easy to re-establish. 

Pros:
You can clone objects without coupling to their concrete classes.
You can get rid of repeated initiailization code in favor of cloning pre-built prototypes.
You can produce complex objects more conveniently.
You get an alternative inheritance when dealing with configuration presets for complex objects.
Cons:
Cloning complex objects that have circular references might be very tricky.

