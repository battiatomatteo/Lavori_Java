import java.util.Random;

public class es_13 
{
	public static void main(String[] args) 
    {
		int n1, n2;		
		Random rand = new Random();
		
		n1 = rand.nextInt(49);
		n2 = rand.nextInt(49);
		
		if(n1 == n2) 
        {
			System.out.print("I due numeri sono uguali");
		}
		if(n1 > n2) 
        {
			System.out.print("il numero più grande è "+ n1);
		}
		else 
		{
			System.out.print("il numero più grande è "+ n2);
		}
		
	}
}