package superProject.GameProperties;

import javafx.application.Application;
import javafx.stage.Stage;

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
    try{}
    catch(Exception e){}
    }

    private void startAge(){
        currentGameAge = 1;
        gameAge = new Age(/*age1 card listesi array list*/, currentGameAge);
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
