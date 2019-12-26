package superProject.Player;


import javafx.application.Application;
import javafx.stage.Stage;
import superProject.City.City;
import superProject.City.CityManager;
import superProject.GameProperties.Card;
import superProject.Player.Player;
import java.util.ArrayList;

public class PlayerEngine extends Application {

    private Player player;
    private ArrayList<Bot> bots;
    private ArrayList<Player> allPlayers;

    public PlayerEngine(int numberOfPlayers, City desiredCityOfHumanPlayer, ArrayList<City> citiesOfBots){
        allPlayers = new ArrayList<>();
        bots = new ArrayList<>();
        player = new Player(0, desiredCityOfHumanPlayer);
        allPlayers.add(player);
        for(int i = 0; i < numberOfPlayers - 1; i++){
            Bot bot = new Bot(i, citiesOfBots.get(i));
            allPlayers.add(bot);
            bots.add(bot);
        }

        for(int i = 0; i < bots.size(); i++){
            bots.get(i).print();
        }

    }
    public PlayerEngine(int numberOfPlayers){
        allPlayers = new ArrayList<>();
        bots = new ArrayList<>();
        player = new Player();

        allPlayers.add(player);
        for(int i = 0; i < numberOfPlayers - 1; i++){
            Bot bot = new Bot(i);
            allPlayers.add(bot);
            bots.add(bot);
        }
    }

    public Player getHumanPlayer(){
        return player;
    }


    public ArrayList<Bot> getBots(){
        return bots;
    }


    public void matchPlayerWithCity(Player player, City city){
        player.setCity(city);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("inside start");
        CityManager cityManager = new CityManager();
        cityManager.createACities();
        cityManager.printACities();
        cityManager.createBCities();
        cityManager.printBCities();
        Player p = new Player();
    }

    public void distributeHands(ArrayList<Card> cards){
        System.out.println("number of players" + allPlayers.size());
        System.out.println("number of cards" + cards.size());
        int count = 0;
        for(int i = 0; i < 7; i++){
            player.addToHandAtFirst(cards.get(count));
            count++;
        }
        for(int i = 0; i < bots.size(); i++){
            for(int j = 0; j < 7; j++){
                bots.get(i).addToHandAtFirst(cards.get(count));
                count++;
            }
        }
    }




    public int getHighScore(){
        int max=0;
        for(int i=0;i < allPlayers.size();i++){
            if( allPlayers.get(i).getScore()>max){
                max = allPlayers.get(i).getScore();
            }
        }
        return max;
    }
    public int getPlayerPoint(Player player) {

        return  player.getScore();
    }
    public void updatePlayerPoint(Player player,int point){

        player.setScore(player.getScore()+point);

    }
    public void increaseCoin(Player player,int coinNumber){

        player.setCoin(player.getCoin()+ coinNumber);

    }
    public void increaseWarPoints(Player player, int warPoints){

        player.setWarPoints(player.getWarPoints() + warPoints);

    }

    public int[] numberOfCardsOfAllPlayers(){
        int [] arr = new int[allPlayers.size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = allPlayers.get(i).getCards().size();
        }
        return arr;
    }
/*
    public Player getPlayer(){
        return player;
    }
    public Bot getBot(int bot){
        return bots.get(bot);
    }*/
    public Player getPlayer(int index){
        return allPlayers.get(index);
    }

    public ArrayList<Card> getCardsEntity(Player player){
        return player.getCards();

    }
    public void addToCardList(Player player,Card card)
    {
        player.addCardsToTable(card);
    }


    public void disjointCard(Player player,int cardNum){

        player.getCards().remove(player.getCards().get(cardNum));


    }

    public ArrayList<Player> getAllPlayers(){
        return allPlayers;
    }

    public void printPlayers(){
        System.out.println();
        System.out.println("LIST OF ALL PLAYERS");
        System.out.println();
        System.out.println("PLAYER");
        player.print();
        System.out.println("BOTS");
        for(int i = 0; i < bots.size(); i++){
            bots.get(i).print();
        }
    }

}



