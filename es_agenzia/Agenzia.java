public class Agenzia 
{
    public static void main(String[] args)
    {
        Appartamento app= new Appartamento();
        app.setCod("Q2dien");
        app.setTipo("Appartamento");
        app.setindIrizzo("Sandro");
        app.setCitta("Verona");
        app.setBagni(3);
        app.setVani(5);
        app.setSuperficie(150);

        app.stampa();

        Villa vil= new Villa();
        vil.setCod("Q2dien");
        vil.setTipo("Villa");
        vil.setindIrizzo("Sandro");
        vil.setCitta("Verona");
        vil.setBagni(3);
        vil.setVani(5);
        vil.setSuperficie(150);
        vil.setGiardino(200);
        vil.stampa2();
    }


     
}
