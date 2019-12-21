package superProject.Menu;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Screen;
import javafx.stage.Stage;
import java.io.File;
import java.nio.file.Paths;


public class Menu extends Application {
    @FXML
    private Rectangle2D primaryScreenBounds;
    private double prefHeightSmall;
    private int playerNum;
    private static Stage primaryStage;


    MediaPlayer mediaPlayer;
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

/*            try{
                MenuViewManager m = new MenuViewManager();
                primaryStage = m.getMainStage();
                primaryStage.show();
            }catch (Exception e){
                e.printStackTrace();
            }*/

        Parent root = FXMLLoader.load(getClass().getResource("../Menu/MenuViewFX.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        music();
        primaryStage.show();
            /*
            smallPane1.setMaxWidth(prefWidthSmall);
            smallPane1.setMaxHeight(prefHeightSmall);
            smallPane1.setPrefSize(prefWidthSmall, prefHeightSmall);
            smallPane2.setMaxWidth(prefWidthSmall);
            smallPane2.setMaxHeight(prefHeightSmall);
            smallPane2.setPrefSize(prefWidthSmall, prefHeightSmall);


        primaryStage.setResizable(false);
        primaryStage.setFullScreen(true);
        primaryStage.centerOnScreen();
*/





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
