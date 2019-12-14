package superProject.Player;


import superProject.GameProperties.Card;
import superProject.Player.Player;
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
    public void increaseCoin(Player player,int coinNumber){

        player.setCoin(player.getCoin()+ coinNumber);

    }
    public void increaseWarPoints(Player player, int warPoints){

        player.setWarPoints(player.getWarPoints() + warPoints);

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
