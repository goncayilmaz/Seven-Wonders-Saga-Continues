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

    public PlayerEngine(int numberOfPlayers, City desiredCityOfHumanPlayer){
        allPlayers = new ArrayList<>();
        bots = new ArrayList<>();
        player = new Player(desiredCityOfHumanPlayer);

        for(int i = 0; i < numberOfPlayers - 1; i++){
            Bot bot = new Bot();
            allPlayers.add(bot);
            bots.add(bot);
        }
    }
    public PlayerEngine(int numberOfPlayers){
        allPlayers = new ArrayList<>();
        bots = new ArrayList<>();
        player = new Player();

        for(int i = 0; i < numberOfPlayers - 1; i++){
            Bot bot = new Bot();
            allPlayers.add(bot);
            bots.add(bot);
        }
    }




    public void matchPlayerWithCity(Player player, City city){
        player.setCity(city);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        CityManager cityManager = new CityManager();
        cityManager.createACities();
        cityManager.printACities();
        cityManager.createBCities();
        cityManager.printBCities();
        Player p = new Player();
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

    public void startAttack(){
        // attack manager ile bağlanacak.

    }
    public void finishAttack(){
        // attack manager ile bağlanacak.

    }
    public void startXOX(Boolean bool){
        //xox game ile bağlanacak.

    }

}



