package superProject.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CityManager extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {


        try {

            Parent root = FXMLLoader.load(getClass().getResource("../View/CitySelectionViewFX.fxml"));
            primaryStage.setTitle("City Selection");

            primaryStage.setScene(new Scene(root, 300, 160));
            primaryStage.setResizable(false);
            primaryStage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
