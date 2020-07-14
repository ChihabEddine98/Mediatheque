package models;

public class TitreEstAPeuPres extends Predicat {


    private String titre;

    public TitreEstAPeuPres(String titre) {
        this.titre = titre;
    }

    public boolean distance(Media m)
    {
        String titreM=m.getTitre();
        boolean res=false;


        if(Math.abs(titre.length()-titreM.length())<=1
           || titreM.toLowerCase().matches(".*"+titre.toLowerCase()+".*"))
        {
            res=true;
        }

        return res;

    }
    public boolean estVrai(Media m)
    {
        return distance(m);
    }



}
