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
    //private ArrayList<Card> cards; // cards in hand
    //private ArrayList<Card> cardsOnTable;
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
        this.id = 0;
        name = "Bot " + (id + 1); //if not set, then it is a Bot and it has only number
        //cards = super.getCards();
        //cardsOnTable = super.getCardsOnTable();
        city = new City();
        resources = new ArrayList<>();
    }

    public Bot(int id) {
        this.id = id;
        name = "Bot " + (id + 1); //if not set, then it is a Bot and it has only number
        //cards = super.getCards();
        //cardsOnTable = new ArrayList<>();;
        city = new City();
        resources = new ArrayList<>();
    }

    public Bot(int id, City city) {
        System.out.println("Bot constructor with City parameter");
        this.id = id;
        name = "Bot " + (this.id + 1); //if not set, then it is a Bot and it has only number
        //cards = super.getCards();
        //cardsOnTable = new ArrayList<>();;
        this.city = city;
        resources = new ArrayList<>();
    }

    /*
    public int numberOfCard(){
        return cardsOnTable.size();
    }

    public void setHand(ArrayList<Card> cards){
        this.cards = cards;
    } */



    /*
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
    */


    public Card doAction(int ageNumber, ArrayList<Player> players){
        // if(canbuild wonder) --> build wonder
        // else ----> take card
        System.out.println(" inside do action");
        return takeCard(ageNumber,players);
    }

    public void buildWonder(int ageNumber, ArrayList<Player> players){
        // TODO
    }

    private Card takeCard(int ageNumber, ArrayList<Player> players){
        ArrayList<Card> cards = super.getCards();
        ArrayList<Card> cardsOnTable = super.getCardsOnTable();
        // TAKE CARD
        if(cards.size() == 0){
            System.out.println("no cards on hand ");
            return null;
        }
        else {
            System.out.println("boo ");
            if (ageNumber == 1) {
                System.out.println("boo 2");
                for (int i = 0; i < cards.size(); i++) {
                    System.out.println("boo 3 ");
                    // IF CARD IS FREE, CONSIDER TAKING IT
                    if (cards.get(i).getRequirements().get(0).getName().equals("none")) {
                        // IF IT HAS SAME MATERIAL WITH WONDER
                        for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                            if (cards.get(i).getEarnings().get(j).isWonderConstructorMaterial()) {
                                //addCardsToTable(cards.get(i));
                                cardsOnTable.add(cards.get(i));
                                // System.out.println(" inside 1 " + addCardsToTable(cards.get(i)));
                                return cards.get(i);
                            }
                        }
                    }
                    // CARD NOT FREE
                    else {
                        // TAKE POSSİBLE MILITARY
                        for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                            if (cards.get(i).getEarnings().get(j).getName().equals("Military") && verifySufficientResources(cards.get(i))) {
                                //System.out.println(" inside 2 " + addCardsToTable(cards.get(i)));
                                cardsOnTable.add(cards.get(i));
                                return cards.get(i);
                                //addCardsToTable(cards.get(i));
                            }
                        }
                        // TAKE POSSIBLE CIVILIAN
                        for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                            if (cards.get(i).getEarnings().get(j).getName().equals("Civilian") && verifySufficientResources(cards.get(i))) {
                                cardsOnTable.add(cards.get(i));
                                //addCardsToTable(cards.get(i));
                                //System.out.println(" inside 3 " + addCardsToTable(cards.get(i)));
                                return cards.get(i);
                            }
                        }
                        // TAKE POSSIBLE SCIENCE
                        for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                            if ((cards.get(i).getEarnings().get(j).getName().equals("ScienceRuler") ||
                                    cards.get(i).getEarnings().get(j).getName().equals("ScienceWheel") ||
                                    cards.get(i).getEarnings().get(j).getName().equals("ScienceStone")) && verifySufficientResources(cards.get(i))) {
                                cardsOnTable.add(cards.get(i));
                                //addCardsToTable(cards.get(i));
                                // System.out.println(" inside 4" + addCardsToTable(cards.get(i)));
                                return cards.get(i);
                            }
                        }
                    }
                    System.out.println(" inside 5" + addCardsToTable(cards.get(i)));
                }
                // NONE OF THEM HAPPENED TAKE THE FIRST AVAILABLE CARD
                for (int i = 0; i < cards.size(); i++) {
                    if (verifySufficientResources(cards.get(i))) {
                        cardsOnTable.add(cards.get(i));
                        return cards.get(i);
                        //addCardsToTable(cards.get(i));
                        //System.out.println(" inside 6 " + addCardsToTable(cards.get(i)));
                    }
                }
            } else if (ageNumber == 2) {
                for (int i = 0; i < cards.size(); i++) {
                    // IF CARD IS FREE, CONSIDER TAKING IT
                    // IF IT HAS SAME MATERIAL WITH WONDER
                    if (cards.get(i).getRequirements().get(0).getName().equals("none")) {
                        for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                            if (cards.get(i).getEarnings().get(j).isWonderConstructorMaterial()) {
                                cardsOnTable.add(cards.get(i));
                                return cards.get(i);
                            }
                        }
                    }
                    // CARD NOT FREE
                    else {
                        // TAKE POSSİBLE MILITARY
                        for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                            if (cards.get(i).getEarnings().get(j).getName().equals("Military") && verifySufficientResources(cards.get(i))) {
                                cardsOnTable.add(cards.get(i));
                                //addCardsToTable(cards.get(i));
                                return cards.get(i);
                            }
                        }
                        // TAKE POSSIBLE CIVILIAN
                        for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                            if (cards.get(i).getEarnings().get(j).getName().equals("Civilian") && verifySufficientResources(cards.get(i))) {
                                cardsOnTable.add(cards.get(i));
                                //addCardsToTable(cards.get(i));
                                return cards.get(i);
                            }
                        }
                        // TAKE POSSIBLE SCIENCE
                        for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                            if ((cards.get(i).getEarnings().get(j).getName().equals("ScienceRuler") ||
                                    cards.get(i).getEarnings().get(j).getName().equals("ScienceWheel") ||
                                    cards.get(i).getEarnings().get(j).getName().equals("ScienceStone")) && verifySufficientResources(cards.get(i))) {
                                cardsOnTable.add(cards.get(i));
                                //addCardsToTable(cards.get(i));
                                return cards.get(i);
                            }
                        }
                    }
                }
                // NONE OF THEM HAPPENED TAKE THE FIRST AVAILABLE CARD
                for (int i = 0; i < cards.size(); i++) {
                    if (verifySufficientResources(cards.get(i))) {
                        cardsOnTable.add(cards.get(i));
                        return cards.get(i);
                        //addCardsToTable(cards.get(i));
                    }
                }
            } else if (ageNumber == 3) {
                for (int i = 0; i < cards.size(); i++) {
                    // TAKE THE POSSIBLE PURPLE CARD
                    if ((cards.get(i).getId() == 51 && verifySufficientResources(cards.get(i))) || (cards.get(i).getId() == 52 && verifySufficientResources(cards.get(i))) ||
                            (cards.get(i).getId() == 53 && verifySufficientResources(cards.get(i))) || (cards.get(i).getId() == 54 && verifySufficientResources(cards.get(i)))
                            || (cards.get(i).getId() == 55 && verifySufficientResources(cards.get(i))) || (cards.get(i).getId() == 56 && verifySufficientResources(cards.get(i)))
                            || (cards.get(i).getId() == 57 && verifySufficientResources(cards.get(i))) || (cards.get(i).getId() == 58 && verifySufficientResources(cards.get(i)))
                            || (cards.get(i).getId() == 59 && verifySufficientResources(cards.get(i)))
                            || (cards.get(i).getId() == 60 && verifySufficientResources(cards.get(i)))) {
                        cardsOnTable.add(cards.get(i));
                        //addCardsToTable(cards.get(i));
                        return cards.get(i);
                    }
                    // TAKE POSSİBLE MILITARY
                    for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                        if (cards.get(i).getEarnings().get(j).getName().equals("Military") && verifySufficientResources(cards.get(i))) {
                            cardsOnTable.add(cards.get(i));
                            //addCardsToTable(cards.get(i));
                            return cards.get(i);
                        }
                    }
                    // TAKE POSSIBLE CIVILIAN
                    for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                        if (cards.get(i).getEarnings().get(j).getName().equals("Civilian") && verifySufficientResources(cards.get(i))) {
                            cardsOnTable.add(cards.get(i));
                            //addCardsToTable(cards.get(i));
                            return cards.get(i);
                        }
                    }
                    // TAKE POSSIBLE SCIENCE
                    for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                        if (((cards.get(i).getEarnings().get(j).getName().equals("ScienceRuler") && verifySufficientResources(cards.get(i))) ||
                                (cards.get(i).getEarnings().get(j).getName().equals("ScienceWheel") && verifySufficientResources(cards.get(i))) ||
                                (cards.get(i).getEarnings().get(j).getName().equals("ScienceStone") && verifySufficientResources(cards.get(i))))) {
                            cardsOnTable.add(cards.get(i));
                            //addCardsToTable(cards.get(i));
                            return cards.get(i);
                        }
                    }
                }
                // NONE OF THEM HAPPENED TAKE THE FIRST AVAILABLE CARD
                for (int i = 0; i < cards.size(); i++) {
                    if (verifySufficientResources(cards.get(i))) {
                        cardsOnTable.add(cards.get(i));
                        return cards.get(i);
                        //addCardsToTable(cards.get(i));
                    }
                }
            } else {
                System.out.println("DO NOTHİNG");
                return null;
                // do nothing.
            }
        }
        return null;
    }

    @Override
    public void print(){
        System.out.println("Bot Id: " + id + " name :" + name);
        city.print();
        System.out.println("CARDS");
        for(int i = 0; i < super.getCardsOnTable().size(); i++){
            super.getCardsOnTable().get(i).print();
        }
    }



}
