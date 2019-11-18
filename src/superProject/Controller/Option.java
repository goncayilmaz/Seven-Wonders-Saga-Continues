package superProject.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Option extends Application {


    private boolean music;
    private boolean sound;
    private String languageText;
    private ArrayList<String> languages;



    @Override
    public void start(Stage primaryStage) throws Exception {


        try {
            Parent root = FXMLLoader.load(getClass().getResource("../View/OptionViewFX.fxml"));
            primaryStage.setTitle("Options");

            primaryStage.setScene(new Scene(root, 450, 300));
          // primaryStage.setResizable(false);
            primaryStage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }

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
