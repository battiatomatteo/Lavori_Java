import java.util.Random;

public class es_14 {

	public static void main(String[] args) {
		int c;
		float n, media, n_max;
		
		c = 0;
		media = 0;
		n_max = 1;
		
		Random rand = new Random();
		
		System.out.println("I 5 numeri generati sono: ");
		while (c != 5) {
			c = c + 1;
			n = rand.nextFloat()*n_max + 0;
			System.out.println(n);
			media = media + n;
			
		}
		System.out.print("La media dei cinque nuemeri è "+ media);
	}

}