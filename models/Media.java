package models;

public class Media  {



    private final String titre;
    private final int numero;
    static int idMediaGLobal=-1;


    public Media(String titre) {
        this.titre = titre;
        idMediaGLobal++;
        numero=idMediaGLobal;
    }

    public String getTitre() {
        return titre;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "{  "+
                "titre= '" + titre + '\'' +
                "\n   numero= " + numero;
    }

    public int plusPetit(Media doc)
    {
        if(numero>doc.getNumero())
        {
            return 1;
        }
        else
        {
            if(this.getNumero()<doc.getNumero())
            {
                return -1;
            }
            else
            {
                return 0;
            }
        }


    }


    public int plusPetit(Livre doc)
    {
        if( (this instanceof Livre )==false)
        {
            return 1;
        }
        else return -1;

    }

    public  int ordreMedia()
    {

        if( this instanceof Livre)
        {
            return 0;
        }
        else if (this instanceof Dictionnaire)
        {
            return 1;
        }
        else return -1;




    }



}
