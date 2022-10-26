import java.util.Scanner;

public class es_12    
{
    public static void main(String args[])
    {
        Scanner Input = new Scanner(System.in); 

        int l1 = Input.nextInt();
        int area = l1*l1;
        int perimetro = l1*4;
        System.out.println("L'area del quadrato è di "+ area);
        System.out.println("Il perimetro del quadrato è di "+ perimetro);
    }

}
