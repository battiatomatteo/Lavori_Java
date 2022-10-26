
import java.util.Scanner;

public class es_10 {

	public static void main(String[] args) 
    {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Inserisci il tuo nome: ");
		String nome = scan.nextLine(); 
		
		System.out.println("Inserisci il tuo nome: ");
		String cognome = scan.nextLine();
        
        System.out.println("Ti chiami "+ nome +" "+ cognome);
	}

}