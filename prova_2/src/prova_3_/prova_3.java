package prova_3_;

import java.util.Scanner;

public class prova_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ciao, inserisci un numero :");
		
		int i = scanner.nextInt();
		char c = '@';
		
		for(int x = 0; x < i; x++) {
			for(int y = 0; y < i; y++) {
				if(x == 0 || y == 0 || x == i-1 || y == i-1) {
					System.out.print(c);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
/*
output: i = 10
@@@@@@@@@@
@        @
@        @
@        @
@        @
@        @
@        @
@        @
@        @
@@@@@@@@@@
*/


