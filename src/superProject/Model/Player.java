package superProject.Model;

import java.util.ArrayList;

public class Player {

    private int coin;
    private int warPoint;
    private ArrayList<Card> cards;
    private int boardNum;
    private int score;
    private boolean isWinner;

    public Player(int coin, int warPoint, ArrayList<Card> cards, int boardNum, int score, boolean isWinner) {
        coin=0;
        warPoint=0;
        cards=null;
        boardNum=0;
        score=0;
        isWinner=false;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getWarPoint() {
        return warPoint;
    }

    public void setWarPoint(int warPoint) {
        this.warPoint = warPoint;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getBoardNum() {
        return boardNum;
    }

    public void setBoardNum(int boardNum) {
        this.boardNum = boardNum;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }
}
