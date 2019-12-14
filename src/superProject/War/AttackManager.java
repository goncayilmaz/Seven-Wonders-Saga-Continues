package superProject.War;

import superProject.Player.Player;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AttackManager {

    private Player [] players;
    private int numberOfPlayers;
    private int curAgeNo;
    private ArrayList<Player> winners;
    private ArrayList<Player> losers;

    public AttackManager(int numberOfPlayers, int curAgeNo, Player[] players) {
        this.numberOfPlayers = numberOfPlayers;
        this.curAgeNo = curAgeNo;
        this.players = players;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayer) {
        this.numberOfPlayers = numberOfPlayer;
    }

    public void fight() {
        for( int i = 0; i < numberOfPlayers; i++){
            if (i == 0) {
                int compareLeft = Integer.compare( players[i].getWarPoints(), players[numberOfPlayers - 1].getWarPoints());
                int compareRight  = Integer.compare( players[i].getWarPoints(), players[i + 1].getWarPoints());
                setResults(i, compareLeft);
                setResults(i, compareRight);
            } else if( i == numberOfPlayers - 1) {
                int compareLeft = Integer.compare( players[i].getWarPoints(), players[i - 1].getWarPoints());
                int compareRight  = Integer.compare( players[i].getWarPoints(), players[0].getWarPoints());
                setResults(i, compareLeft);
                setResults(i, compareRight);
            } else { //playerId is between edges
                int compareLeft = Integer.compare( players[i].getWarPoints(), players[i - 1].getWarPoints());
                int compareRight  = Integer.compare( players[i].getWarPoints(), players[i + 1].getWarPoints());
                setResults(i, compareLeft);
                setResults(i, compareRight);
            }
        }

    }

    public void setResults(int playerId, int compareResult){
        int victoryPoints;
        int defeatPoints = 1;
        if(curAgeNo == 1){
            victoryPoints = 1;
        } else if(curAgeNo == 2){
            victoryPoints = 3;
        } else{
            victoryPoints = 5;
        }
        winners = new ArrayList<Player>();
        losers = new ArrayList<Player>();
        if (compareResult == 0 ) {
            //xox
        } else if( compareResult > 0) {
            players[playerId].setCoin(players[playerId].getCoin() + victoryPoints);
            losers.add(players[playerId]);
        } else {
            players[playerId].setCoin(players[playerId].getCoin() - defeatPoints);
            winners.add(players[playerId]);
        }
    }

    public ArrayList<Player> getWinners(){
        return winners;
    }

    public ArrayList<Player> getLosers(){
        return losers;
    }
}

