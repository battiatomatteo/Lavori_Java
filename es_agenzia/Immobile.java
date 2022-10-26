import java.util.Scanner;
import java.util.ArrayList;

public class Immobile 
{
    public Appartamento appartamento;
    public Villa villa;
    

    Scanner input = new Scanner(System.in);
    
    public void ricerca(String tipo, String indirizzo, String citta, int n_vani, int n_bagni, float superficie, float giardino,
    Appartamento appartamento,Villa villa)
    {
        System.out.println("Inserire chiave: ");
        String new_cod = input.nextLine();
        if(appartamento.cod.equals(new_cod))
        {
            System.out.println("\n"+tipo+"\n"+ "via "+ indirizzo+"\n"+citta+"\n"+superficie+" mq"+ 
        "\n"+ "Bagni: "+n_bagni+ "\n"+ "Vani: "+ n_vani);
        }
        else if(villa.cod.equals(new_cod))
        {
            System.out.println("\n"+tipo+"\n"+ "via "+ indirizzo+"\n"+citta+"\n"+superficie+" mq"+ 
            "\n"+ "Bagni: "+n_bagni+ "\n"+ "Vani: "+ n_vani+ "\n"+ giardino+" mq");
        }
    }
    public void aggiungiApp( String appartamento)
    {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add(appartamento);
    }

    public void aggiungiVilla(String villa)
    {
        ArrayList<String> lista2 = new ArrayList<String>();
        lista2.add(villa);
    }
}
