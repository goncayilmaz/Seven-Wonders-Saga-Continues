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
    private WarWiew view;

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
                if(compareLeft == 0){
                    //TODO
                    //xox
                    //change compareLeft value
                }
                if(compareRight == 0){
                    //TODO
                    //xox
                    //change also compareRight value
                }
                setResults(i, compareLeft);
                setResults(i, compareRight);
                boolean isLeftWinner;
                boolean isRightWinner;
                if(compareLeft > 0) {
                    isLeftWinner = true;
                } else{
                    isLeftWinner = false;
                }
                if(compareRight > 0){
                    isRightWinner = true;
                } else{
                    isRightWinner = false;
                }
                view = new WarWiew(players[i], players[players.length-1], isLeftWinner,  players[1], isRightWinner);
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
        if( compareResult > 0) {
            players[playerId].setScore(players[playerId].getScore() + victoryPoints);
            losers.add(players[playerId]);
        } else {
            players[playerId].setScore(players[playerId].getScore() - defeatPoints);
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

