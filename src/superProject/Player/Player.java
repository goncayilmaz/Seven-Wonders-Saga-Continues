package superProject.Player;

import superProject.GameProperties.Card;

import java.util.ArrayList;

public class Player {

    private int id;
    private String name; //added to print player at the end of war (I didn't know what to right) -Gonca
    private int coin; // players coin
    private int warPoints; // war points
    private ArrayList<Card> cards; // cards in hand
    private int boardNum; // for connecting with board city
    private int score; // score of player
    private boolean isWinner; // check is winner or not.
    private ArrayList<Card> cardsOnTable;
    private int[] attributeList ;



    public Player() {
        coin=0;
        warPoints=0;
        cards=null;
        boardNum=0;
        score=0;
        isWinner=false;
        id = 0;
        name = "Player " + (id + 1); //if not set, then it is a Bot and it has only number
        attributeList = new int[9];
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getWarPoints() {
        return warPoints;
    }

    public void setWarPoints(int warPoint) {
        this.warPoints = warPoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ArrayList<Card> getCardsOnTable() {
        return cardsOnTable;
    }

    public void setCardsOnTable(ArrayList<Card> cardsOnTable) {
        this.cardsOnTable = cardsOnTable;
    }

    public void addCardsToTable(Card c) {
        cardsOnTable.add(c);
    }

    @Override
    public String toString() {
        return name;
    }
}
