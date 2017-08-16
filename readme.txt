To implement the Proxy pattern:

- created generic Thing thus its children can implement String or other data

***Template method*** using inheritance
- created a generic <abstract> Proxy class, with the template method compute and abstract log specific methods 
- logProxy implements Proxy and overrides the specific log methods. 
	That way any proxy class that extends Proxy will be able to provide its own implementation to log methods

*** Template Functor Method *** using composition
- create a generic Functor with compute method
- Implement Functor Interface and provided implementation for the compute and log messages

in the main:
 used the instance of the Functor to call the compute method
 		Functor<String> functor = new FunctorImpl<>(t3);
		functor.compute(" Hello ");