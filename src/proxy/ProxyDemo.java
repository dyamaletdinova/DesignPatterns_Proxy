/**
 * 
 */
package proxy;

/**
 *
 * @author Diana Yamaletdinova
 * Jan 28, 2017
 */
public class ProxyDemo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//a)
		System.out.println("NOT proxy");
		String name = "Diana";
		Thing<String> t = new aThing(name);//aThing instance
		t.compute("Hello ");
		//System.out.println(t.getClass().getName());

		
		//b)
		System.out.println("\n\n using proxy");
		t= new LogProxy(t);
		t.compute(" Hello ");
		//System.out.println(t.getClass().getName());
		//System.out.println("\n\n______________________");
		//c)
		/*Thing t2 = new bThing("B");//aThing instance
		t2.compute(" Hello ");
		//System.out.println(" t2 " + t2.getClass().getName());

		
		//d)
		t2 = new LogProxy(t2);
		t2.compute("Hello");
		System.out.println(t2.getClass().getName());*/
		
		System.out.println("\n\n_________Using Functor_____________");
		Thing<String> t3 = new aThing(name);//aThing instance
		Functor<String> functor = new FunctorImpl<>(t3);
		functor.compute(" Hello ");


	}

}
