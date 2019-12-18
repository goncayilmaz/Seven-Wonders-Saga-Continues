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

    public Player getPlayer(int player){
        return players.get(player);

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
    public ArrayList<Player> getWinners(int playerNumber){

        return winners;
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

    /*
    public void addToBoard(Player player,Card card){
        //disjoint le aynı mantık

    }
    */
        /*
    public void compareNeighbours(Player player){
        // war bunu yapıyor fight ile

    }

     */

            /*
    public void processResults(Player player){
// gereksiz.
    }

        public void setAttributes(Player player){

    }

     */

