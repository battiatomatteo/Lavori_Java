/**
 * 
 */
package lez_14_11_2024;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// classe Integer --> contiene un intero int 
		
		Pair<String, Integer > p = new Pair<String, Integer>
			("bravissimo", 42);
		
		String f = p.getFirst();
		Integer s = p.getSecond();
		
		System.out.println(f);
		System.out.println(s);

	}

}

