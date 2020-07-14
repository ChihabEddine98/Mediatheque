package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import models.Dictionnaire;
import models.Livre;
import models.Media;


import java.io.IOException;
import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

public class AfficheMedia implements Initializable {

    @FXML AnchorPane rootPane;
    @FXML VBox bodyPane;
         TableView tableLivres;
         TableView tableDictio;


    public void initialize(URL url, ResourceBundle rb) {


        TableColumn<Livre,String> titreCol=new TableColumn<>("Titre");
        titreCol.setMinWidth(200);
        titreCol.setCellValueFactory(new PropertyValueFactory<Livre,String>("titre"));

        TableColumn<Livre,String> auteurCol=new TableColumn<>("Auteur");
        titreCol.setMinWidth(200);
        titreCol.setCellValueFactory(new PropertyValueFactory<Livre,String>("auteur"));

        TableColumn<Livre,Integer> nbPagesCol=new TableColumn<>("Nombre de Pages");
        titreCol.setMinWidth(200);
        titreCol.setCellValueFactory(new PropertyValueFactory<Livre,String>("nbPages"));

        // DIctionnaires

        TableColumn<Dictionnaire,String> titreCol2=new TableColumn<>("Titre");
        titreCol.setMinWidth(200);
        titreCol.setCellValueFactory(new PropertyValueFactory<>("titre"));


        TableColumn<Dictionnaire,String> langueCol=new TableColumn<>("Langue");
        titreCol.setMinWidth(200);
        titreCol.setCellValueFactory(new PropertyValueFactory<>("langue"));

        TableColumn<Dictionnaire,Integer> nbTomesCol=new TableColumn<>("Nombre de Tomes");
        titreCol.setMinWidth(200);
        titreCol.setCellValueFactory(new PropertyValueFactory<>("nbTomes"));



        bodyPane.setPadding(new Insets(5));
        tableLivres=new TableView();

        bodyPane.getChildren().add(tableLivres);

        tableLivres.setItems(getLivres());
        tableLivres.getColumns().addAll(titreCol,auteurCol,nbPagesCol);





        tableDictio=new TableView();


        tableDictio.setItems(getDictio());
        tableDictio.getColumns().addAll(titreCol2,langueCol,nbTomesCol);


        bodyPane.getChildren().add(tableDictio);

        System.out.println(getDictio());
        System.out.println(getLivres());


    }

    public void goBack() throws IOException
    {
        chargerFxml("accueil");
    }
    public ObservableList<Media> getBdd()
    {
        ObservableList<Media> bdd=FXCollections.observableArrayList();

        bdd.addAll(Accueil.mediatheque.bdd);



        return bdd;
    }

    public ObservableList<Dictionnaire> getDictio()
    {
        ObservableList<Dictionnaire> bdd=FXCollections.observableArrayList();

        for (Media m:Accueil.mediatheque.bdd)
        {
            if(m instanceof Dictionnaire)
            {
                bdd.add((Dictionnaire)m);
            }
        }

        return bdd;

    }
    public ObservableList<Livre> getLivres()
    {
        ObservableList<Livre> bdd=FXCollections.observableArrayList();

        for (Media m:Accueil.mediatheque.bdd)
        {
            if(m instanceof Livre)
            {
                bdd.add((Livre) m);
            }
        }

        return bdd;

    }
    public void chargerFxml(String nom) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("../fxmls/"+nom+".fxml"));
        rootPane.getChildren().setAll(root);
    }





}
