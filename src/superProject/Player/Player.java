package superProject.Player;

import superProject.City.City;
import superProject.GameProperties.Card;
import superProject.GameProperties.Material;

import java.util.ArrayList;

public class Player {

    private int id;
    private String name; //added to print player at the end of war (I didn't know what to right) -Gonca
    private int warPoints; // war points
    private ArrayList<Card> cards; // cards in hand
    private int boardNum; // for connecting with board city
    private boolean isWinner; // check is winner or not.
    private ArrayList<Card> cardsOnTable;
    private int[] attributeList;
    private int score;
    private City city;
    ArrayList<Material> resources;

    int numberOfClay;
    int numberOfOre;
    int numberOfStone;
    int numberOfWood;
    int numberOfLoom;
    int numberOfGlass;
    int numberOfPapyrus;
    int numberOfMilitary;
    int numberOfCivilian;
    int numberOfCoin;
    int numberOfScienceRuler;
    int numberOfScienceStone;
    int numberOfScienceWheel;





    public Player() {
        id = 0;
        name = "Player " + (id + 1); //if not set, then it is a Bot and it has only number
        warPoints = 0;
        cards = new ArrayList<>();
        cardsOnTable = new ArrayList<>();;
        boardNum = 0;
        score = 0;
        isWinner = false;
        id = 0;
        city = new City();
        attributeList = new int[9];
        resources = new ArrayList<>();
        numberOfCoin = 0;
        numberOfClay = 0;
        numberOfOre = 0;
        numberOfStone = 0;
        numberOfWood = 0;
        numberOfLoom = 0;
        numberOfGlass= 0;
        numberOfPapyrus = 0;
        numberOfMilitary = 0;
        numberOfCivilian = 0;
        numberOfScienceRuler = 0;
        numberOfScienceStone = 0;
        numberOfScienceWheel = 0;
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
        numberOfCoin = 0;
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

        resources.add(city.getCardSpecs());
        ArrayList<Material> cityMaterials = city.getLevelItems();
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
            else if(resources.get(i).getName() == "Military"){
                numberOfMilitary += resources.get(i).getCount();
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
            else if(resources.get(i).getName() == "ScienceWheel"){
                numberOfScienceWheel += resources.get(i).getCount();
            }
            else{
                // do nothing.
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

        return enough;
    }

    public boolean[] verifySufficientResources(ArrayList<Card> cardsOnHand){
        //boolean arr[] = {0};
        return null;
    }

    public boolean verifySufficientResources(){
        return true;
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
        if(verifySufficientResources(c)){
            cardsOnTable.add(c);
        }
        System.out.println("Resources not enough");

    }

    @Override
    public String toString() {
        return name;
    }
}
