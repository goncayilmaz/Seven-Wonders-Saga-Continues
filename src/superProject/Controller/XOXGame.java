package superProject.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class XOXGame extends Application {


    private boolean isRun;
    private boolean isFinish;
    private int count;



    @Override
    public void start(Stage primaryStage) throws Exception {

        try {

            Parent root = FXMLLoader.load(getClass().getResource("../View/XOXViewFX.fxml"));
            primaryStage.setTitle("XOX Game");

            primaryStage.setScene(new Scene(root, 400, 500));
            primaryStage.setResizable(false);
            primaryStage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
