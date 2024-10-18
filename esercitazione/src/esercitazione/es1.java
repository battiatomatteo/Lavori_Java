package esercitazione;
import java.util.Scanner;

public class es1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = -1, resto;
		String risultato = "";
		Scanner scanner = new Scanner(System.in);
		//inserimento e controllo 
		do {
			System.out.println("inserire un numero non negativo: ");
			i = scanner.nextInt();
		}while(i < 0);
		
		//stringa e convrsione a binario 
		
		do{
			resto = i%2;
			risultato = resto + risultato;
			i/=2;
		}while(i > 0 );
		
		System.out.println("output : " + risultato);
	}

}
