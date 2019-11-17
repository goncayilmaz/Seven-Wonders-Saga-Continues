package superProject;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import superProject.Controller.GameEngine;

import java.io.File;
import java.net.URL;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        try{

            URL url = new File("/Users/erogluefe/Downloads/CS319-3I-SW/src/superProject/View/MenuViewFX.fxml").toURI().toURL();
            Parent root = FXMLLoader.load(url);

           // Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("/View/MenuViewFX.fxml"));
            Scene scene = new Scene(root,400,400);
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();




        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

    //    System.out.println("efe");

      //  GameEngine gameEngine = new GameEngine();

        launch(args);

    }
}
