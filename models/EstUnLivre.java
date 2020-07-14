package models;

public class EstUnLivre extends Predicat {




    public boolean estVrai(Media m)
    {
        return m instanceof Livre;

    }
}
