/**
 * 
 */
package lez_14_11_2024;

import java.util.Date;
import java.util.Random;

/**
 * 
 */
public class MainNull {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = null;
		
		Random random = new Random();
		switch (random.nextInt(4)) {
			case 0 : s = "ciao"; break;
			case 1 : s = "hello"; break;
			case 2 : s = "bonjour"; break;
			default: s = " "; break;		
		}
		System.out.println("s è lungo " + s.length());
		
		
		/*
		Date d ;
		Random random2 = new Random();
		switch (random2.nextInt(4)) {
			case 0 : d = new ItalianDate(14, 11, 2024);break;
			case 1 : d =  new AmericanDate(14, 11, 2024); break;
			case 2 : d=  new ItalianDate(14, 11, 2024); break;
		}*/
		
	}

}
