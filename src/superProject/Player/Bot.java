package superProject.Player;

import superProject.City.City;
import superProject.GameProperties.Card;
import superProject.GameProperties.Material;

import java.util.ArrayList;

public class Bot extends Player{

    private int id;
    private String name; //added to print player at the end of war (I didn't know what to right) -Gonca
    private int warPoints; // war points
    private int boardNum; // for connecting with board city
    private int score;
    private Card lastCardPlayed;




    public Bot() {
        super();
        this.id = 0;
        this.name = "Bot " + (id + 1); //if not set, then it is a Bot and it has only number
        lastCardPlayed = new Card();
    }

    public Bot(int id) {
        super();
        this.id = id;
        this.name = "Bot " + (this.id + 1); //if not set, then it is a Bot and it has only number
        lastCardPlayed = new Card();
    }

    public Bot(int id, City city) {
        super(id,city);
        this.id = id;
        this.name = "Bot " + (id + 1); //if not set, then it is a Bot and it has only number
        lastCardPlayed = new Card();
        System.out.println("Bot constructor with City parameter");
    }

    public Card getLastCardPlayed(){
        return lastCardPlayed;
    }
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


    public int doAction(int ageNumber, ArrayList<Player> players){
        // if can build wonder, build wonder
//        if(super.getCity().construct(super.getCity(),this)){
//            super.getCity().increaseLevel(this);
//        // else take card
//        }else{
//            return takeCard(ageNumber,players);
//        }
//        // if(canbuild wonder) --> build wonder
//        // else ----> take card
        return takeCard(ageNumber,players);

    }

