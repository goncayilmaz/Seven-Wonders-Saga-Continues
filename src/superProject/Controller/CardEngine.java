package superProject.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import superProject.Model.Card;

import java.util.ArrayList;

public class CardEngine extends Application {



        private ArrayList<Card> cards;

        public CardEngine(){

        }


        public void disjointCard(Card card){ }
        public void addCard(Card card){}
        public Card getCardInformation(Card card){return null;}







    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../View/CardViewFX.fxml"));
            primaryStage.setTitle("Card View");

            primaryStage.setScene(new Scene(root, 200, 300));
            // primaryStage.setResizable(false);
            primaryStage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }




    }
}
