package esercitazione;

import java.util.Scanner;

public class es_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s ;
		Boolean ris = true;

		//determinare se la frase è palindroma (es: "Ai lati d'Italia", oppure "Angolo bar a Bologna")
		System.out.println("Inserire una frase: ");
		s = scanner.nextLine();
		s = s.replace(" ", "");   // remove all the space in the string 
		for(int sx = 0, dx = s.length()-1; sx < dx && ris; sx++, dx--) {
			if(s.charAt(sx) != s.charAt(dx)) 
				ris = false;
		}

		if(ris) System.out.println(s + " è palindroma");
		else System.out.println(s + " non è palindroma");
	}
		
}
