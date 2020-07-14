package models;

import java.util.*;

public class Mediatheque {

    public LinkedList<Media> bdd;

    public Mediatheque() {
        this.bdd = new LinkedList<Media>();
    }

    public void  ajouter(Media doc)
    {
       if(bdd.add(doc))
       {

           Collections.sort(bdd, new Comparator<Media>() {
               @Override
               public int compare(Media doc1, Media doc2) {
                   if(doc2 instanceof Livre)
                   {
                       return doc1.plusPetit((Livre)doc2);
                   }

                   return doc1.plusPetit(doc2);
               }
           });

       }
       else
       {
           System.out.println(" Probleme lors d'ajout d'un Média :/ \n");
       }
    }

    @Override
    public String toString() {

        String s="";
        String livres,dictio;
        livres="\n ++++++++++++ Les Livres         ++++++++++++++ \n";
        dictio="\n ++++++++++++ Les Dictionnaires  ++++++++++++++ \n";

        int n;
        for(Media media:bdd)
        {
            n=media.ordreMedia();
            switch (n)
            {
                case 0: livres+=media.toString(); break;
                case 1: dictio+=media.toString(); break;
            }


        }
        s=livres+dictio;
        return s;
    }

    public void tousLesDictionnaires()
    {
        String s="";
        for(Media media:bdd)
        {
            if(media instanceof Dictionnaire)
            {
                s+=media.toString();
            }

        }

        System.out.println(s);

    }

    public ArrayList<Media> recherche(Predicat p)
    {
        ArrayList<Media> res=new ArrayList<Media>();

        for(Media m:bdd)
        {
            if(p.estVrai(m))
            {
                res.add(m);
            }
        }

        return res;
    }

    public static void main(String[] args)


    {




        //Media m1=new Media(" Booom Bomm ! ");
        Dictionnaire d1=new Dictionnaire("S Dictio !","FR",5);
        Livre l3=new Livre("sLivre3 ! "," Moussa ",270);
        Dictionnaire d2=new Dictionnaire("Dictio 2 !","ANG",3);
        Livre l1=new Livre("Livre 1 ! "," Chihab ",500);
        Livre l2=new Livre("SLivre 2 ! "," Med ",820);

        EstUnLivre p1=new EstUnLivre();
        TitreCommenceParS p2=new TitreCommenceParS();
        TitreEstAPeuPres p3=new TitreEstAPeuPres("livr");

        Et et=new Et(p3,p3);

        Mediatheque m=new Mediatheque();

        m.ajouter(l3);
        m.ajouter(d1);
        m.ajouter(d2);
        m.ajouter(l2);
        m.ajouter(l1);

        System.out.println(m);

        System.out.println(" Prédicats ! ");





        for (Media media:m.recherche(et))
        {
            System.out.println(media);
        }

        //m.tousLesDictionnaires();




    }


}
