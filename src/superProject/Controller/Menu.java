package superProject.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Menu extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../View/MenuViewFX.fxml"));
            primaryStage.setTitle("Menu");

            primaryStage.setScene(new Scene(root, 750, 500));

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
