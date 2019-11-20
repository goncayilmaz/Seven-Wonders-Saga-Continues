package superProject.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Menu extends Application {

    private int playerNum;

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../View/MenuViewFX.fxml"));
            primaryStage.setTitle("Menu");

            primaryStage.setScene(new Scene(root, 720, 460));

            primaryStage.setResizable(false);
            primaryStage.centerOnScreen();
            primaryStage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }

    private void startGame(){

    }
    private void goOptions(){

    }
    private void goCredits(){

    }
    private void goTutorial(){

    }
    private void quitGame(){

    }
    private void setNumberOfPlayers(int number){

    }


    public static void main(String[] args) {
        launch(args);

    }

}
