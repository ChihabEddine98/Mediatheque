package controllers;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import models.Dictionnaire;
import models.DictionnaireBilingue;
import models.Livre;
import models.Media;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AjoutMedia implements Initializable{

    @FXML AnchorPane rootPane;
    @FXML JFXTextField titre;
    @FXML JFXTextField auteur_langue;
    @FXML JFXTextField langue2;
    @FXML JFXTextField nbPages;
    @FXML JFXComboBox type;





    public void goValide () throws IOException
    {
        Media media=null;
        if(titre.getText().isEmpty() || auteur_langue.getText().isEmpty() || nbPages.getText().isEmpty())
        {

        }
        else
        {


            if (!type.getSelectionModel().getSelectedItem().equals("Livre"))
            {

                media=new Livre(titre.getText().toString(),auteur_langue.getText(),Integer.parseInt(nbPages.getText()));
            }
            else if (!type.getSelectionModel().getSelectedItem().equals("Dictionnaire"))
            {
                media=new Dictionnaire(titre.getText().toString(),auteur_langue.getText(),Integer.parseInt(nbPages.getText()));

            }
            else if (!type.getSelectionModel().getSelectedItem().equals("Dictionnaire Bilingue") && !langue2.getText().isEmpty())
            {
                media=new DictionnaireBilingue(titre.getText().toString(),auteur_langue.getText(),Integer.parseInt(nbPages.getText()),langue2.getText());

            }


            Accueil.mediatheque.ajouter(media);

        }
    }
    public void goBack() throws IOException
    {
        chargerFxml("accueil");
    }


    // Cette méthode pour charger le fxml dans la fenetre !

    public void chargerFxml(String nom) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("../fxmls/"+nom+".fxml"));
        rootPane.getChildren().setAll(root);
    }




    public void initialize(URL url, ResourceBundle rb) {

        type.getItems().addAll("Livre","Dictionnaire","Dictionnaire Bilingue");

    }
}
