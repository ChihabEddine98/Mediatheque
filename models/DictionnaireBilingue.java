package models;
public class DictionnaireBilingue extends Dictionnaire {

        private String langue2;


    public DictionnaireBilingue(String titre, String langue, int nbTomes, String langue2) {
        super(titre, langue, nbTomes);
        this.langue2 = langue2;
    }
}
