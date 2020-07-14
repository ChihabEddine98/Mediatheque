package controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.Mediatheque;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Accueil implements Initializable{


    static Mediatheque mediatheque=new Mediatheque();



    @FXML AnchorPane rootPane;

    // Nos Boutons !
    public JFXButton btn_ajout;
    public JFXButton btn_supp;
    public JFXButton btn_rech;
    public JFXButton btn_affiche;

    // Méthodes pour naviguer dans l'app

    public void goAjout() throws IOException
    {
            chargerFxml("ajout_media");
    }
    public void goSupp () throws IOException
    {
        System.out.println(mediatheque);
        chargerFxml("supp_media");
    }
    public void goAffiche() throws IOException
    {
            chargerFxml("affiche_media");
    }
    public void goRech() throws IOException
    {
            chargerFxml("rech_media");
    }

    // Cette méthode pour charger le fxml dans la fenetre !

    public void chargerFxml(String nom) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("../fxmls/"+nom+".fxml"));
        rootPane.getChildren().setAll(root);
    }




    public void initialize(URL url, ResourceBundle rb) {



    }






}
