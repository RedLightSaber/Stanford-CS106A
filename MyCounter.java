/**
 * File: MyCounter.java
 * Creates 
 */

/**
 * @author amandaneumann
 *
 */
public class MyCounter {

	/**
	 * 
	 */
	public MyCounter(int startValue) {
		// TODO Auto-generated constructor stub
		counter = startValue;
		
	}
	// Paramater is no 
	public MyCounter() {
		counter = 1;
	}
	
 	/**
	 * @param args
	 */
	
	public int nextValue() {
		int temp = counter;
		counter++;
		return temp;
	}
	private int counter;
	

}
