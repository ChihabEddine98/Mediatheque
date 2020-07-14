package models;

public class Dictionnaire extends Media {

    private String langue;
    private int nbTomes;

    public Dictionnaire(String titre, String langue, int nbTomes) {
        super(titre);
        this.langue = langue;
        this.nbTomes = nbTomes;
    }

    public String getLangue() {
        return langue;
    }

    public int getNbTomes() {
        return nbTomes;
    }

    @Override
    public String toString() {
        return "\n\n"+
                super.toString()+
                "\n "+
                "  Langue= '" + langue + '\'' +
                "\n   Nombre De Tomes= " + nbTomes +
                "  } \n\n";
    }
}
