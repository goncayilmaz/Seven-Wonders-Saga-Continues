package superProject.Player;

import superProject.City.City;
import superProject.GameProperties.Card;
import superProject.GameProperties.Material;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Player {

    private int id;
    private String name; //
    private int warPoints; // war points
    private ArrayList<Card> cards; // cards in hand
    private ArrayList<Card> cardsOnTable;
    private int boardNum; // for connecting with board city
    private int score;
    private City city;
    private ArrayList<Material> resources;
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


    public Player() {
        this.id = 0;
        this.name = "Player " + (id + 1); //if not set, then it is a Bot and it has only number
        this.cards = new ArrayList<>();
        this.cardsOnTable = new ArrayList<>();;
        this.city = new City();
        this.resources = new ArrayList<>();
        this.score = 0;
        this.numberOfCoin = 3;
    }

    public Player(int id, City city) {
        this.id = id;
        this.city = city;
        this.name = "Player " + (id + 1); //if not set, then it is a Bot and it has only number
        this.cards = new ArrayList<>();
        this.cardsOnTable = new ArrayList<>();;
        this.resources = new ArrayList<>();
        this.score = 0;
        this.numberOfCoin = 3;
    }

    public ArrayList<Material> calculateResources(){
        numberOfClay = 0;
        numberOfOre = 0;
        numberOfStone = 0;
        numberOfWood = 0;
        numberOfLoom = 0;
        numberOfGlass= 0;
        numberOfPapyrus = 0;
        numberOfMilitary = 0;
        numberOfCivilian = 0;
        //numberOfCoin = 0;
        numberOfScienceRuler = 0;
        numberOfScienceStone = 0;
        numberOfScienceWheel = 0;

        ArrayList<Material> resources = new ArrayList<>();
        for(int i = 0; i < cardsOnTable.size(); i++){
            Card nextCard = cardsOnTable.get(i);
            for(int j = 0; j < nextCard.getEarnings().size(); j++){
                resources.add(nextCard.getEarnings().get(j));
            }
        }
        //System.out.println("inside calculate");
        city.print();
        resources.add(city.getCardSpecs());
        ArrayList<Material> cityMaterials = city.getLevelItems();
        System.out.println("city materials");

        System.out.println(cityMaterials.size());
        for(int i = 0; i < cityMaterials.size(); i++){
            resources.add(cityMaterials.get(i));
        }

        for(int i = 0; i < resources.size(); i++){
            if(resources.get(i).getName() == "Clay"){
                numberOfClay += resources.get(i).getCount();
            }
            else if(resources.get(i).getName() == "Ore"){
                numberOfOre += resources.get(i).getCount();
            }
            else if(resources.get(i).getName() == "Stone"){
                numberOfStone += resources.get(i).getCount();
            }
            else if(resources.get(i).getName() == "Wood"){
                numberOfWood += resources.get(i).getCount();
            }
            else if(resources.get(i).getName() == "Loom"){
                numberOfLoom += resources.get(i).getCount();
            }
            else if(resources.get(i).getName() == "Glass"){
                numberOfGlass += resources.get(i).getCount();
            }
            else if(resources.get(i).getName() == "Papyrus"){
                numberOfPapyrus += resources.get(i).getCount();
            }
            else if(resources.get(i).getName().equals("Military")){
                numberOfMilitary += resources.get(i).getCount();
                warPoints = numberOfMilitary;
            }
            else if(resources.get(i).getName() == "Civilian"){
                numberOfCivilian += resources.get(i).getCount();
            }
            else if(resources.get(i).getName() == "Coin"){
                numberOfCoin += resources.get(i).getCount();
            }
            else if(resources.get(i).getName() == "ScienceRuler"){
                numberOfScienceRuler += resources.get(i).getCount();
            }
            else if(resources.get(i).getName() == "ScienceStone"){
                numberOfScienceStone += resources.get(i).getCount();
            }
            else if(resources.get(i).getName() == "ScienceWheel") {
                numberOfScienceWheel += resources.get(i).getCount();
            }
        }
        return resources;
    }


    public boolean verifySufficientResources(Card card){
        calculateResources();
        ArrayList<Material> requirements = card.getRequirements();
        boolean enough = true;

        for(int i = 0; i < requirements.size(); i++){
            if(requirements.get(i).getName().equals("Clay")){
                if(numberOfClay < requirements.get(i).getCount()){
                    enough = false;
                }
            }
            else if(requirements.get(i).getName().equals("Ore")){
                if(numberOfOre < requirements.get(i).getCount()){
                    enough = false;
                }
            }
            else if(requirements.get(i).getName().equals("Stone")){
                if(numberOfStone < requirements.get(i).getCount()){
                    enough = false;
                }
            }
            else if(requirements.get(i).getName().equals("Wood")){
                if(numberOfWood < requirements.get(i).getCount()){
                    enough = false;
                }
            }
            else if(requirements.get(i).getName().equals("Loom")){
                if(numberOfLoom < requirements.get(i).getCount()){
                    enough = false;
                }
            }
            else if(requirements.get(i).getName().equals("Glass")){
                if(numberOfGlass < requirements.get(i).getCount()){
                    enough = false;
                }
            }
            else if(requirements.get(i).getName().equals("Papyrus")){
                if(numberOfPapyrus < requirements.get(i).getCount()){
                    enough = false;
                }
            }
            else if(requirements.get(i).getName().equals("Military")){
                if(numberOfMilitary < requirements.get(i).getCount()){
                    enough = false;
                }
            }
            else if(requirements.get(i).getName().equals("Civilian")){
                if(numberOfMilitary < requirements.get(i).getCount()){
                    enough = false;
                }
            }
            else if(requirements.get(i).getName().equals("Coin")){
                if(numberOfCoin < requirements.get(i).getCount()){
                    enough = false;
                }
            }
            else if(requirements.get(i).getName().equals("ScienceRuler")){
                if(numberOfScienceRuler < requirements.get(i).getCount()){
                    enough = false;
                }
            }
            else if(requirements.get(i).getName().equals("ScienceStone")){
                if(numberOfScienceStone < requirements.get(i).getCount()){
                    enough = false;
                }
            }
            else if(requirements.get(i).getName().equals("ScienceWheel")){
                if(numberOfScienceWheel < requirements.get(i).getCount()){
                    enough = false;
                }
            }
            else{
                // do nothing
            }

        }
        // implementing card chain
        for(int i = 0; i < cardsOnTable.size(); i++){
            if(cardsOnTable.get(i).getNextCardId() == card.getId())
                enough = true;
        }
        System.out.println("Can take card" + enough);
        return enough;
    }

    public void setCity(City city){
        this.city = city;
    }

    public City getCity(){
        return this.city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoin() {
        return numberOfCoin;
    }

    public void setCoin(int numberOfCoin) {
        this.numberOfCoin = numberOfCoin;
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
        ArrayList<Card> temp  = new ArrayList<>();
        for(int i = 0; i < cards.size(); i++)
        {
            if( !(cards.get(i).isUsed()))
                temp.add(cards.get(i));
        }
        return temp;
    }

    public ArrayList<Card> getUsedCards()
    {
        ArrayList<Card> temp  = new ArrayList<>();
        for(int i = 0; i < cards.size(); i++)
        {
            if((cards.get(i).isUsed()))
                temp.add(cards.get(i));
        }
        return temp;
    }
    public int numberOfCardAtHand(){
        return getCards().size();
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

    public ArrayList<Card> getCardsOnTable() {
        return cardsOnTable;
    }

    public void setCardsOnTable(ArrayList<Card> cardsOnTable) {
        this.cardsOnTable = cardsOnTable;
    }

    public String addCardsToTable(Card c) {
        if(verifySufficientResources(c)){
            c.setUsed(true);
            cardsOnTable.add(c);
            return "";
        }else{
            return ("Resources are not enough");
        }
    }

    public void addToHandAtFirst(Card c){
        cards.add(c);
    }

    public void removeFromHand(Card c) { cards.remove(c); }

    public void disjointCard(Card c){
        for(int i = 0; i < cards.size(); i++){
            if(cards.get(i).getName().equals(c.getName())){
                System.out.println("discarding inside method");
                cards.get(i).setUsed(true);
                numberOfCoin = numberOfCoin + 3;
                return;
            }
        }
    }



    public int calculateTotalScore(Player leftNeighbour, Player rightNeighbour){
        score = 0;
        score += warPoints; // points from military conflicts
        score += (int) (numberOfCoin / 3); // points from treasury content
        score += city.getNumberWonderPoints();
        score += numberOfCivilian; // points from civilian
        score += numberOfScienceRuler * numberOfScienceRuler;
        score += numberOfScienceStone * numberOfScienceStone;
        score += numberOfScienceWheel * numberOfScienceWheel;


        for(int i = 0; i < cardsOnTable.size(); i++){
            if(cardsOnTable.get(i).getName().equals("workersguild")){
                score += leftNeighbour.getNumberOfBrownCardsOnTable();
                score += rightNeighbour.getNumberOfBrownCardsOnTable();
            }
            else if(cardsOnTable.get(i).getName().equals("craftsmenguild")){
                score += leftNeighbour.getNumberOfGreyCardsOnTable();
                score += rightNeighbour.getNumberOfGreyCardsOnTable();
            }
            else if(cardsOnTable.get(i).getName().equals("tradersguild")){
                score += leftNeighbour.getNumberOfYellowCardsOnTable();
                score += rightNeighbour.getNumberOfYellowCardsOnTable();
            }
            else if(cardsOnTable.get(i).getName().equals("philosophersguild")){
                score += leftNeighbour.getNumberOfGreenCardsOnTable();
                score += rightNeighbour.getNumberOfGreenCardsOnTable();
            }
            else if(cardsOnTable.get(i).getName().equals("spiesguild")){
                score += leftNeighbour.getNumberOfRedCardsOnTable();
                score += rightNeighbour.getNumberOfRedCardsOnTable();
            }
            else if(cardsOnTable.get(i).getName().equals("strategistsguild")){

            }
            else if(cardsOnTable.get(i).getName().equals("shipownersguild")){
                score += getNumberOfBrownCardsOnTable();
                score += getNumberOfGreyCardsOnTable();
                score += getNumberOfPurpleCardsOnTable();
            }
            else if(cardsOnTable.get(i).getName().equals("scientistsguild")){
                Integer[] nums = {numberOfScienceStone,numberOfScienceWheel,numberOfScienceWheel};
                int max = Collections.max(Arrays.asList(nums));
                score += ((max + 1) * (max + 1)) - (max * max);
            }
            else if(cardsOnTable.get(i).getName().equals("magistratesguild")){
                score += leftNeighbour.getNumberOfBlueCardsOnTable();
                score += rightNeighbour.getNumberOfBlueCardsOnTable();
            }
            else if(cardsOnTable.get(i).getName().equals("buildersguild")){
                score += leftNeighbour.getCity().getBoardLevel();
                score += leftNeighbour.getCity().getBoardLevel();
                score += city.getBoardLevel();
            }
            else{
                // do nothing
            }
        }
        return score;
    }


    public int getNumberOfBrownCardsOnTable(){
        int count = 0;
        for(int i = 0; i < cardsOnTable.size(); i++){
            if(cardsOnTable.get(i).getColor().equals("Brown"))
                count++;
        }
        return count;
    }
    public int getNumberOfGreyCardsOnTable(){
        int count = 0;
        for(int i = 0; i < cardsOnTable.size(); i++){
            if(cardsOnTable.get(i).getColor().equals("Grey"))
                count++;
        }
        return count;
    }
    public int getNumberOfYellowCardsOnTable(){
        int count = 0;
        for(int i = 0; i < cardsOnTable.size(); i++){
            if(cardsOnTable.get(i).getColor().equals("Yellow"))
                count++;
        }
        return count;
    }
    public int getNumberOfRedCardsOnTable(){
        int count = 0;
        for(int i = 0; i < cardsOnTable.size(); i++){
            if(cardsOnTable.get(i).getColor().equals("Red"))
                count++;
        }
        return count;
    }
    public int getNumberOfGreenCardsOnTable(){
        int count = 0;
        for(int i = 0; i < cardsOnTable.size(); i++){
            if(cardsOnTable.get(i).getColor().equals("Green"))
                count++;
        }
        return count;
    }
    public int getNumberOfBlueCardsOnTable(){
        int count = 0;
        for(int i = 0; i < cardsOnTable.size(); i++){
            if(cardsOnTable.get(i).getColor().equals("Blue"))
                count++;
        }
        return count;
    }
    public int getNumberOfPurpleCardsOnTable(){
        int count = 0;
        for(int i = 0; i < cardsOnTable.size(); i++){
            if(cardsOnTable.get(i).getColor().equals("Purple"))
                count++;
        }
        return count;
    }



    public void print(){
        System.out.println("PLAYER " + id + " name : " + name + " coin " + numberOfCoin);
        city.print();
        System.out.println("CARDS ON TABLE");
        for(int i = 0; i < cardsOnTable.size(); i++){
            cardsOnTable.get(i).print();
        }
        System.out.println("CARDS ON HAND");
        for(int i = 0; i < cards.size(); i++){
            cards.get(i).print();
        }
        for(int i = 0; i < 5; i++){
            System.out.println();
        }



    }

    @Override
    public String toString() {
        return name;
    }
}
