public class Appartamento 
{
    public String cod;
    public String indirizzo; 
    public String citta;
    public float superficie;
    public int n_vani;
    public int n_bagni;
    public String tipo;

    public void setCod(String cod)
    {
        this.cod=cod;
    }
    public String getCod()
    {
        return this.cod;
    }
    public void setindIrizzo(String indirizzo)
    {
        this.indirizzo=indirizzo;
    }
    public String getIndirizzo()
    {
        return this.indirizzo;
    }
    public void setCitta(String citta)
    {
        this.citta=citta;
    }
    public String getCitta()
    {
        return this.citta;
    }
    public void setSuperficie(float superficie)
    {
        this.superficie=superficie;
    }
    public float getSuperficie()
    {
        return this.superficie;
    }
    public void setVani(int n_vani)
    {
        this.n_vani=n_vani;
    }
    public int getVani()
    {
        return this.n_vani;
    }
    public void setBagni(int n_bagni)
    {
        this.n_bagni=n_bagni;
    }
    public int getBagni()
    {
        return this.n_bagni;
    }
    public void setTipo(String tipo)
    {
        this.tipo=tipo;
    }
    public String getTipo()
    {
        return this.tipo;
    }

    public void stampa()
    {
        System.out.println("\n"+tipo+"\n"+ "via "+ indirizzo+"\n"+citta+"\n"+superficie+" mq"+ 
        "\n"+ "Bagni: "+n_bagni+ "\n"+ "Vani: "+ n_vani);    
    }
}
