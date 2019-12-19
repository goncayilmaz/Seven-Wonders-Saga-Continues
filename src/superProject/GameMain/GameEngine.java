package superProject.GameMain;

import javafx.fxml.Initializable;
import superProject.City.CityManager;
import superProject.Controller.FileEngine;
import superProject.Menu.Option;
import superProject.Player.PlayerEngine;
import superProject.Player.Bot;
import superProject.GameProperties.Card;
import superProject.City.City;
import superProject.Player.Player;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

public class GameEngine implements Initializable {



    private boolean gameLevel;
    private Option controllerListener;
    private ArrayList<Integer> scores;
    private ArrayList<Integer> currentScores;
    private boolean isRun;
    private boolean isFinish;
    private int currentTurn;
    private GameEngine gameEngine;
    private ArrayList<Player> players;
    private ArrayList<Player> winnerPlayers;
    private int numberOfPlayers;
    private PlayerEngine playerEngine;
    private ArrayList<Card> cards;
    private ArrayList<City> cities;
    private CityManager cityManager;
    private ArrayList<Bot> bots;
    private FileEngine fileEngine;
    private boolean warState;


    public GameEngine(boolean gameLevel, Option controllerListener, ArrayList<Integer> scores,
                      ArrayList<Integer> currentScores, boolean isRun, boolean isFinish,
                      int currentTurn, GameEngine gameEngine, ArrayList<Player> players,
                      int numberOfPlayers, PlayerEngine playerEngine, ArrayList<Card> cards,
                      ArrayList<City> cities, CityManager cityManager, ArrayList<Bot> bots, FileEngine fileEngine) {
        this.gameLevel = gameLevel;
        this.controllerListener = controllerListener;
        this.scores = scores;
        this.currentScores = currentScores;
        this.isRun = isRun;
        this.isFinish = isFinish;
        this.currentTurn = currentTurn;
        this.gameEngine = gameEngine;
        this.players = players;
        this.numberOfPlayers = numberOfPlayers;
        this.playerEngine = playerEngine;
        this.cards = cards;
        this.cities = cities;
        this.cityManager = cityManager;
        this.bots = bots;
        this.fileEngine = fileEngine;
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public boolean isGameLevel() {
        return gameLevel;
    }

    public void setGameLevel(boolean gameLevel) {
        this.gameLevel = gameLevel;
    }

    public Option getControllerListener() {
        return controllerListener;
    }

    public void setControllerListener(Option controllerListener) {
        this.controllerListener = controllerListener;
    }

    public ArrayList<Integer> getScores() {

        return scores;
    }

    public void setScores(ArrayList<Integer> scores) {
        this.scores = scores;
    }

    public ArrayList<Integer> getCurrentScores() {
        return currentScores;
    }

    public void setCurrentScores(ArrayList<Integer> currentScores) {
        this.currentScores = currentScores;
    }

    public boolean isRun() {
        return isRun;
    }

    public void setRun(boolean run) {
        isRun = run;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    public int getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(int currentTurn) {
        this.currentTurn = currentTurn;
    }

    public GameEngine getGameEngine() {
        return gameEngine;
    }

    public void setGameEngine(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }


    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public PlayerEngine getPlayerEngine() {
        return playerEngine;
    }

    public void setPlayerEngine(PlayerEngine playerEngine) {
        this.playerEngine = playerEngine;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public CityManager getCityManager() {
        return cityManager;
    }

    public void setCityManager(CityManager cityManager) {
        this.cityManager = cityManager;
    }

    public ArrayList<Bot> getBots() {
        return bots;
    }

    public void setBots(ArrayList<Bot> bots) {
        this.bots = bots;
    }

    public FileEngine getFileEngine() {
        return fileEngine;
    }

    public void setFileEngine(FileEngine fileEngine) {
        this.fileEngine = fileEngine;
    }

    public void startGame(){

    }
    public void finishGame(){

    }

    public ArrayList<Integer> getCurScores(){
        return currentScores;

    }
    public boolean isGameRun(){

        return isRun;

    }
    public boolean isGameFinish(){
        return  isFinish;

    }

    public void rotateCards(){
            ArrayList<ArrayList<Card>> hands = new ArrayList<>();
            // Collect the hands from players
            for(int i = 0; i < players.size(); i++){
                ArrayList<Card> hand = players.get(i).getCards();
                hands.add(hand);
            }
            // Rotate
            Collections.rotate(hands,1);
            // Distribute the hands to players
            for(int i = 0; i < players.size(); i++){
                players.get(i).setCards(hands.get(i));
            }
    }

    public void quitGame(){

    }
    public void pauseGame(){

    }
    public void run(){

    }
    public int getNumberOfPlayers(){
        return  numberOfPlayers;

    }
    public void setWarState(boolean bool){

    }
    public boolean getWarState(){
        return warState;
    }
    public ArrayList<Player> displayWinner(){
        return winnerPlayers;

    }
    public Card getChoosenCard(int i){
        return cards.get(i);

    }
    public int getOptionCard(int i){
        return -1;

    }

}