    public void buildWonder(int ageNumber, ArrayList<Player> players){
        // TODO
    }
    // -1 başarısız, 0 kart alma, 1 discard etme, 2 wonder yapma
/*
    private int takeCard(int ageNumber, ArrayList<Player> players){
        Card cardToTake = new Card();
        City city = super.getCity();
        ArrayList<Card> cardOnHand = super.getCards();
        ArrayList<Card> cardOnTable = super.getCardsOnTable();

        if(ageNumber == 1){
            // IF CARD IS FREE AND WONDER MATERIAL, TAKE IT
            for(int i = 0; i < cardOnHand.size(); i++){
                ArrayList<Material> reqs = cardOnHand.get(i).getRequirements();
                for(int j = 0; j < reqs.size(); j++) {
                    if (reqs.get(j).getName().equals("none")) {
                        ArrayList<Material> earnings = cardOnHand.get(i).getEarnings();
                        for (int k = 0; k < earnings.size(); k++) {
                            if (city.isWonderConstructMaterialForCity(earnings.get(k))) {
                                lastCardPlayed = new Card(cardOnHand.get(i));
                                if(addCardsToTable(cardOnHand.get(i)).equals("")){
                                    return 1;
                                }
                                else{
                                    System.out.println("Inside free wonder material but card could not added ");
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }
            // NO FREE AND WONDER MATERIAL CARD, TAKE POSSİBLE MILITARY
            for(int i = 0; i < cardOnHand.size(); i++){
                for(int j = 0; j < cardOnHand.get(i).getEarnings().size(); j++){
                    if(cardOnHand.get(i).getEarnings().get(j).getName().equals("Military") && verifySufficientResources(cardOnHand.get(i))){
                        System.out.println("taking military card");
                        //cards.get(i).print();
                        super.addCardsToTable(cardOnHand.get(i));
                        lastCardPlayed = new Card(cardOnHand.get(i));
                        return 0;
                    }
                }
            }
            // NO FREE AND WONDER MATERIAL CARD, TAKE POSSİBLE CIVILIAN
            for(int i = 0; i < cardOnHand.size(); i++){
                for(int j = 0; j < cardOnHand.get(i).getEarnings().size(); j++){
                    if(cardOnHand.get(i).getEarnings().get(j).getName().equals("Civilian") && verifySufficientResources(cardOnHand.get(i))){
                        System.out.println("taking civilian card");
                        //cards.get(i).print();
                        super.addCardsToTable(cardOnHand.get(i));
                        lastCardPlayed = new Card(cardOnHand.get(i));
                        return 0;
                    }
                }
            }
            // NO FREE AND WONDER MATERIAL CARD, TAKE POSSIBLE SCIENCE
            for(int i = 0; i < cardOnHand.size(); i++){
                for(int j = 0; j < cardOnHand.get(i).getEarnings().size(); j++){
                    if((cardOnHand.get(i).getEarnings().get(j).getName().equals("ScienceRuler") || cardOnHand.get(i).getEarnings().get(j).getName().equals("ScienceWheel") || cardOnHand.get(i).getEarnings().get(j).getName().equals("ScienceStone")) && verifySufficientResources(cardOnHand.get(i))){
                        System.out.println("taking science card");
                        super.addCardsToTable(cardOnHand.get(i));
                        lastCardPlayed = new Card(cardOnHand.get(i));
                        return 0;
                    }
                }
            }
            // NONE OF THEM HAPPENED TAKE THE FIRST AVAILABLE CARD
            for (int i = 0; i < cardOnHand.size(); i++) {
                if (verifySufficientResources(cardOnHand.get(i))) {
                    System.out.println("taking first available card");
                    cardOnHand.get(i).print();
                    super.addCardsToTable(cardOnHand.get(i));
                    lastCardPlayed = new Card(cardOnHand.get(i));
                    return 0;
                }
            }
            // NO AVAILABLE CARD, DISCARD
            System.out.println("DISCARDING CARD");
            super.disjointCard(cardOnHand.get(0));
            lastCardPlayed = new Card(cardOnHand.get(0));
            return 1;

        }
        else if(ageNumber == 2){
            // IF CARD IS FREE AND WONDER MATERIAL, TAKE IT
            for(int i = 0; i < cardOnHand.size(); i++){
                ArrayList<Material> reqs = cardOnHand.get(i).getRequirements();
                for(int j = 0; j < reqs.size(); j++) {
                    if (reqs.get(j).getName().equals("none")) {
                        ArrayList<Material> earnings = cardOnHand.get(i).getEarnings();
                        for (int k = 0; k < earnings.size(); k++) {
                            if (city.isWonderConstructMaterialForCity(earnings.get(k))) {
                                lastCardPlayed = new Card(cardOnHand.get(i));
                                if(addCardsToTable(cardOnHand.get(i)).equals("")){
                                    return 1;
                                }
                                else{
                                    System.out.println("Inside free wonder material but card could not added ");
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }
            // NO FREE AND WONDER MATERIAL CARD, TAKE POSSİBLE MILITARY
            for(int i = 0; i < cardOnHand.size(); i++){
                for(int j = 0; j < cardOnHand.get(i).getEarnings().size(); j++){
                    if(cardOnHand.get(i).getEarnings().get(j).getName().equals("Military") && verifySufficientResources(cardOnHand.get(i))){
                        System.out.println("taking military card");
                        //cards.get(i).print();
                        super.addCardsToTable(cardOnHand.get(i));
                        lastCardPlayed = new Card(cardOnHand.get(i));
                        return 0;
                    }
                }
            }
            // NO FREE AND WONDER MATERIAL CARD, TAKE POSSİBLE CIVILIAN
            for(int i = 0; i < cardOnHand.size(); i++){
                for(int j = 0; j < cardOnHand.get(i).getEarnings().size(); j++){
                    if(cardOnHand.get(i).getEarnings().get(j).getName().equals("Civilian") && verifySufficientResources(cardOnHand.get(i))){
                        System.out.println("taking civilian card");
                        //cards.get(i).print();
                        super.addCardsToTable(cardOnHand.get(i));
                        lastCardPlayed = new Card(cardOnHand.get(i));
                        return 0;
                    }
                }
            }
            // NO FREE AND WONDER MATERIAL CARD, TAKE POSSIBLE SCIENCE
            for(int i = 0; i < cardOnHand.size(); i++){
                for(int j = 0; j < cardOnHand.get(i).getEarnings().size(); j++){
                    if((cardOnHand.get(i).getEarnings().get(j).getName().equals("ScienceRuler") || cardOnHand.get(i).getEarnings().get(j).getName().equals("ScienceWheel") || cardOnHand.get(i).getEarnings().get(j).getName().equals("ScienceStone")) && verifySufficientResources(cardOnHand.get(i))){
                        System.out.println("taking science card");
                        super.addCardsToTable(cardOnHand.get(i));
                        lastCardPlayed = new Card(cardOnHand.get(i));
                        return 0;
                    }
                }
            }
            // NONE OF THEM HAPPENED TAKE THE FIRST AVAILABLE CARD
            for (int i = 0; i < cardOnHand.size(); i++) {
                if (verifySufficientResources(cardOnHand.get(i))) {
                    System.out.println("taking first available card");
                    cardOnHand.get(i).print();
                    super.addCardsToTable(cardOnHand.get(i));
                    lastCardPlayed = new Card(cardOnHand.get(i));
                    return 0;
                }
            }
            // NO AVAILABLE CARD, DISCARD
            System.out.println("DISCARDING CARD");
            super.disjointCard(cardOnHand.get(0));
            lastCardPlayed = new Card(cardOnHand.get(0));
            return 1;

        }
        else  if(ageNumber == 3){
            // TAKE POSSIBLE PURPLE CARD
            for (int i = 0; i < cardOnHand.size(); i++) {
                // TAKE THE POSSIBLE PURPLE CARD
                if ((cardOnHand.get(i).getId() == 51 && verifySufficientResources(cardOnHand.get(i))) || (cardOnHand.get(i).getId() == 52 && verifySufficientResources(cardOnHand.get(i))) ||
                        (cardOnHand.get(i).getId() == 53 && verifySufficientResources(cardOnHand.get(i))) || (cardOnHand.get(i).getId() == 54 && verifySufficientResources(cardOnHand.get(i)))
                        || (cardOnHand.get(i).getId() == 55 && verifySufficientResources(cardOnHand.get(i))) || (cardOnHand.get(i).getId() == 56 && verifySufficientResources(cardOnHand.get(i)))
                        || (cardOnHand.get(i).getId() == 57 && verifySufficientResources(cardOnHand.get(i))) || (cardOnHand.get(i).getId() == 58 && verifySufficientResources(cardOnHand.get(i)))
                        || (cardOnHand.get(i).getId() == 59 && verifySufficientResources(cardOnHand.get(i)))
                        || (cardOnHand.get(i).getId() == 60 && verifySufficientResources(cardOnHand.get(i)))) {
                    super.addCardsToTable(cardOnHand.get(i));
                    cardOnHand.get(i).setUsed(true);
                    lastCardPlayed = new Card(cardOnHand.get(i));
                    return 0;
                }
            }
            // NO FREE AND WONDER MATERIAL CARD, TAKE POSSİBLE MILITARY
            for(int i = 0; i < cardOnHand.size(); i++){
                for(int j = 0; j < cardOnHand.get(i).getEarnings().size(); j++){
                    if(cardOnHand.get(i).getEarnings().get(j).getName().equals("Military") && verifySufficientResources(cardOnHand.get(i))){
                        System.out.println("taking military card");
                        //cards.get(i).print();
                        super.addCardsToTable(cardOnHand.get(i));
                        lastCardPlayed = new Card(cardOnHand.get(i));
                        return 0;
                    }
                }
            }
            // NO FREE AND WONDER MATERIAL CARD, TAKE POSSİBLE CIVILIAN
            for(int i = 0; i < cardOnHand.size(); i++){
                for(int j = 0; j < cardOnHand.get(i).getEarnings().size(); j++){
                    if(cardOnHand.get(i).getEarnings().get(j).getName().equals("Civilian") && verifySufficientResources(cardOnHand.get(i))){
                        System.out.println("taking civilian card");
                        //cards.get(i).print();
                        super.addCardsToTable(cardOnHand.get(i));
                        lastCardPlayed = new Card(cardOnHand.get(i));
                        return 0;
                    }
                }
            }
            // NO FREE AND WONDER MATERIAL CARD, TAKE POSSIBLE SCIENCE
            for(int i = 0; i < cardOnHand.size(); i++){
                for(int j = 0; j < cardOnHand.get(i).getEarnings().size(); j++){
                    if((cardOnHand.get(i).getEarnings().get(j).getName().equals("ScienceRuler") || cardOnHand.get(i).getEarnings().get(j).getName().equals("ScienceWheel") || cardOnHand.get(i).getEarnings().get(j).getName().equals("ScienceStone")) && verifySufficientResources(cardOnHand.get(i))){
                        System.out.println("taking science card");
                        super.addCardsToTable(cardOnHand.get(i));
                        lastCardPlayed = new Card(cardOnHand.get(i));
                        return 0;
                    }
                }
            }
            // NONE OF THEM HAPPENED TAKE THE FIRST AVAILABLE CARD
            for (int i = 0; i < cardOnHand.size(); i++) {
                if (verifySufficientResources(cardOnHand.get(i))) {
                    System.out.println("taking first available card");
                    cardOnHand.get(i).print();
                    super.addCardsToTable(cardOnHand.get(i));
                    lastCardPlayed = new Card(cardOnHand.get(i));
                    return 0;
                }
            }
            // NO AVAILABLE CARD, DISCARD
            System.out.println("DISCARDING CARD");
            super.disjointCard(cardOnHand.get(0));
            lastCardPlayed = new Card(cardOnHand.get(0));
            return 1;

        }else {
            System.out.println("Age number not valid");
            return -1;
        }
    }*/

