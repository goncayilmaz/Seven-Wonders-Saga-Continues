package superProject.GameProperties;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import superProject.Player.Player;

import java.util.ArrayList;
import java.util.Collections;

public class CardEngine extends Application {

    private ArrayList<Card> cards;
    private ArrayList<Card> cards2;
    private ArrayList<Card> cards3;
    private int numberOfCards;

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../GameProperties/CardViewFX.fxml"));
            primaryStage.setTitle("Card View");

            primaryStage.setScene(new Scene(root, 200, 300));
            // primaryStage.setResizable(false);
            primaryStage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("FIRST AGE CARDS");
        createFirstAgeCards(7);
        System.out.println("SECOND AGE CARDS");
        createSecondAgeCards(3);
        System.out.println("THIRD AGE CARDS");
        createThirdAgeCards(5);



    }

    public void createGameCards(int numberOfPlayers){
        createFirstAgeCards(numberOfPlayers);
        createSecondAgeCards(numberOfPlayers);
        createThirdAgeCards(numberOfPlayers);
    }


    public void createFirstAgeCards(int numberOfPlayers){
        numberOfCards = numberOfPlayers * 7;
        cards = new ArrayList<Card>();

        ArrayList<Material> card1reqs = new ArrayList<Material>();
        card1reqs.add(new Material("none",0));
        ArrayList<Material> card1earnings = new ArrayList<Material>();
        card1earnings.add(new Material("Wood",1));
        Card one = new Card("lumberyard", card1reqs, card1earnings,1,-1,"Brown","lumberyard.png",1);
        cards.add(one);
        cards.add(one);

        ArrayList<Material> card2reqs = new ArrayList<Material>();
        card2reqs.add(new Material("none",0));
        ArrayList<Material> card2earnings = new ArrayList<Material>();
        card2earnings.add(new Material("Stone",1));
        Card two = new Card("stonepit", card2reqs, card2earnings,2,-1,"Brown","stonepit.png",1);
        cards.add(two);
        cards.add(two);

        ArrayList<Material> card3reqs = new ArrayList<Material>();
        card3reqs.add(new Material("none",0));
        ArrayList<Material> card3earnings = new ArrayList<Material>();
        card3earnings.add(new Material("Clay",1));
        Card three = new Card("claypool", card3reqs, card3earnings,3,-1,"Brown","claypool.png",1);
        cards.add(three);
        cards.add(three);

        ArrayList<Material> card4reqs = new ArrayList<Material>();
        card4reqs.add(new Material("none",0));
        ArrayList<Material> card4earnings = new ArrayList<Material>();
        card4earnings.add(new Material("Ore",1));
        Card four = new Card("orevein", card4reqs, card4earnings,4,-1,"Brown","orevein.png",1);
        cards.add(four);
        cards.add(four);

        ArrayList<Material> card5reqs = new ArrayList<Material>();
        card5reqs.add(new Material("Coin",1));
        ArrayList<Material> card5earnings = new ArrayList<Material>();
        card5earnings.add(new Material("Wood",1));
        card5earnings.add(new Material("Clay", 1));
        Card five = new Card("treefarm", card5reqs, card5earnings,5,-1,"Brown","treefarm.png",1, true);
        cards.add(five);

        ArrayList<Material> card6reqs = new ArrayList<Material>();
        card6reqs.add(new Material("Coin",1));
        ArrayList<Material> card6earnings = new ArrayList<Material>();
        card6earnings.add(new Material("Stone",1));
        card6earnings.add(new Material("Clay",1));
        Card six = new Card("excavation", card6reqs, card6earnings,6,-1,"Brown","excavation.png",1,true);
        cards.add(six);

        ArrayList<Material> card7reqs = new ArrayList<Material>();
        card7reqs.add(new Material("Coin",1));
        ArrayList<Material> card7earnings = new ArrayList<Material>();
        card7earnings.add(new Material("Clay",1));
        card7earnings.add(new Material("Ore",1));
        Card seven = new Card("claypit", card7reqs, card7earnings,7,-1,"Brown","claypit.png",1,true);
        cards.add(seven);

        ArrayList<Material> card8reqs = new ArrayList<Material>();
        card8reqs.add(new Material("Coin",1));
        ArrayList<Material> card8earnings = new ArrayList<Material>();
        card8earnings.add(new Material("Stone",1));
        card8earnings.add(new Material("Wood",1));
        Card eight = new Card("timberyard", card8reqs, card8earnings,8,-1,"Brown","timberyard.png",1,true);
        cards.add(eight);

        ArrayList<Material> card9reqs = new ArrayList<Material>();
        card9reqs.add(new Material("Coin",1));
        ArrayList<Material> card9earnings = new ArrayList<Material>();
        card9earnings.add(new Material("Wood",1));
        card9earnings.add(new Material("Ore",1));
        Card nine = new Card("forestcave", card9reqs, card9earnings,9,-1,"Brown","forestcave.png",1,true);
        cards.add(nine);

        ArrayList<Material> card10reqs = new ArrayList<Material>();
        card10reqs.add(new Material("Coin",1));
        ArrayList<Material> card10earnings = new ArrayList<Material>();
        card10earnings.add(new Material("Ore",1));
        card10earnings.add(new Material("Stone",1));
        Card ten = new Card("mine", card10reqs, card10earnings,10,-1,"Brown","mine.png",1,true);
        cards.add(ten);

        ArrayList<Material> card11reqs = new ArrayList<Material>();
        card11reqs.add(new Material("none",0));
        ArrayList<Material> card11earnings = new ArrayList<Material>();
        card11earnings.add(new Material("Loom",1));
        Card eleven = new Card("loom", card11reqs, card11earnings,11,-1,"Grey","loom.png",1);
        cards.add(eleven);
        cards.add(eleven);

        ArrayList<Material> card12reqs = new ArrayList<Material>();
        card12reqs.add(new Material("none",0));
        ArrayList<Material> card12earnings = new ArrayList<Material>();
        card12earnings.add(new Material("Glass",1));
        Card twelve = new Card("glassworks", card12reqs, card12earnings,12,-1,"Grey","glassworks.png",1);
        cards.add(twelve);
        cards.add(twelve);

        ArrayList<Material> card13reqs = new ArrayList<Material>();
        card13reqs.add(new Material("none",0));
        ArrayList<Material> card13earnings = new ArrayList<Material>();
        card13earnings.add(new Material("Press",1));
        Card thirteen = new Card("press", card13reqs, card13earnings,13,-1,"Grey","press.png",1);
        cards.add(thirteen);
        cards.add(thirteen);

        ArrayList<Material> card14reqs = new ArrayList<Material>();
        card14reqs.add(new Material("none",0));
        ArrayList<Material> card14earnings = new ArrayList<Material>();
        card14earnings.add(new Material("Civilian",3));
        Card fourteen = new Card("pawnshop", card14reqs, card14earnings,14,-1,"Blue","pawnshop.png",1);
        cards.add(fourteen);
        cards.add(fourteen);

        ArrayList<Material> card15reqs = new ArrayList<Material>();
        card15reqs.add(new Material("Stone",1));
        ArrayList<Material> card15earnings = new ArrayList<Material>();
        card15earnings.add(new Material("Civilian",3));
        Card fifteen = new Card("baths", card15reqs, card15earnings,15,35,"Blue","baths.png",1);
        cards.add(fifteen);
        cards.add(fifteen);

        ArrayList<Material> card16reqs = new ArrayList<Material>();
        card16reqs.add(new Material("none",0));
        ArrayList<Material> card16earnings = new ArrayList<Material>();
        card16earnings.add(new Material("Civilian",2));
        Card sixteen = new Card("altar", card16reqs, card16earnings,16,36,"Blue","altar.png",1);
        cards.add(sixteen);
        cards.add(sixteen);

        ArrayList<Material> card17reqs = new ArrayList<Material>();
        card17reqs.add(new Material("none",0));
        ArrayList<Material> card17earnings = new ArrayList<Material>();
        card17earnings.add(new Material("Civilian",2));
        Card seventeen = new Card("theater", card17reqs, card17earnings,17,37,"Blue","theater.png",1);
        cards.add(seventeen);
        cards.add(seventeen);

        ArrayList<Material> card18reqs = new ArrayList<Material>();
        card18reqs.add(new Material("none",0));
        ArrayList<Material> card18earnings = new ArrayList<Material>();
        card18earnings.add(new Material("Coin",5));
        Card eighteen = new Card("tavern", card18reqs, card18earnings,18,-1,"Yellow","tavern.png",1);
        cards.add(eighteen);
        cards.add(eighteen);
        cards.add(eighteen);

        ArrayList<Material> card19reqs = new ArrayList<Material>();  // EAST TRADİNG POST
        card19reqs.add(new Material("none",0));
        ArrayList<Material> card19earnings = new ArrayList<Material>();
        card19earnings.add(new Material("Coin",5));
        Card nineteen = new Card("easttradingpost", card19reqs, card19earnings,19,38,"Yellow","easttradingpost.png",1,"EASTTRADINGPOST");
        cards.add(nineteen);
        cards.add(nineteen);

        ArrayList<Material> card20reqs = new ArrayList<Material>();  // WEST TRADİNG POST
        card20reqs.add(new Material("none",0));
        ArrayList<Material> card20earnings = new ArrayList<Material>();
        card20earnings.add(new Material("none",0));
        Card twenty = new Card("westtradingpost", card20reqs, card20earnings,20,38,"Yellow","westtradingpost.png",1,"WESTTRADINGPOST");
        cards.add(twenty);
        cards.add(twenty);

        ArrayList<Material> card21reqs = new ArrayList<Material>();  // MARKETPLACE
        card21reqs.add(new Material("none",0));
        ArrayList<Material> card21earnings = new ArrayList<Material>();
        card21earnings.add(new Material("none",0));
        Card twentyone = new Card("marketplace", card21reqs, card21earnings,21,39,"Yellow","marketplace.png",1,"MARKETPLACE");
        cards.add(twentyone);
        cards.add(twentyone);

        ArrayList<Material> card22reqs = new ArrayList<Material>();
        card22reqs.add(new Material("Wood",1));
        ArrayList<Material> card22earnings = new ArrayList<Material>();
        card22earnings.add(new Material("Military",1));
        Card twentytwo = new Card("stockade", card22reqs, card22earnings,22,-1,"Red","stockade.png",1);
        cards.add(twentytwo);
        cards.add(twentytwo);

        ArrayList<Material> card23reqs = new ArrayList<Material>();
        card23reqs.add(new Material("Ore",1));
        ArrayList<Material> card23earnings = new ArrayList<Material>();
        card23earnings.add(new Material("Military",1));
        Card twentythree = new Card("barracks", card23reqs, card23earnings,23,-1,"Red","barracks.png",1);
        cards.add(twentythree);
        cards.add(twentythree);

        ArrayList<Material> card24reqs = new ArrayList<Material>();
        card24reqs.add(new Material("Clay",1));
        ArrayList<Material> card24earnings = new ArrayList<Material>();
        card24earnings.add(new Material("Military",1));
        Card twentyfour = new Card("guardtower", card24reqs, card24earnings,24,-1,"Red","guardtower.png",1);
        cards.add(twentyfour);
        cards.add(twentyfour);

        ArrayList<Material> card25reqs = new ArrayList<Material>();
        card25reqs.add(new Material("Loom",1));
        ArrayList<Material> card25earnings = new ArrayList<Material>();
        card25earnings.add(new Material("ScienceRuler",1));
        Card twentyfive = new Card("apothecary", card25reqs, card25earnings,25,45,"Green","apothecary.png",1);
        cards.add(twentyfive);
        cards.add(twentyfive);

        ArrayList<Material> card26reqs = new ArrayList<Material>();
        card26reqs.add(new Material("Glass",1));
        ArrayList<Material> card26earnings = new ArrayList<Material>();
        card26earnings.add(new Material("ScienceWheel",1));
        Card twentysix = new Card("workshop", card26reqs, card26earnings,26,47,"Green","workshop.png",1);
        cards.add(twentysix);
        cards.add(twentysix);

        ArrayList<Material> card27reqs = new ArrayList<Material>();
        card27reqs.add(new Material("Paper",1));
        ArrayList<Material> card27earnings = new ArrayList<Material>();
        card27earnings.add(new Material("ScienceStone",1));
        Card twentyseven = new Card("scriptorium", card27reqs, card27earnings,27,49,"Green","scriptorium.png",1);
        cards.add(twentyseven);
        cards.add(twentyseven);

        if(numberOfPlayers == 7){
            // do nothing
        }
        else if(numberOfPlayers == 6){
            int[] cardIdOfCardsToBeDeleted = {14,15,18,19,20,22,26};
            for(int i = 0; i < cardIdOfCardsToBeDeleted.length; i++){
                cards.remove(findById(cards,cardIdOfCardsToBeDeleted[i]));
            }
        }
        else if(numberOfPlayers == 5){
            int[] cardIdOfCardsToBeDeleted = {5,10,11,12,13,14,15,17,18,19,20,21,22,26};
            for(int i = 0; i < cardIdOfCardsToBeDeleted.length; i++){
                cards.remove(findById(cards,cardIdOfCardsToBeDeleted[i]));
            }
        }
        else if(numberOfPlayers == 4){
            int[] cardIdOfCardsToBeDeleted = {2,3,5,9,10,11,12,13,14,15,15,16,17,18,18,19,20,21,22,23,25,26};
            for(int i = 0; i < cardIdOfCardsToBeDeleted.length; i++){
                cards.remove(findById(cards,cardIdOfCardsToBeDeleted[i]));
            }
        }
        // number of players is 3
        else{
            int[] cardIdOfCardsToBeDeleted = {1,2,3,4,5,6,9,10,11,12,13,14,14,15,16,17,18,18,18,19,20,21,22,23,24,25,26,27};
            for(int i = 0; i < cardIdOfCardsToBeDeleted.length; i++){
                cards.remove(findById(cards,cardIdOfCardsToBeDeleted[i]));
            }

        }
        Collections.shuffle(cards);
        printCards(cards);
    }
    public void createSecondAgeCards(int numberOfPlayers){
        numberOfCards = numberOfPlayers * 7;
        cards2 = new ArrayList<Card>();

        ArrayList<Material> card28reqs = new ArrayList<Material>();
        card28reqs.add(new Material("Coin",1));
        ArrayList<Material> card28earnings = new ArrayList<Material>();
        card28earnings.add(new Material("Wood",2));
        Card twentyeight = new Card("sawmill", card28reqs, card28earnings,28,-1,"Brown","sawmill.png",2);
        cards2.add(twentyeight);
        cards2.add(twentyeight);

        ArrayList<Material> card29reqs = new ArrayList<Material>();
        card29reqs.add(new Material("Coin",1));
        ArrayList<Material> card29earnings = new ArrayList<Material>();
        card29earnings.add(new Material("Stone",2));
        Card twentynine = new Card("quarry", card29reqs, card29earnings,29,-1,"Brown","quarry.png",2);
        cards2.add(twentynine);
        cards2.add(twentynine);

        ArrayList<Material> card30reqs = new ArrayList<Material>();
        card30reqs.add(new Material("Coin",1));
        ArrayList<Material> card30earnings = new ArrayList<Material>();
        card30earnings.add(new Material("Clay",2));
        Card thirty = new Card("brickyard", card30reqs, card30earnings,30,-1,"Brown","brickyard.png",2);
        cards2.add(thirty);
        cards2.add(thirty);

        ArrayList<Material> card31reqs = new ArrayList<Material>();
        card31reqs.add(new Material("Coin",1));
        ArrayList<Material> card31earnings = new ArrayList<Material>();
        card31earnings.add(new Material("Clay",2));
        Card thirtyone = new Card("foundry", card31reqs, card31earnings,31,-1,"Brown","foundry.png",2);
        cards2.add(thirtyone);
        cards2.add(thirtyone);

        ArrayList<Material> card32reqs = new ArrayList<Material>();
        card32reqs.add(new Material("none",0));
        ArrayList<Material> card32earnings = new ArrayList<Material>();
        card32earnings.add(new Material("Loom",1));
        Card thirtytwo = new Card("loom", card32reqs, card32earnings,32,-1,"Grey","loom.png",2);
        cards2.add(thirtytwo);
        cards2.add(thirtytwo);

        ArrayList<Material> card33reqs = new ArrayList<Material>();
        card33reqs.add(new Material("none",0));
        ArrayList<Material> card33earnings = new ArrayList<Material>();
        card33earnings.add(new Material("Glass",1));
        Card thirtythree = new Card("glassworks", card33reqs, card33earnings,33,-1,"Grey","glassworks.png",2);
        cards2.add(thirtythree);
        cards2.add(thirtythree);

        ArrayList<Material> card34reqs = new ArrayList<Material>();
        card34reqs.add(new Material("none",0));
        ArrayList<Material> card34earnings = new ArrayList<Material>();
        card34earnings.add(new Material("Press",1));
        Card thirtyfour = new Card("press", card34reqs, card34earnings,34,-1,"Grey","press.png",2);
        cards2.add(thirtyfour);
        cards2.add(thirtyfour);

        ArrayList<Material> card35reqs = new ArrayList<Material>();
        card35reqs.add(new Material("Stone",3));
        ArrayList<Material> card35earnings = new ArrayList<Material>();
        card35earnings.add(new Material("Civilian",5));
        Card thirtyfive = new Card("aqueduct", card35reqs, card35earnings,35,-1,"Blue","aqueduct.png",2);
        cards2.add(thirtyfive);
        cards2.add(thirtyfive);

        ArrayList<Material> card36reqs = new ArrayList<Material>();
        card36reqs.add(new Material("Wood",1));
        card36reqs.add(new Material("Clay",1));
        card36reqs.add(new Material("Glass",1));
        ArrayList<Material> card36earnings = new ArrayList<Material>();
        card36earnings.add(new Material("Civilian",3));
        Card thirtysix = new Card("temple", card36reqs, card36earnings,36,61,"Blue","temple.png",2);
        cards2.add(thirtysix);
        cards2.add(thirtysix);

        ArrayList<Material> card37reqs = new ArrayList<Material>();
        card37reqs.add(new Material("Wood",1));
        card37reqs.add(new Material("Ore",2));
        ArrayList<Material> card37earnings = new ArrayList<Material>();
        card37earnings.add(new Material("Civilian",4));
        Card thirtyseven = new Card("statue", card37reqs, card37earnings,37,62,"Blue","statue.png",2);
        cards2.add(thirtyseven);
        cards2.add(thirtyseven);

        ArrayList<Material> card38reqs = new ArrayList<Material>();
        card38reqs.add(new Material("Clay",2));
        ArrayList<Material> card38earnings = new ArrayList<Material>();
        card38earnings.add(new Material("Loom",1));
        card38earnings.add(new Material("Glass",1));
        card38earnings.add(new Material("Paper",1));
        Card thirtyeight = new Card("forum", card38reqs, card38earnings,38,65,"Yellow","forum.png",2,true,"FORUM");
        cards2.add(thirtyeight);
        cards2.add(thirtyeight);
        cards2.add(thirtyeight);

        ArrayList<Material> card39reqs = new ArrayList<Material>();
        card39reqs.add(new Material("Wood",2));
        ArrayList<Material> card39earnings = new ArrayList<Material>();
        card39earnings.add(new Material("Clay",1));
        card39earnings.add(new Material("Stone",1));
        card39earnings.add(new Material("Ore",1));
        card39earnings.add(new Material("Wood",1));
        Card thirtynine = new Card("caravansery", card39reqs, card39earnings,39,66,"Yellow","caravansery.png",2,true,"CARAVANSERY");
        cards2.add(thirtynine);
        cards2.add(thirtynine);
        cards2.add(thirtynine);

        ArrayList<Material> card40reqs = new ArrayList<Material>();
        card40reqs.add(new Material("none",0));
        ArrayList<Material> card40earnings = new ArrayList<Material>();
        card40earnings.add(new Material("none",0));
        Card fourty = new Card("vineyard", card40reqs, card40earnings,40,-1,"Yellow","vineyard.png",2,"VINEYARD");
        cards2.add(fourty);
        cards2.add(fourty);

        ArrayList<Material> card41reqs = new ArrayList<Material>();
        card41reqs.add(new Material("none",0));
        ArrayList<Material> card41earnings = new ArrayList<Material>();
        card41earnings.add(new Material("none",0));
        Card fourtyone = new Card("bazar", card41reqs, card41earnings,41,-1,"Yellow","bazar.png",2,"BAZAR");
        cards2.add(fourtyone);
        cards2.add(fourtyone);

        ArrayList<Material> card42reqs = new ArrayList<Material>();
        card42reqs.add(new Material("Stone",3));
        ArrayList<Material> card42earnings = new ArrayList<Material>();
        card42earnings.add(new Material("Military",2));
        Card fourtytwo = new Card("walls", card42reqs, card42earnings,42,68,"Red","walls.png",2);
        cards2.add(fourtytwo);
        cards2.add(fourtytwo);

        ArrayList<Material> card43reqs = new ArrayList<Material>();
        card43reqs.add(new Material("Wood",1));
        card43reqs.add(new Material("Ore",2));
        ArrayList<Material> card43earnings = new ArrayList<Material>();
        card43earnings.add(new Material("Military",2));
        Card fourtythree = new Card("trainingground", card43reqs, card43earnings,43,69,"Red","trainingground.png",2);
        cards2.add(fourtythree);
        cards2.add(fourtythree);
        cards2.add(fourtythree);

        ArrayList<Material> card44reqs = new ArrayList<Material>();
        card44reqs.add(new Material("Ore",1));
        card44reqs.add(new Material("Clay",1));
        card44reqs.add(new Material("Wood",1));
        ArrayList<Material> card44earnings = new ArrayList<Material>();
        card44earnings.add(new Material("Military",2));
        Card fourtyfour = new Card("stables", card44reqs, card44earnings,44,-1,"Red","stables.png",2);
        cards2.add(fourtyfour);
        cards2.add(fourtyfour);

        ArrayList<Material> card45reqs = new ArrayList<Material>();
        card45reqs.add(new Material("Ore",2));
        card45reqs.add(new Material("Glass",1));
        ArrayList<Material> card45earnings = new ArrayList<Material>();
        card45earnings.add(new Material("ScienceRuler",1));
        Card fourtyfive = new Card("dispensary", card45reqs, card45earnings,45,72,"Green","dispensary.png",2);
        cards2.add(fourtyfive);
        cards2.add(fourtyfive);

        ArrayList<Material> card46reqs = new ArrayList<Material>();
        card46reqs.add(new Material("Wood",2));
        card46reqs.add(new Material("Ore",1));
        ArrayList<Material> card46earnings = new ArrayList<Material>();
        card46earnings.add(new Material("Military",2));
        Card fourtysix = new Card("archeryrange", card46reqs, card46earnings,46,-1,"Red","archeryrange.png",2);
        cards2.add(fourtysix);
        cards2.add(fourtysix);

        ArrayList<Material> card47reqs = new ArrayList<Material>();
        card47reqs.add(new Material("Clay",2));
        card47reqs.add(new Material("Paper",1));
        ArrayList<Material> card47earnings = new ArrayList<Material>();
        card47earnings.add(new Material("ScienceWheel",1));
        Card fourtyseven = new Card("laboratory", card47reqs, card47earnings,47,74,"Green","laboratory.png",2);
        cards2.add(fourtyseven);
        cards2.add(fourtyseven);

        ArrayList<Material> card48reqs = new ArrayList<Material>();
        card48reqs.add(new Material("Clay",2));
        card48reqs.add(new Material("Loom",1));
        ArrayList<Material> card48earnings = new ArrayList<Material>();
        card48earnings.add(new Material("Civilian",4));
        Card fourtyeight = new Card("courthouse", card48reqs, card48earnings,48,-1,"Blue","courthouse.png",2);
        cards2.add(fourtyeight);
        cards2.add(fourtyeight);

        ArrayList<Material> card49reqs = new ArrayList<Material>();
        card49reqs.add(new Material("Stone",2));
        card49reqs.add(new Material("Loom",1));
        ArrayList<Material> card49earnings = new ArrayList<Material>();
        card49earnings.add(new Material("ScienceStone",1));
        Card fourtynine = new Card("library", card49reqs, card49earnings,49,76,"Green","library.png",2);
        cards2.add(fourtynine);
        cards2.add(fourtynine);

        ArrayList<Material> card50reqs = new ArrayList<Material>();
        card50reqs.add(new Material("Wood",1));
        card50reqs.add(new Material("Paper",1));
        ArrayList<Material> card50earnings = new ArrayList<Material>();
        card50earnings.add(new Material("ScienceStone",1));
        Card fifty = new Card("school", card50reqs, card50earnings,50,78,"Green","school.png",2);
        cards2.add(fifty);
        cards2.add(fifty);

        if(numberOfPlayers == 7){
            // do nothing
        }
        else if(numberOfPlayers == 6){
            int[] cardIdOfCardsToBeDeleted = {35,37,38,41,42,43,50};
            for(int i = 0; i < cardIdOfCardsToBeDeleted.length; i++){
                cards2.remove(findById(cards2,cardIdOfCardsToBeDeleted[i]));
            }
        }
        else if(numberOfPlayers == 5){
            int[] cardIdOfCardsToBeDeleted = {35,36,37,38,38,39,40,41,42,43,43,46,49,50};
            for(int i = 0; i < cardIdOfCardsToBeDeleted.length; i++){
                cards2.remove(findById(cards2,cardIdOfCardsToBeDeleted[i]));
            }
        }
        else if(numberOfPlayers == 4){
            int[] cardIdOfCardsToBeDeleted = {32,33,34,35,36,37,38,38,39,39,40,41,42,43,43,44,45,46,47,48,49,50};
            for(int i = 0; i < cardIdOfCardsToBeDeleted.length; i++){
                cards2.remove(findById(cards2,cardIdOfCardsToBeDeleted[i]));
            }
        }
        // number of players is 3
        else{
            int[] cardIdOfCardsToBeDeleted = {28,29,30,31,32,33,34,35,36,37,38,38,39,39,40,41,41,42,43,43,43,44,45,46,47,48,49,50};
            for(int i = 0; i < cardIdOfCardsToBeDeleted.length; i++){
                cards2.remove(findById(cards2,cardIdOfCardsToBeDeleted[i]));
            }

        }
        Collections.shuffle(cards2);
        printCards(cards2);

    }
    public void createThirdAgeCards(int numberOfPlayers){
        numberOfCards = numberOfPlayers * 7;

        cards3 = new ArrayList<Card>();

        ArrayList<Material> card51reqs = new ArrayList<Material>();
        card51reqs.add(new Material("Ore",2));
        card51reqs.add(new Material("Clay",1));
        card51reqs.add(new Material("Stone",1));
        card51reqs.add(new Material("Wood",1));
        ArrayList<Material> card51earnings = new ArrayList<Material>();
        card51earnings.add(new Material("none",0));
        Card fiftyone = new Card("workersguild", card51reqs, card51earnings,51,-1,"Purple","workersguild.png",3,"WORKERSGUILD");
        cards3.add(fiftyone);


        ArrayList<Material> card52reqs = new ArrayList<Material>();
        card52reqs.add(new Material("Ore",2));
        card52reqs.add(new Material("Stone",2));
        ArrayList<Material> card52earnings = new ArrayList<Material>();
        card52earnings.add(new Material("none",0));
        Card fiftytwo = new Card("craftsmenguild", card52reqs, card52earnings,52,-1,"Purple","craftsmenguild.png",3,"CRAFTSMENSGUILD");
        cards3.add(fiftytwo);

        ArrayList<Material> card53reqs = new ArrayList<Material>();
        card53reqs.add(new Material("Loom",1));
        card53reqs.add(new Material("Paper",1));
        card53reqs.add(new Material("Glass",1));
        ArrayList<Material> card53earnings = new ArrayList<Material>();
        card53earnings.add(new Material("none",0));
        Card fiftythree = new Card("tradersguild", card53reqs, card53earnings,53,-1,"Purple","tradersguild.png",3,"TRADERSSGUILD");
        cards3.add(fiftythree);

        ArrayList<Material> card54reqs = new ArrayList<Material>();
        card54reqs.add(new Material("Clay",3));
        card54reqs.add(new Material("Loom",1));
        card54reqs.add(new Material("Paper",1));
        ArrayList<Material> card54earnings = new ArrayList<Material>();
        card54earnings.add(new Material("none",0));
        Card fiftyfour = new Card("philosophersguild", card54reqs, card54earnings,54,-1,"Purple","philosophersguild.png",3,"PHILOSOPHERSGUILD");
        cards3.add(fiftyfour);

        ArrayList<Material> card55reqs = new ArrayList<Material>();
        card55reqs.add(new Material("Clay",3));
        card55reqs.add(new Material("Glass",1));
        ArrayList<Material> card55earnings = new ArrayList<Material>();
        card55earnings.add(new Material("none",0));
        Card fiftyfive = new Card("spiesguild", card55reqs, card55earnings,55,-1,"Purple","spiesguild.png",3,"SPIESGUILD");
        cards3.add(fiftyfive);

        ArrayList<Material> card56reqs = new ArrayList<Material>();
        card56reqs.add(new Material("Ore",2));
        card56reqs.add(new Material("Stone",1));
        card56reqs.add(new Material("Loom",1));
        ArrayList<Material> card56earnings = new ArrayList<Material>();
        card56earnings.add(new Material("none",0));
        Card fiftysix = new Card("strategistsguild", card56reqs, card56earnings,56,-1,"Purple","strategistsguild.png",3,"STRATEGISTSGUILD");
        cards3.add(fiftysix);

        ArrayList<Material> card57reqs = new ArrayList<Material>();
        card57reqs.add(new Material("Wood",3));
        card57reqs.add(new Material("Paper",1));
        card57reqs.add(new Material("Glass",1));
        ArrayList<Material> card57earnings = new ArrayList<Material>();
        card57earnings.add(new Material("none",0));
        Card fiftyseven = new Card("shipownersguild", card57reqs, card57earnings,57,-1,"Purple","shipownersguild.png",3,"SHIPOWNERSGUILD");
        cards3.add(fiftyseven);

        ArrayList<Material> card58reqs = new ArrayList<Material>();
        card58reqs.add(new Material("Wood",2));
        card58reqs.add(new Material("Clay",2));
        card58reqs.add(new Material("Paper",1));
        ArrayList<Material> card58earnings = new ArrayList<Material>();
        card58earnings.add(new Material("ScienceRuler",1));
        card58earnings.add(new Material("ScienceStone",1));
        card58earnings.add(new Material("ScienceWheel",1));
        Card fiftyeight = new Card("scientistsguild", card58reqs, card58earnings,58,-1,"Purple","scientistsguild.png",3,true,"SCIENTISTSGUILD");
        cards3.add(fiftyeight);

        ArrayList<Material> card59reqs = new ArrayList<Material>();
        card59reqs.add(new Material("Wood",3));
        card59reqs.add(new Material("Stone",1));
        card59reqs.add(new Material("Loom",1));
        ArrayList<Material> card59earnings = new ArrayList<Material>();
        card59earnings.add(new Material("none",0));
        Card fiftynine = new Card("magistratesguild", card59reqs, card59earnings,59,-1,"Purple","magistratesguild.png",3,"MAGISTRATESGUILD");
        cards3.add(fiftynine);

        ArrayList<Material> card60reqs = new ArrayList<Material>();
        card60reqs.add(new Material("Stone",2));
        card60reqs.add(new Material("Clay",2));
        card60reqs.add(new Material("Glass",1));
        ArrayList<Material> card60earnings = new ArrayList<Material>();
        card60earnings.add(new Material("none",0));
        Card sixty = new Card("buildersguild", card60reqs, card60earnings,60,-1,"Purple","buildersguild.png",3,"BUILDERSGUILD");
        cards3.add(sixty);

        ArrayList<Material> card61reqs = new ArrayList<Material>();
        card61reqs.add(new Material("Clay",2));
        card61reqs.add(new Material("Ore",1));
        card61reqs.add(new Material("Paper",1));
        card61reqs.add(new Material("Loom",2));
        card61reqs.add(new Material("Glass",2));
        ArrayList<Material> card61earnings = new ArrayList<Material>();
        card61earnings.add(new Material("Civilian",7));
        Card sixtyone = new Card("pantheon", card61reqs, card61earnings,61,-1,"Blue","pantheon.png",3);
        cards3.add(sixtyone);
        cards3.add(sixtyone);

        ArrayList<Material> card62reqs = new ArrayList<Material>();
        card62reqs.add(new Material("Wood",1));
        card62reqs.add(new Material("Clay",2));
        ArrayList<Material> card62earnings = new ArrayList<Material>();
        card62earnings.add(new Material("Civilian",5));
        Card sixtytwo = new Card("gardens", card62reqs, card62earnings,62,-1,"Blue","gardens.png",3);
        cards3.add(sixtytwo);
        cards3.add(sixtytwo);

        ArrayList<Material> card63reqs = new ArrayList<Material>();
        card63reqs.add(new Material("Glass",1));
        card63reqs.add(new Material("Ore",1));
        card63reqs.add(new Material("Stone",2));
        ArrayList<Material> card63earnings = new ArrayList<Material>();
        card63earnings.add(new Material("Civilian",6));
        Card sixtythree = new Card("townhall", card63reqs, card63earnings,63,-1,"Blue","townhall.png",3);
        cards3.add(sixtythree);
        cards3.add(sixtythree);
        cards3.add(sixtythree);

        ArrayList<Material> card64reqs = new ArrayList<Material>();
        card64reqs.add(new Material("Glass",1));
        card64reqs.add(new Material("Paper",1));
        card64reqs.add(new Material("Loom",1));
        card64reqs.add(new Material("Clay",1));
        card64reqs.add(new Material("Wood",1));
        card64reqs.add(new Material("Ore",1));
        card64reqs.add(new Material("Stone",1));
        ArrayList<Material> card64earnings = new ArrayList<Material>();
        card64earnings.add(new Material("Civilian",8));
        Card sixtyfour = new Card("palace", card64reqs, card64earnings,64,-1,"Blue","palace.png",3);
        cards3.add(sixtyfour);
        cards3.add(sixtyfour);

        ArrayList<Material> card65reqs = new ArrayList<Material>();
        card65reqs.add(new Material("Loom",1));
        card65reqs.add(new Material("Ore",1));
        card65reqs.add(new Material("Wood",1));
        ArrayList<Material> card65earnings = new ArrayList<Material>();
        card65earnings.add(new Material("none",0));
        Card sixtyfive = new Card("haven", card65reqs, card65earnings,65,-1,"Yellow","haven.png",3,"HAVEN");
        cards3.add(sixtyfive);
        cards3.add(sixtyfive);

        ArrayList<Material> card66reqs = new ArrayList<Material>();
        card66reqs.add(new Material("Glass",1));
        card66reqs.add(new Material("Stone",1));
        ArrayList<Material> card66earnings = new ArrayList<Material>();
        card66earnings.add(new Material("none",0));
        Card sixtysix = new Card("lighthouse", card66reqs, card66earnings,66,-1,"Yellow","lighthouse.png",3,"LIGHTHOUSE");
        cards3.add(sixtysix);
        cards3.add(sixtysix);

        ArrayList<Material> card67reqs = new ArrayList<Material>();
        card67reqs.add(new Material("Clay",2));
        card67reqs.add(new Material("Paper",1));
        ArrayList<Material> card67earnings = new ArrayList<Material>();
        card67earnings.add(new Material("none",0));
        Card sixtyseven = new Card("chamberofcommerce", card67reqs, card67earnings,67,-1,"Yellow","chamberofcommerce.png",3,"CHAMBEROFCOMMERCE");
        cards3.add(sixtyseven);
        cards3.add(sixtyseven);

        ArrayList<Material> card68reqs = new ArrayList<Material>();
        card68reqs.add(new Material("Stone",1));
        card68reqs.add(new Material("Ore",3));
        ArrayList<Material> card68earnings = new ArrayList<Material>();
        card68earnings.add(new Material("Military",3));
        Card sixtyeight = new Card("fortifications", card68reqs, card68earnings,68,-1,"Red","fortifications.png",3);
        cards3.add(sixtyeight);
        cards3.add(sixtyeight);

        ArrayList<Material> card69reqs = new ArrayList<Material>();
        card69reqs.add(new Material("Stone",3));
        card69reqs.add(new Material("Ore",1));
        ArrayList<Material> card69earnings = new ArrayList<Material>();
        card69earnings.add(new Material("Military",3));
        Card sixtynine = new Card("circus", card69reqs, card69earnings,69,-1,"Red","circus.png",3);
        cards3.add(sixtynine);
        cards3.add(sixtynine);
        cards3.add(sixtynine);

        ArrayList<Material> card70reqs = new ArrayList<Material>();
        card70reqs.add(new Material("Ore",1));
        card70reqs.add(new Material("Wood",2));
        card70reqs.add(new Material("Loom",1));
        ArrayList<Material> card70earnings = new ArrayList<Material>();
        card70earnings.add(new Material("Military",3));
        Card seventy = new Card("arsenal", card70reqs, card70earnings,70,-1,"Red","arsenal.png",3);
        cards3.add(seventy);
        cards3.add(seventy);
        cards3.add(seventy);

        ArrayList<Material> card71reqs = new ArrayList<Material>();
        card71reqs.add(new Material("Ore",1));
        card71reqs.add(new Material("Stone",2));
        ArrayList<Material> card71earnings = new ArrayList<Material>();
        card71earnings.add(new Material("none",0));
        Card seventyone = new Card("arena", card71reqs, card71earnings,71,-1,"Yellow","arena.png",3,"ARENA");
        cards3.add(seventyone);
        cards3.add(seventyone);
        cards3.add(seventyone);

        ArrayList<Material> card72reqs = new ArrayList<Material>();
        card72reqs.add(new Material("Clay",2));
        card72reqs.add(new Material("Loom",1));
        card72reqs.add(new Material("Paper",1));
        ArrayList<Material> card72earnings = new ArrayList<Material>();
        card72earnings.add(new Material("ScienceRuler",1));
        Card seventytwo = new Card("lodge", card72reqs, card72earnings,72,-1,"Green","lodge.png",3);
        cards3.add(seventytwo);
        cards3.add(seventytwo);

        ArrayList<Material> card73reqs = new ArrayList<Material>();
        card73reqs.add(new Material("Wood",1));
        card73reqs.add(new Material("Clay",3));
        ArrayList<Material> card73earnings = new ArrayList<Material>();
        card73earnings.add(new Material("Military",3));
        Card seventythree = new Card("siegeworkshop", card73reqs, card73earnings,73,-1,"Red","siegeworkshop.png",3);
        cards3.add(seventythree);
        cards3.add(seventythree);

        ArrayList<Material> card74reqs = new ArrayList<Material>();
        card74reqs.add(new Material("Ore",2));
        card74reqs.add(new Material("Glass",1));
        card74reqs.add(new Material("Loom",1));
        ArrayList<Material> card74earnings = new ArrayList<Material>();
        card74earnings.add(new Material("ScienceWheel",1));
        Card seventyfour = new Card("observatory", card74reqs, card74earnings,74,-1,"Green","observatory.png",3);
        cards3.add(seventyfour);
        cards3.add(seventyfour);

        ArrayList<Material> card75reqs = new ArrayList<Material>();
        card75reqs.add(new Material("Ore",1));
        card75reqs.add(new Material("Stone",1));
        card75reqs.add(new Material("Wood",2));
        ArrayList<Material> card75earnings = new ArrayList<Material>();
        card75earnings.add(new Material("Civilian",6));
        Card seventyfive = new Card("senate", card75reqs, card75earnings,75,-1,"Blue","senate.png",3);
        cards3.add(seventyfive);
        cards3.add(seventyfive);

        ArrayList<Material> card76reqs = new ArrayList<Material>();
        card76reqs.add(new Material("Wood",2));
        card76reqs.add(new Material("Paper",1));
        card76reqs.add(new Material("Glass",1));
        ArrayList<Material> card76earnings = new ArrayList<Material>();
        card76earnings.add(new Material("ScienceStone",1));
        Card seventysix = new Card("university", card76reqs, card76earnings,76,-1,"Green","university.png",3);
        cards3.add(seventysix);
        cards3.add(seventysix);

        ArrayList<Material> card77reqs = new ArrayList<Material>();
        card77reqs.add(new Material("Stone",3));
        card77reqs.add(new Material("Glass",1));
        ArrayList<Material> card77earnings = new ArrayList<Material>();
        card77earnings.add(new Material("ScienceRuler",1));
        Card seventyseven = new Card("academy", card77reqs, card77earnings,77,-1,"Green","academy.png",3);
        cards3.add(seventyseven);
        cards3.add(seventyseven);

        ArrayList<Material> card78reqs = new ArrayList<Material>();
        card78reqs.add(new Material("Wood",1));
        card78reqs.add(new Material("Paper",1));
        card78reqs.add(new Material("Loom",1));
        ArrayList<Material> card78earnings = new ArrayList<Material>();
        card78earnings.add(new Material("ScienceWheel",1));
        Card seventyeight = new Card("study", card78reqs, card78earnings,78,-1,"Green","study.png",3);
        cards3.add(seventyeight);
        cards3.add(seventyeight);


        if(numberOfPlayers == 7){
            // do nothing
        }
        else if(numberOfPlayers == 6){
            int[] cardIdOfCardsToBeDeleted = {64,68,70,71,74,77};
            for(int i = 0; i < cardIdOfCardsToBeDeleted.length; i++){
                cards3.remove(findById(cards3,cardIdOfCardsToBeDeleted[i]));
            }
        }
        else if(numberOfPlayers == 5){
            int[] cardIdOfCardsToBeDeleted = {61,63,64,66,67,68,69,70,71,72,74,77};
            for(int i = 0; i < cardIdOfCardsToBeDeleted.length; i++){
                cards3.remove(findById(cards3,cardIdOfCardsToBeDeleted[i]));
            }
        }
        else if(numberOfPlayers == 4){
            int[] cardIdOfCardsToBeDeleted = {61,63,63,64,66,67,68,69,69,70,71,71,72,73,74,75,77,78};
            for(int i = 0; i < cardIdOfCardsToBeDeleted.length; i++){
                cards3.remove(findById(cards3,cardIdOfCardsToBeDeleted[i]));
            }
        }
        // number of players is 3
        else{
            int[] cardIdOfCardsToBeDeleted = {61,62,63,63,64,65,66,67,67,68,69,69,69,70,70,71,71,72,73,74,75,76,77,78};
            for(int i = 0; i < cardIdOfCardsToBeDeleted.length; i++){
                cards3.remove(findById(cards3,cardIdOfCardsToBeDeleted[i]));
            }

        }
        Collections.shuffle(cards3);
        printCards(cards3);


    }

    // this method do not include duplicate cards in one arraylist
    public Card findById(ArrayList<Card> cardArrayList, int Id){
        for(int i = 0; i < cardArrayList.size(); i++){
            if(cardArrayList.get(i).getId() == Id){
                return cardArrayList.get(i);
            }
        }
        return null;
    }

    public int getNumberOfGreenCards(ArrayList<Card> green) {
        int count = 0;
        for(int i = 0; i < green.size(); i++) {
            if(green.get(i).getColor().equals("Green")){
                count++;
            }
        }
        return count;
    }

    public int getNumberOfRedCards(ArrayList<Card> red) {
        int count = 0;
        for(int i = 0; i < red.size(); i++) {
            if(red.get(i).getColor().equals("Red")){
                count++;
            }
        }
        return count;
    }
    public int getNumberOfBlueCards(ArrayList<Card> blue) {
        int count = 0;
        for(int i = 0; i < blue.size(); i++) {
            if(blue.get(i).getColor().equals("Blue")){
                count++;
            }
        }
        return count;
    }
    public int getNumberOfBrownCards(ArrayList<Card> brown) {
        int count = 0;
        for(int i = 0; i < brown.size(); i++) {
            if(brown.get(i).getColor().equals("Brown")){
                count++;
            }
        }
        return count;
    }
    public int getNumberOfPurpleCards(ArrayList<Card> purple) {
        int count = 0;
        for(int i = 0; i < purple.size(); i++) {
            if(purple.get(i).getColor().equals("Purple")){
                count++;
            }
        }
        return count;
    }
    public int getNumberOfYellowCards(ArrayList<Card> yellow) {
        int count = 0;
        for(int i = 0; i < yellow.size(); i++) {
            if(yellow.get(i).getColor().equals("Yellow")){
                count++;
            }
        }
        return count;
    }
    public int getNumberOfGreyCards(ArrayList<Card> grey) {
        int count = 0;
        for(int i = 0; i < grey.size(); i++) {
            if(grey.get(i).getColor().equals("Grey")){
                count++;
            }
        }
        return count;
    }


    public void shuffleCards(ArrayList<Card> cardsToShuffle){
        Collections.shuffle(cardsToShuffle);
    }


    public void distributeCards(ArrayList<Player> players, ArrayList<Card> distributeCards){

    }

    public void traverseHands(ArrayList<Player> players, int numberOfPlayers){
        for(int i = 0; i < numberOfPlayers; i++){
            // give the hand to i + 1 index player
        }
    }

    public boolean verifySufficientResources(Player player, Card card){
        return false;
    }

    public void printCards(ArrayList<Card> cardPrint){
        for(int i = 0; i < cardPrint.size(); i++){
            cardPrint.get(i).print();
        }
    }



}
