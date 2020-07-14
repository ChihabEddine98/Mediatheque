package models;

public class TitreCommenceParS extends Predicat{



    public boolean estVrai(Media m)
    {
        String  titre;
        titre=m.getTitre();

        return titre.charAt(0)=='s' || titre.charAt(0)=='S';
    }


}
