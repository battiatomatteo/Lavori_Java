/**
 * 
 */
package lez_14_11_2024;

import java.util.Scanner;

/**
 * 
 */
public class ReadString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		boolean done = false;

		do {
			System.out.println("inserire una stringa : ");
			String s = scanner.nextLine();

			try {
				int i = Integer.parseInt(s);
				System.out.println("L'utente ha  inserito : " + i);
				done = true;
			}
			catch(NumberFormatException e ) { // volendo si possono mettere alrte catch
				System.out.println("Devi inserire una stringa traducibile in int");
			}
		}while(!done);

		System.out.println("fine");

	}
	

}
