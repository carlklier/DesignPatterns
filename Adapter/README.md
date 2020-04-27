The adapter pattern is used to convert an interface of a class into another interface the client expects.
The adapter pattern makes two existing incompatible interfaces work together. 
In this example, the client expects to be able to call methods of the AUXPlayable interface, specifically the playThroughAux method. The LightningToAUX Adapter converts the LightningPlayable interface into the AUXPlayable interface.
Since the NewIphone is unable to play music through AUX like the client expects, we use an adapter to implement the interface the client expects (playThroughAUX) and wrap a call to a method (playThroughLightning) in an interface which is incompatible with the client. 