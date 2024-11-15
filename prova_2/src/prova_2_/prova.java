package prova_2_;

import java.util.Scanner;

public class prova {
	public static void main (String[] args) {
		//struct scanner -> come la malloc in c 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ciao, come ti chiami ?");
		//.nextLine() per le stringhe - .nextInt() per gli interi 
		String nome = scanner.nextLine();  //chiamata di metodo
		System.out.println("Ciao "+ nome);
	}
}
