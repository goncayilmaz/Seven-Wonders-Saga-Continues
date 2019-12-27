package superProject.Menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
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

    @FXML private Button tutorialButton;
    @FXML private Button creditsButton;
    @FXML private Button startButton;
    @FXML private Button quitButton;
    @FXML private Button optionsButton;
    @FXML private CheckBox soundBox;
    @FXML private CheckBox musicBox;
    @FXML private ComboBox<String> languageBox;
    @FXML private Button returnButton;
    @FXML private Button buttonOkk;
    @FXML private Button buttonOk;
    @FXML private Label textLabelE;
    @FXML private Label textLabelU;
    @FXML private Label textLabelA;
    @FXML private Label textLabelG;
    @FXML private Label textLabelR;
    //@FXML private Label titleLabel;
    @FXML private Button buttonNext;
    @FXML private Button buttonPrev;
    @FXML private ImageView tutImage;

    MediaPlayer mediaPlayer;

    public void music(){

        String bip = "src/Media/7wonders.mp3";
        Media hit = new Media(Paths.get(bip).toUri().toString());
        mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        music();


    }


    //public Label getTextLabel() {
        //return textLabel;
    //}

    //public void setTextLabel(Label textLabel) {
        //this.textLabel = textLabel;
    //}

    @FXML
    public void musicCheck(MouseEvent event) throws  Exception {

        try {
            if (musicBox.isSelected()) {
                System.out.println("efe");

            }
        }
        catch (Exception e){

        }
    }

    public void returnToMenu(ActionEvent event) throws Exception{

        Stage stage;
        Parent root;

        try {
            stage = (Stage) returnButton.getScene().getWindow();
            root=FXMLLoader.load(getClass().getResource("../Menu/MenuViewFX.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
        catch (Exception e){

        }


    }
    public void returnToMenuFromPopUp(ActionEvent event) throws Exception{

        Stage stage;
        Parent root;

        try {
            stage = (Stage) buttonOkk.getScene().getWindow();
            root=FXMLLoader.load(getClass().getResource("../Menu/MenuViewFX.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
        catch (Exception e){

        }


    }

    public void returnToMenuFromTutorial(ActionEvent event) throws Exception{

        Stage stage;
        Parent root;

        try {
            stage = (Stage) buttonOk.getScene().getWindow();
            root=FXMLLoader.load(getClass().getResource("../Menu/MenuViewFX.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

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

    public void startGame(ActionEvent event){
        Stage stage;
        Parent root;

        try {
            stage = (Stage) startButton.getScene().getWindow();
            System.out.println("efe");
            root=FXMLLoader.load(getClass().getResource("../Menu/SelectionPlayerViewFX.fxml"));
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
            root=FXMLLoader.load(getClass().getResource("../Menu/TutorialView.fxml"));

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

    public void tutorialImageNext(ActionEvent event){
        try{
            tutImage.setImage(new Image("@../../Images/7Wonders-quickrules-2.png" ));
        }
        catch (Exception e) {}
    }

    public void tutorialImagePrev(ActionEvent event){
        try{

            tutImage.setImage(new Image("@../../Images/7Wonders-quickrules-1.png" ));
            //tutImage.setImage(tutImage1.getImage());
        }
        catch (Exception e) {}
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
        music = !music;
    }

    public void changeSound(){
        sound = !sound;
    }


}
