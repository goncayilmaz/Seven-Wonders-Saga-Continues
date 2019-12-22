package superProject.Player;

import superProject.City.City;
import superProject.GameProperties.Card;
import superProject.GameProperties.Material;

import java.util.ArrayList;

public class Bot extends Player{

    //private static int id_count = 0;
    private int id;
    private String name; //added to print player at the end of war (I didn't know what to right) -Gonca
    private int warPoints; // war points
    private ArrayList<Card> cards; // cards in hand
    private ArrayList<Card> cardsOnTable;
    private int boardNum; // for connecting with board city
    private int score;
    private City city;
    private ArrayList<Material> resources;
    //you do not need to initalize integers, if their initial value is zero
    int numberOfCoin;
    int numberOfClay;
    int numberOfOre;
    int numberOfStone;
    int numberOfWood;
    int numberOfLoom;
    int numberOfGlass;
    int numberOfPapyrus;
    int numberOfMilitary;
    int numberOfCivilian;
    int numberOfScienceRuler;
    int numberOfScienceStone;
    int numberOfScienceWheel;


    public Bot() {
        name = "Bot " + (id + 1); //if not set, then it is a Bot and it has only number
        cards = new ArrayList<>();
        cardsOnTable = new ArrayList<>();;
        city = new City();
        resources = new ArrayList<>();
    }

    public Bot(int id) {
        id =  this.id;
        name = "Bot " + (id + 1); //if not set, then it is a Bot and it has only number
        cards = new ArrayList<>();
        cardsOnTable = new ArrayList<>();;
        city = new City();
        resources = new ArrayList<>();
    }

    public Bot(int id, City city) {
        System.out.println("Bot constructor with City parameter");
        this.id = id;
        name = "Bot " + (this.id + 1); //if not set, then it is a Bot and it has only number
        cards = new ArrayList<>();
        cardsOnTable = new ArrayList<>();;
        this.city = city;
        resources = new ArrayList<>();
    }



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
            //TODO
            // savaş kartı oynama
        }
        else if(playerWarPoint>nearPlayer&&playerWarPoint<awayPlayer){
            //TODO
            // savaş kartı oynamak için booolean random at
        }
        else if(playerWarPoint<nearPlayer&&playerWarPoint>awayPlayer){
            //TODO
            // savaş kartı oynamak için booolean random at
        }
        else{
            //TODO
            //kesin savaş kartı at.
        }
        return card;
    }

    @Override
    public void print(){
        System.out.println("Id: " + id + " name :" + name);
        city.print();
        System.out.println("CARDS");
        for(int i = 0; i < cardsOnTable.size(); i++){
            cardsOnTable.get(i).print();
        }
    }


}
