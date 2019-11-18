package superProject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.net.URL;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("MenuViewFX.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

       /* Parent root = FXMLLoader.load(getClass().getResource("MenuViewFX.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();


        */
        /*
        Label label = new Label("Hello World");
        label.setAlignment(Pos.CENTER);
        Scene scene = new Scene(label, 500, 350);

        primaryStage.setTitle("Hello World Application");
        primaryStage.setScene(scene);
        primaryStage.show();


         */
        /*


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
*/

    }



    public static void main(String[] args) {

    //    System.out.println("efe");

      //  GameEngine gameEngine = new GameEngine();

        launch(args);

    }
}
