package superProject.Controller;

import javafx.application.Application;
import javafx.stage.Stage;
import superProject.Model.Age;

import java.util.ArrayList;

public class AgeManager extends Application {

    private Age gameAge;
    private int  currentGameAge;


    public Age getGameAge() {
        return gameAge;
    }

    public void setGameAge(Age gameAge) {
        this.gameAge = gameAge;
    }

    public int getCurrentGameAge() {
        return currentGameAge;
    }

    public void setCurrentGameAge(int currentGameAge) {
        this.currentGameAge = currentGameAge;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }

    private void startAge(){

    }
    private void finishAge(){

    }
    private void goNextAge(){

    }
    private int getCurrentAge(){
        return currentGameAge;
    }
    private Age getAgeResults(){
        return gameAge;

    }
}
