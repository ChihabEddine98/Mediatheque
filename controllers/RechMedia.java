package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RechMedia implements Initializable {


   @FXML AnchorPane rootPane;

    public void goBack() throws IOException
    {
        chargerFxml("accueil");
    }

    public void chargerFxml(String nom) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("../fxmls/"+nom+".fxml"));
        rootPane.getChildren().setAll(root);
    }

    public void initialize(URL url, ResourceBundle rb) {





    }





}
