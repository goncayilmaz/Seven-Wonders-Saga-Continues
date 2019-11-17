package superProject.Controller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sun.font.FontConfigManager;

public class Menu extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

    try{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("/View/MenuViewFX.fxml"));
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
        launch(args);
    }

}
