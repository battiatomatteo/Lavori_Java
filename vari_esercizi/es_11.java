import java.util.Scanner;

public class es_11 
{
    public static void main(String args[])
    {
        Scanner Input = new Scanner(System.in); 

        int num1 = Input.nextInt();
        float resto = num1 % 2;

        if (resto == 0)
        {
            System.out.println("Il numero è Pari.");
        }
        else
        {
            System.out.println("Il numero è dispari.");
        }
        
        
    }    
}
