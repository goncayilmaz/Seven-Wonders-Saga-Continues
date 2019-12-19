package superProject.GameProperties;

import javafx.application.Application;
import javafx.stage.Stage;
import superProject.City.City;
import superProject.City.CityManager;
import superProject.Player.PlayerEngine;

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

    private void startAge(boolean citySide, CityManager cityM, CardEngine cardE, int noOfPlayers, PlayerEngine playerE){
        currentGameAge = 1;
        cityM.createCity(citySide);
        cardE.createGameCards(noOfPlayers);

        gameAge = new Age( cardE.getFirstAgeCards(), currentGameAge);
    }
    private void finishAge(){

    }
    private void goNextAge(CardEngine cardE){
        if(currentGameAge == 1){
            currentGameAge = 2;
            gameAge = new Age(cardE.getSecondAgeCards(), currentGameAge);
        }
        else if(currentGameAge == 2){
            currentGameAge = 3;
            gameAge = new Age(cardE.getThirdAgeCards(), currentGameAge);
        }
    }
    private int getCurrentAge(){
        return currentGameAge;
    }
    private Age getAgeResults(){
        return gameAge;

    }
}

//city yarat player yarat playerlara array list of cards dağıt
