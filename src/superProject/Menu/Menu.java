package superProject.Menu;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import java.io.File;


public class Menu extends Application {

    private int playerNum;
    private static Stage primaryStage;


    public Stage getPrimaryStage() {
        return this.primaryStage;
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("../Menu/MenuViewFX.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);


        Media media = new Media(new File("src/Media/7wonders.mp3").toURI().toString());
        MediaPlayer player = new MediaPlayer(media);
        MediaView view = new MediaView(player);
        player.setAutoPlay(true);
        primaryStage.show();
        /*

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../Menu/MenuViewFX.fxml"));
            primaryStage.setTitle("Menu");

            primaryStage.setScene(new Scene(root));
            primaryStage.setFullScreen(true);
            //primaryStage.setResizable(false);
            //primaryStage.centerOnScreen();
            primaryStage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }

         */


    }

    private void startGame(){

    }
    private void goOptions(){

    }
    private void goCredits(){

    }
    private void goTutorial(){
        System.out.println("tutorallll");
    }
    private void quitGame(){

    }
    private void setNumberOfPlayers(int number){

    }


    public static void main(String[] args) {
        launch(args);

    }

}
