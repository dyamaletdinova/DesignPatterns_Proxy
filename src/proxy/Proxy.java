/**
 * 
 */
package proxy;

/**
 *
 * @author Diana Yamaletdinova
 * Jan 28, 2017
 * @param <T>
 */
public abstract class Proxy<T> {
	Thing<T> aThing;
	
	public Proxy(Thing<T> aThing) {
		this.aThing = aThing;
	}
	
	abstract void log(String str);
	
	public void compute (T s){
		log("X");
		aThing.compute(s);
		log("X");
	}
}
