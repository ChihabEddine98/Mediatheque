package views;

import com.jfoenix.controls.JFXTextField;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{

        Stage fenetre=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("../fxmls/accueil.fxml"));
        fenetre.setTitle("MédiaTheque");
        fenetre.setScene(new Scene(root, 1200, 700));
        fenetre.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


}
