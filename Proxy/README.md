The proxy design pattern lets you provice a placeholder for antoher object. A proxy controls access to the original object, allowing you to perform something either before or after the request goes through to the original object.
In this example, we are using the Vault Proxy to ensure that the employee is authorized to access the Store Vault before request is actually sent to the Store Vault. For this example to make sense, you have to imagine that you are unable to make changes to the StoreVault class iteself. If you were able to make changes, you could just add the security checks to that class directly without using a proxy object. 
The proxy implements the same interface as the original class, so it can be passed to any client that expects the real service object.


The proxy patten can be used for lazy instantiation. If the service object is resource intensive to set up, you could create a proxy object and pass that to clients and then, when it is necessary, actually create the real service object.

You can use the proxy pattern to implement access control which is what is done in this example. 
You can use the proxy pattern for local execution of a remote service.
A proxy can be used to log requests to the service object.
You can use a proxy to cache requests to the service object.
You can use a proxy object to dismiss a heavyweight object once there are no clients using it. The proxy can keep track of clients that obtained a reference to the service object. Then at a certain time, the proxy can check if the clients are still active. If no clients are using the service object, the resources can be freed up. 

Pros:
You can control the service object without clients knowing about it.
You can manage the lifecycle of the service object when clients don't care about it.
The proxy works even if the service object isn't ready or available.
Open/Closed principle - You can introduce new proxies without changing the service or the clients. 
Cons:
The code may become more complicated since you introduce more classes. 
The response from the service might be delayed. 