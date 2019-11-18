package superProject.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SelectionPlayerManage extends Application {






    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../View/SelectionPlayerViewFX.fxml"));
            primaryStage.setTitle("Card View");

            primaryStage.setScene(new Scene(root, 400, 300));
            // primaryStage.setResizable(false);
            primaryStage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