    private int takeCard(int ageNumber, ArrayList<Player> players){
        ArrayList<Card> cards = super.getCards();
        ArrayList<Card> cardsOnTable = super.getCardsOnTable();
        City city = super.getCity();
        // TAKE CARD
        if(cards.size() == 0){
            System.out.println("no cards on hand ");
            return -1;
        }
        else {
            if (ageNumber == 1) {
                for (int i = 0; i < cards.size(); i++) {
                    // IF CARD IS FREE, CONSIDER TAKING IT
                    if(cards.get(i).getRequirements().get(0).getName().equals("none")) {
                        // IF IT HAS SAME MATERIAL WITH WONDER
                        for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                            if(city.isWonderConstructMaterialForCity(cards.get(i).getEarnings().get(j))) {
                                super.addCardsToTable(cards.get(i));
                                cards.get(i).setUsed(true);
                                lastCardPlayed = new Card(cards.get(i));
                                return 0;
                            }
                        }
                    }
                    // CARD NOT FREE or NOT CONSTRUCT MATERIAL
                    else {
                        // TAKE POSSİBLE MILITARY
                        for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                            if(cards.get(i).getEarnings().get(j).getName().equals("Military") && verifySufficientResources(cards.get(i))) {
                                System.out.println("taking military card");
                                //cards.get(i).print();
                                super.addCardsToTable(cards.get(i));
                                cards.get(i).setUsed(true);
                                lastCardPlayed = new Card(cards.get(i));
                                return 0;
                            }
                        }
                        // TAKE POSSIBLE CIVILIAN
                        for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                            if(cards.get(i).getEarnings().get(j).getName().equals("Civilian") && verifySufficientResources(cards.get(i))) {
                                System.out.println("taking civilian card");
                                cards.get(i).print();
                                super.addCardsToTable(cards.get(i));
                                cards.get(i).setUsed(true);
                                lastCardPlayed = new Card(cards.get(i));
                                return 0;
                            }
                        }
                        // TAKE POSSIBLE SCIENCE
                        for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                            if ((cards.get(i).getEarnings().get(j).getName().equals("ScienceRuler") ||
                                    cards.get(i).getEarnings().get(j).getName().equals("ScienceWheel") ||
                                    cards.get(i).getEarnings().get(j).getName().equals("ScienceStone")) && verifySufficientResources(cards.get(i))) {
                                System.out.println("taking science card");
                                cards.get(i).print();
                                super.addCardsToTable(cards.get(i));
                                cards.get(i).setUsed(true);
                                lastCardPlayed = new Card(cards.get(i));
                                return 0;
                            }
                        }
                    }
                }
                // NONE OF THEM HAPPENED TAKE THE FIRST AVAILABLE CARD
                for (int i = 0; i < cards.size(); i++) {
                    if (verifySufficientResources(cards.get(i))) {
                        System.out.println("taking first available card card");
                        cards.get(i).print();
                        super.addCardsToTable(cards.get(i));
                        cards.get(i).setUsed(true);
                        lastCardPlayed = new Card(cards.get(i));
                        return 0;
                    }
                }

                // NO CARD AVAILABLE DISCARD FIRST CARD
                System.out.println("DISCARDING CARD");
                lastCardPlayed = new Card(cards.get(0));
                cards.get(0).setUsed(true);
                numberOfCoin = numberOfCoin + 3;
                //super.disjointCard(cards.get(0));
                return 1;
            } else if (ageNumber == 2) {
                for (int i = 0; i < cards.size(); i++) {
                    // IF CARD IS FREE, CONSIDER TAKING IT
                    // IF IT HAS SAME MATERIAL WITH WONDER
                    if (cards.get(i).getRequirements().get(0).getName().equals("none")) {
                        for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                            if (city.isWonderConstructMaterialForCity(cards.get(i).getEarnings().get(j))) {
                                super.addCardsToTable(cards.get(i));
                                cards.get(i).setUsed(true);
                                lastCardPlayed = new Card(cards.get(i));
                                return 0;
                            }
                        }
                    }
                    // CARD NOT FREE
                    else {
                        // TAKE POSSİBLE MILITARY
                        for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                            if (cards.get(i).getEarnings().get(j).getName().equals("Military") && verifySufficientResources(cards.get(i))) {
                                super.addCardsToTable(cards.get(i));
                                cards.get(i).setUsed(true);
                                lastCardPlayed = new Card(cards.get(i));
                                return 0;
                            }
                        }
                        // TAKE POSSIBLE CIVILIAN
                        for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                            if (cards.get(i).getEarnings().get(j).getName().equals("Civilian") && verifySufficientResources(cards.get(i))) {
                                super.addCardsToTable(cards.get(i));
                                cards.get(i).setUsed(true);
                                lastCardPlayed = new Card(cards.get(i));
                                return 0;
                            }
                        }
                        // TAKE POSSIBLE SCIENCE
                        for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                            if ((cards.get(i).getEarnings().get(j).getName().equals("ScienceRuler") ||
                                    cards.get(i).getEarnings().get(j).getName().equals("ScienceWheel") ||
                                    cards.get(i).getEarnings().get(j).getName().equals("ScienceStone")) && verifySufficientResources(cards.get(i))) {
                                super.addCardsToTable(cards.get(i));
                                cards.get(i).setUsed(true);
                                lastCardPlayed = new Card(cards.get(i));
                                return 0;
                            }
                        }
                    }
                }
                // NONE OF THEM HAPPENED TAKE THE FIRST AVAILABLE CARD
                for (int i = 0; i < cards.size(); i++) {
                    if (verifySufficientResources(cards.get(i))) {
                        super.addCardsToTable(cards.get(i));
                        cards.get(i).setUsed(true);
                        lastCardPlayed = new Card(cards.get(i));
                        return 0;
                    }
                }

                // NO CARD AVAILABLE DISCARD FIRST CARD
                System.out.println("DISCARDING CARD");
                lastCardPlayed = new Card(cards.get(0));
                cards.get(0).setUsed(true);
                numberOfCoin = numberOfCoin + 3;
                return 1;
            } else if (ageNumber == 3) {
                for (int i = 0; i < cards.size(); i++) {
                    // TAKE THE POSSIBLE PURPLE CARD
                    if ((cards.get(i).getId() == 51 && verifySufficientResources(cards.get(i))) || (cards.get(i).getId() == 52 && verifySufficientResources(cards.get(i))) ||
                            (cards.get(i).getId() == 53 && verifySufficientResources(cards.get(i))) || (cards.get(i).getId() == 54 && verifySufficientResources(cards.get(i)))
                            || (cards.get(i).getId() == 55 && verifySufficientResources(cards.get(i))) || (cards.get(i).getId() == 56 && verifySufficientResources(cards.get(i)))
                            || (cards.get(i).getId() == 57 && verifySufficientResources(cards.get(i))) || (cards.get(i).getId() == 58 && verifySufficientResources(cards.get(i)))
                            || (cards.get(i).getId() == 59 && verifySufficientResources(cards.get(i)))
                            || (cards.get(i).getId() == 60 && verifySufficientResources(cards.get(i)))) {
                        super.addCardsToTable(cards.get(i));
                        cards.get(i).setUsed(true);
                        lastCardPlayed = new Card(cards.get(i));
                        return 0;
                    }
                    // TAKE POSSİBLE MILITARY
                    for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                        if (cards.get(i).getEarnings().get(j).getName().equals("Military") && verifySufficientResources(cards.get(i))) {
                            super.addCardsToTable(cards.get(i));
                            cards.get(i).setUsed(true);
                            lastCardPlayed = new Card(cards.get(i));
                            return 0;
                        }
                    }
                    // TAKE POSSIBLE CIVILIAN
                    for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                        if (cards.get(i).getEarnings().get(j).getName().equals("Civilian") && verifySufficientResources(cards.get(i))) {
                            super.addCardsToTable(cards.get(i));
                            cards.get(i).setUsed(true);
                            lastCardPlayed = new Card(cards.get(i));
                            return 0;
                        }
                    }
                    // TAKE POSSIBLE SCIENCE
                    for (int j = 0; j < cards.get(i).getEarnings().size(); j++) {
                        if (((cards.get(i).getEarnings().get(j).getName().equals("ScienceRuler") && verifySufficientResources(cards.get(i))) ||
                                (cards.get(i).getEarnings().get(j).getName().equals("ScienceWheel") && verifySufficientResources(cards.get(i))) ||
                                (cards.get(i).getEarnings().get(j).getName().equals("ScienceStone") && verifySufficientResources(cards.get(i))))) {
                            super.addCardsToTable(cards.get(i));
                            cards.get(i).setUsed(true);
                            lastCardPlayed = new Card(cards.get(i));
                            return 0;
                        }
                    }
                }
                // NONE OF THEM HAPPENED TAKE THE FIRST AVAILABLE CARD
                for (int i = 0; i < cards.size(); i++) {
                    if (verifySufficientResources(cards.get(i))) {
                        super.addCardsToTable(cards.get(i));
                        cards.get(i).setUsed(true);
                        lastCardPlayed = new Card(cards.get(i));
                        return 0;
                    }
                }
                // NO CARD AVAILABLE DISCARD FIRST CARD
                System.out.println("DISCARDING CARD");
                lastCardPlayed = new Card(cards.get(0));
                cards.get(0).setUsed(true);
                numberOfCoin = numberOfCoin + 3;
                return 1;
            } else {
                System.out.println("AGE 4 ?");
                return -1;
                // do nothing.
            }
        }
    }

    @Override
    public void print(){
        System.out.println("Bot Id: " + id + " name :" + name + " coin " + numberOfCoin);
        super.getCity().print();
        System.out.println("CARDS ON TABLE");
        for(int i = 0; i < super.getCardsOnTable().size(); i++){
            super.getCardsOnTable().get(i).print();
        }
        System.out.println("CARDS ON HAND");
        for(int i = 0; i < super.getCards().size(); i++){
            super.getCards().get(i).print();
        }
        for(int i = 0; i < 5; i++){
            System.out.println();
        }

    }



}
