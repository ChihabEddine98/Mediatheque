package models;


public class Livre extends Media {

    private String auteur;
    private int nbPages;

    public Livre(String titre, String auteur, int nbPages) {
        super(titre);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    @Override
    public String toString() {
        return "\n\n"+
                super.toString()+
                "\n "+
                "  Auteur= '" + auteur + '\'' +
                "\n   Nombre de Pages= " + nbPages +
                "  } \n\n";
    }
/**
    public boolean plusPetit(Media doc)
    {
        if( (doc instanceof Livre )==false)
        {
            return false;
        }
        else return super.plusPetit(doc);

    }

 **/
}
