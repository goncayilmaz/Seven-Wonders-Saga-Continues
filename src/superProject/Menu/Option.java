package superProject.Menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
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
import javafx.stage.Stage;

public class Option  implements Initializable {


    private boolean music;
    private boolean sound;
    private String languageText;
    private ArrayList<String> languages;


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

    @FXML
    private CheckBox soundBox;

    @FXML
    private CheckBox musicBox;

    @FXML
    private ComboBox<String> languageBox;




    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }

    @FXML
    public void musicCheck(MouseEvent event) throws  Exception {

        try {
            if (musicBox.isSelected() == true) {
                System.out.println("efe");

            }
        }
        catch (Exception e){

        }
    }

    public void optionAc(ActionEvent event) throws Exception{

        Stage stage;
        Parent root;

        try {
            stage = (Stage) optionsButton.getScene().getWindow();
            root=FXMLLoader.load(getClass().getResource("../Menu/OptionViewFX.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
        catch (Exception e){

        }


    }
    public void tutorialAc(ActionEvent event){
        Stage stage;
        Parent root;

        try {
            stage = (Stage) tutorialButton.getScene().getWindow();
            root=FXMLLoader.load(getClass().getResource("../Menu/PopUpViewFX.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){

        }

    }
    public void creditsAc(ActionEvent event){
        Stage stage;
        Parent root;

        try {
            stage = (Stage) creditsButton.getScene().getWindow();
            root=FXMLLoader.load(getClass().getResource("../Menu/PopUpViewFX.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){

        }

    }

    public void startGame(ActionEvent event){
        Stage stage;
        Parent root;

        try {
            stage = (Stage) startButton.getScene().getWindow();
            root=FXMLLoader.load(getClass().getResource("../Menu/SelectionPlayerViewFX.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){

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
