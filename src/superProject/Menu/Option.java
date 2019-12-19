package superProject.Menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Option  implements Initializable {


    private boolean music;
    private boolean sound;
    private String languageText;
    private ArrayList<String> languages;
    Stage stage  = new Stage();
    AnchorPane root;
    Scene scene1,scene2;


    @FXML
    private Button creditsButton;

    @FXML
    private Button startButton;

    @FXML
    private Button quitButton;

    @FXML
    private Button optionsButton;

    @FXML
    private Button tutorialButton;




    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void optionAc(ActionEvent event) throws Exception{

        Stage stage;
        Parent root;

try {


            stage = (Stage) optionsButton.getScene().getWindow();
            root=FXMLLoader.load(getClass().getResource("../Menu/OptionViewFX.fxml"));
           // root = FXMLLoader.load(getClass().getResource("FXML2.fxml"));


        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}
catch (Exception e){

}

        /*
        try {

            Stage stage = new Stage();
            root = (AnchorPane)FXMLLoader.load(getClass().getResource("../Menu/OptionViewFX.fxml"));
            stage.setScene(new Scene(root));

            stage.setTitle("Options");
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)event.getSource()).getScene().getWindow() );

            stage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

         */
    }
    public void tutorialAc(ActionEvent event){
        try {
            Stage stage = new Stage();
            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("../Menu/PopUpViewFX.fxml"));
            stage.setScene(new Scene(root));
            stage.setTitle("Tutorial");
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)event.getSource()).getScene().getWindow() );

            stage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void creditsAc(ActionEvent event){
        try {
            Stage stage = new Stage();
            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("../Menu/PopUpViewFX.fxml"));
            stage.setScene(new Scene(root));
            stage.setTitle("Credits");
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)event.getSource()).getScene().getWindow() );

            stage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void startGame(ActionEvent event){
        try {
            Stage stage = new Stage();
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("../Menu/SelectionPlayerViewFX.fxml"));
            stage.setScene(new Scene(root));
            stage.setTitle("Player Selection");
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)event.getSource()).getScene().getWindow() );

            stage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void quitGame(ActionEvent event){
        System.exit(1);

    }




    public String getLanguageText() {
        return languageText;
    }

    public void setLanguageText(String languageText) {
        this.languageText = languageText;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public boolean isMusic() {
        return music;
    }

    public void setMusic(boolean music) {
        this.music = music;
    }

    public boolean isSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }

    public void changeMusic(){
        if(music){
            music=false;

        }
        else
        {
            music=true;
        }
    }

    public void changeSound(){
        if(sound){
            sound=false;

        }
        else
        {
            sound=true;
        }
    }


}
