package superProject.GameProperties;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import superProject.Player.Player;

import java.util.ArrayList;

public class CardEngine extends Application {

    private ArrayList<Card> cards;
    private ArrayList<Card> cards2;
    private ArrayList<Card> cards3;

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
        createFirstAgeCards(1);
        printCards();




    }


    public void createFirstAgeCards(int ageNum){
        if(ageNum != 1){
            System.out.println("not the proper age");
            return;
        }
        cards = new ArrayList<Card>();
        // Material m = new Material("Clay", 1);

        ArrayList<Material> card1reqs = new ArrayList<Material>();
        card1reqs.add(new Material("none",0));
        ArrayList<Material> card1earnings = new ArrayList<Material>();
        card1earnings.add(new Material("Wood",1));
        Card one = new Card("lumberyard", card1reqs, card1earnings,1,-1,"Brown","lumberyard.png",1);
        cards.add(one);

        ArrayList<Material> card2reqs = new ArrayList<Material>();
        card2reqs.add(new Material("none",0));
        ArrayList<Material> card2earnings = new ArrayList<Material>();
        card2earnings.add(new Material("Stone",1));
        Card two = new Card("stonepit", card2reqs, card2earnings,2,-1,"Brown","stonepit.png",1);
        cards.add(two);

        ArrayList<Material> card3reqs = new ArrayList<Material>();
        card3reqs.add(new Material("none",0));
        ArrayList<Material> card3earnings = new ArrayList<Material>();
        card3earnings.add(new Material("Clay",1));
        Card three = new Card("claypool", card3reqs, card3earnings,3,-1,"Brown","claypool.png",1);
        cards.add(three);

        ArrayList<Material> card4reqs = new ArrayList<Material>();
        card4reqs.add(new Material("none",0));
        ArrayList<Material> card4earnings = new ArrayList<Material>();
        card4earnings.add(new Material("Ore",1));
        Card four = new Card("orevein", card4reqs, card4earnings,4,-1,"Brown","orevein.png",1);
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

        ArrayList<Material> card12reqs = new ArrayList<Material>();
        card12reqs.add(new Material("none",0));
        ArrayList<Material> card12earnings = new ArrayList<Material>();
        card12earnings.add(new Material("Glass",1));
        Card twelve = new Card("glassworks", card12reqs, card12earnings,12,-1,"Grey","glassworks.png",1);
        cards.add(twelve);

        ArrayList<Material> card13reqs = new ArrayList<Material>();
        card13reqs.add(new Material("none",0));
        ArrayList<Material> card13earnings = new ArrayList<Material>();
        card13earnings.add(new Material("Press",1));
        Card thirteen = new Card("press", card13reqs, card13earnings,13,-1,"Grey","press.png",1);
        cards.add(thirteen);

        ArrayList<Material> card14reqs = new ArrayList<Material>();
        card14reqs.add(new Material("none",0));
        ArrayList<Material> card14earnings = new ArrayList<Material>();
        card14earnings.add(new Material("Civilian",3));
        Card fourteen = new Card("pawnshop", card14reqs, card14earnings,14,-1,"Blue","pawnshop.png",1);
        cards.add(fourteen);

        ArrayList<Material> card15reqs = new ArrayList<Material>();
        card15reqs.add(new Material("Stone",1));
        ArrayList<Material> card15earnings = new ArrayList<Material>();
        card15earnings.add(new Material("Civilian",3));
        Card fifteen = new Card("baths", card15reqs, card15earnings,15,35,"Blue","baths.png",1);
        cards.add(fifteen);

        ArrayList<Material> card16reqs = new ArrayList<Material>();
        card16reqs.add(new Material("none",0));
        ArrayList<Material> card16earnings = new ArrayList<Material>();
        card16earnings.add(new Material("Civilian",2));
        Card sixteen = new Card("altar", card16reqs, card16earnings,16,36,"Blue","altar.png",1);
        cards.add(sixteen);

        ArrayList<Material> card17reqs = new ArrayList<Material>();
        card17reqs.add(new Material("none",0));
        ArrayList<Material> card17earnings = new ArrayList<Material>();
        card17earnings.add(new Material("Civilian",2));
        Card seventeen = new Card("theater", card17reqs, card17earnings,17,37,"Blue","theater.png",1);
        cards.add(seventeen);

        ArrayList<Material> card18reqs = new ArrayList<Material>();
        card18reqs.add(new Material("none",0));
        ArrayList<Material> card18earnings = new ArrayList<Material>();
        card18earnings.add(new Material("Coin",5));
        Card eighteen = new Card("tavern", card18reqs, card18earnings,18,-1,"Yellow","tavern.png",1);
        cards.add(eighteen);

        ArrayList<Material> card19reqs = new ArrayList<Material>();  // EAST TRADİNG POST
        card19reqs.add(new Material("none",0));
        ArrayList<Material> card19earnings = new ArrayList<Material>();
        card19earnings.add(new Material("Coin",5));
        Card nineteen = new Card("easttradingpost", card19reqs, card19earnings,19,38,"Yellow","easttradingpost.png",1,"EASTTRADINGPOST");
        cards.add(nineteen);

        ArrayList<Material> card20reqs = new ArrayList<Material>();  // WEST TRADİNG POST
        card20reqs.add(new Material("none",0));
        ArrayList<Material> card20earnings = new ArrayList<Material>();
        card20earnings.add(new Material("none",0));
        Card twenty = new Card("westtradingpost", card20reqs, card20earnings,20,38,"Yellow","westtradingpost.png",1,"WESTTRADINGPOST");
        cards.add(twenty);

        ArrayList<Material> card21reqs = new ArrayList<Material>();  // MARKETPLACE
        card21reqs.add(new Material("none",0));
        ArrayList<Material> card21earnings = new ArrayList<Material>();
        card21earnings.add(new Material("none",0));
        Card twentyone = new Card("marketplace", card21reqs, card21earnings,21,39,"Yellow","marketplace.png",1,"MARKETPLACE");
        cards.add(twentyone);

        ArrayList<Material> card22reqs = new ArrayList<Material>();
        card22reqs.add(new Material("Wood",1));
        ArrayList<Material> card22earnings = new ArrayList<Material>();
        card22earnings.add(new Material("Military",1));
        Card twentytwo = new Card("stockade", card22reqs, card22earnings,22,-1,"Red","stockade.png",1);
        cards.add(twentytwo);

        ArrayList<Material> card23reqs = new ArrayList<Material>();
        card23reqs.add(new Material("Ore",1));
        ArrayList<Material> card23earnings = new ArrayList<Material>();
        card23earnings.add(new Material("Military",1));
        Card twentythree = new Card("barracks", card23reqs, card23earnings,23,-1,"Red","barracks.png",1);
        cards.add(twentythree);

        ArrayList<Material> card24reqs = new ArrayList<Material>();
        card24reqs.add(new Material("Clay",1));
        ArrayList<Material> card24earnings = new ArrayList<Material>();
        card24earnings.add(new Material("Military",1));
        Card twentyfour = new Card("guardtower", card24reqs, card24earnings,24,-1,"Red","guardtower.png",1);
        cards.add(twentyfour);

        ArrayList<Material> card25reqs = new ArrayList<Material>();
        card25reqs.add(new Material("Loom",1));
        ArrayList<Material> card25earnings = new ArrayList<Material>();
        card25earnings.add(new Material("ScienceRuler",1));
        Card twentyfive = new Card("apothecary", card25reqs, card25earnings,25,45,"Green","apothecary.png",1);
        cards.add(twentyfive);

        ArrayList<Material> card26reqs = new ArrayList<Material>();
        card26reqs.add(new Material("Glass",1));
        ArrayList<Material> card26earnings = new ArrayList<Material>();
        card26earnings.add(new Material("ScienceWheel",1));
        Card twentysix = new Card("workshop", card26reqs, card26earnings,26,47,"Green","workshop.png",1);
        cards.add(twentysix);

        ArrayList<Material> card27reqs = new ArrayList<Material>();
        card27reqs.add(new Material("Paper",1));
        ArrayList<Material> card27earnings = new ArrayList<Material>();
        card27earnings.add(new Material("ScienceStone",1));
        Card twentyseven = new Card("scriptorium", card27reqs, card27earnings,27,49,"Green","scriptorium.png",1);
        cards.add(twentyseven);
    }
    public void createSecondAgeCards(int ageNum){
        if(ageNum != 2){
            return;
        }
    }
    public void createThirdAgeCards(int ageNum){
        if(ageNum != 3){
            return;
        }
    }

    public void distributeCards(ArrayList<Player> players, int numberOfPlayers){

    }

    public void traverseHands(ArrayList<Player> players, int numberOfPlayers){
        for(int i = 0; i < numberOfPlayers; i++){
            // give the hand to i + 1 index player
        }
    }

    public boolean verifySufficientResources(Player player, Card card){
        return false;
    }

    public void printCards(){
        for(int i = 0; i < cards.size(); i++){
            cards.get(i).print();
        }
    }


}
