/**
 * 
 */
package proxy;

/**
 *
 * @author Diana Yamaletdinova
 * Jan 28, 2017
 */
public class bThing implements Thing<String>{
	String s = "";
	public bThing(String s){
		this.s = s;
	}
	@Override
	public void compute(String name) {
		System.out.println(name + s);
	}

}
