/**
 * 
 */
package proxy;

/**
 *
 * @author Diana Yamaletdinova
 * Jan 28, 2017
 */
public class LogProxy <T> extends Proxy<T> implements Thing <T> {

	Thing<T> aThing;
	
	public LogProxy(Thing<T> aThing) {
		super(aThing);
	}
	
	
	public void compute(T name) {
		log("Enter: Compute");
		super.compute(name);
		log("Exit: Compute");
	}


	@Override
	public void log(String str) {
		System.out.println(str);			
	}


}
