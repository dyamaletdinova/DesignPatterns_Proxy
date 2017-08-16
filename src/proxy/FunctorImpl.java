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
public class FunctorImpl<T> implements Functor<T>{
	Thing<T> aThing;

	public FunctorImpl(Thing<T> aThing) {
		this.aThing = aThing;
	}

	@Override
	public void compute(T name) {
		log("Enter: Compute");
		aThing.compute(name);
		log("Exit: Compute");
	}

	@Override
	public void log(String str) {
		System.out.println(str);		
	}





}
