
import java.util.Scanner;

public class es_5 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c=1;
		System.out.println("inserire un numero intero positivo");
		a = scan.nextInt();
		scan.close();
		for(b=a; b!=0; b--) {
			c = c * b;
			
		}
		System.out.println(c);
	}

}