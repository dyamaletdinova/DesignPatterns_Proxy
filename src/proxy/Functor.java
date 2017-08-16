/**
 * 
 */
package proxy;

/**
 *
 * @author Diana Yamaletdinova
 * Jan 28, 2017
 */
public interface Functor <T>{
	public void compute(T element);
	public void log(String str);
}
