package superProject.Controller;


import superProject.Model.Card;
import superProject.Model.Player;
import java.util.ArrayList;

public class PlayerEngine {

    private ArrayList<Player> players;
    private ArrayList<Player> winners;

    public int getHighScore(){
        int max=0;
        for(int i=0;i<players.size();i++){
            if(players.get(i).getScore()>max){
                max=players.get(i).getScore();
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
    public void increaseCoin(Player player,int cointNumber){

        player.setCoin(player.getCoin()+cointNumber);


    }
    public void increaseWarPoint(Player player,int warPoint){

        player.setWarPoint(player.getWarPoint()+warPoint);

    }
    public void processResults(Player player){

    }
    public Player getPlayer(int player){
        return players.get(player);

    }
    public ArrayList<Card> getCardsEntity(Player player){
        return player.getCards();

    }
    public void addToCardList(Player player,Card card){
        player.addCardsToTable(card);
    }
    public void addToBoard(Player player,Card card){
        //disjoint le aynı mantık

    }
    public void disjointCard(){


    }
    public void setAttributes(Player player){

    }
    public void compareNeighbours(Player[] players){

    }
    public void startAttack(){

    }
    public void finishAttack(){

    }
    public void startXOX(Boolean bool){

    }
    public ArrayList<Player> getWinners(int playerNumber){
        return winners;
    }
}
