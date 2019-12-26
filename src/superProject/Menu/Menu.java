package superProject.Menu;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;


public class Menu extends Application {
    @FXML
    private Rectangle2D primaryScreenBounds;
    private double prefHeightSmall;
    private int playerNum;
    private static Stage primaryStage;


    MediaPlayer mediaPlayer;
    //dede

    public void music(){

        String bip = "src/Media/7wonders.mp3";
        Media hit = new Media(Paths.get(bip).toUri().toString());
        mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();


    }

    public Stage getPrimaryStage() {
        return this.primaryStage;
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("../Menu/MenuViewFX.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        music();
        primaryStage.show();
      //  openHigh();



    }

    /*
    public void openHigh() throws Exception{

        File file = new File("high.txt");
        FileReader fileReader = new FileReader(file);
        String line;

        BufferedReader br = new BufferedReader(fileReader);

        while ((line = br.readLine()) != null) {

            System.out.println(line);

        }

        br.close();


    }

     */

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
