package superProject.Player;

import superProject.GameProperties.Card;

import java.util.ArrayList;

public class Bot extends Player{

    // bu class gözden geçecek
    // bunu yazdım ama tekrardan bakmamız lazım

  //  private ArrayList<Player> players;
  //  private Player player;

  //  public Player getPlayer() {return player;}

   // public void setPlayer(Player player) {this.player = player;}

    public Card imaginate(Player player, ArrayList<Player> players){

        Card card = player.getCards().get(0);

        int playerNumber =players.size();

        int playerWarPoint=0;
        int nearPlayer=0;
        int awayPlayer=0;

        for(int i=0;i<player.getCardsOnTable().size();i++) {
            if (player.getCardsOnTable().get(i).getColor() == "Red") {
                playerWarPoint = playerWarPoint + player.getCardsOnTable().get(i).getCardWarPoint();
            }
        }


        if(player.getId()==0) {
            Player pLast = players.get(playerNumber-1);
            for (int j = 0; j < pLast.getCardsOnTable().size(); j++) {
                if (pLast.getCardsOnTable().get(j).getColor() == "Red") {
                    awayPlayer = awayPlayer + pLast.getCardsOnTable().get(j).getCardWarPoint();
                }

            }
            for (int j = 0; j < players.get(1).getCardsOnTable().size(); j++) {
                if (players.get(1).getCardsOnTable().get(j).getColor() == "Red") {
                    nearPlayer = nearPlayer + players.get(1).getCardsOnTable().get(j).getCardWarPoint();
                }


            }
        }
        else if(player.getId()==playerNumber){
            Player pFirst= players.get(0);
            for (int j = 0; j < pFirst.getCards().size(); j++) {
                if (pFirst.getCardsOnTable().get(j).getColor() == "Red") {
                    awayPlayer = awayPlayer + pFirst.getCardsOnTable().get(j).getCardWarPoint();
                }
            }
            for (int j = 0; j < players.get(playerNumber-1).getCardsOnTable().size(); j++) {
                if (players.get(playerNumber-1).getCardsOnTable().get(j).getColor() == "Red") {
                    nearPlayer = nearPlayer + players.get(playerNumber-1).getCardsOnTable().get(j).getCardWarPoint();
                }


            }

        }
        else{
            for (int j = 0; j < players.get(player.getId()-1).getCardsOnTable().size(); j++) {
                if (players.get(player.getId()-1).getCardsOnTable().get(j).getColor() == "Red") {
                    awayPlayer = awayPlayer + players.get(player.getId()-1).getCardsOnTable().get(j).getCardWarPoint();
                }
            }
            for (int j = 0; j < players.get(player.getId()+1).getCardsOnTable().size(); j++) {
                if (players.get(player.getId()+1).getCardsOnTable().get(j).getColor() == "Red") {
                    nearPlayer = nearPlayer + players.get(player.getId()+1).getCardsOnTable().get(j).getCardWarPoint();
                }
            }



        }

        // war point icin imaginate
        if(playerWarPoint>nearPlayer&&playerWarPoint>awayPlayer){
            // savaş kartı oynama
        }
        else if(playerWarPoint>nearPlayer&&playerWarPoint<awayPlayer){
            // savaş kartı oynamak için booolean random at
        }
        else if(playerWarPoint<nearPlayer&&playerWarPoint>awayPlayer){
            // savaş kartı oynamak için booolean random at
        }
        else{
            //kesin savaş kartı at.
        }




        return card;
    }


}
