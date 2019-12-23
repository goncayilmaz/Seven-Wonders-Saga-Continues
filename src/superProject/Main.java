package superProject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import superProject.City.City;
import superProject.City.CityManager;
import superProject.GameMain.GameEngine;
import superProject.GameProperties.Card;
import superProject.GameProperties.CardEngine;
import superProject.Player.Bot;
import superProject.Player.Player;
import superProject.Player.PlayerEngine;

import static javafx.fxml.FXMLLoader.load;


public class Main {


    public static void main(String[] args) {
        // GameEngine gameEngine = new GameEngine();
        CityManager citymanager = new CityManager();
        CardEngine cardEngine = new CardEngine();
        PlayerEngine playerEngine = new PlayerEngine(7);

        citymanager.createACities();
        System.out.println(" BEFORE ARRANGE");
        citymanager.printACities();
        System.out.println(" AFTER ARRANGE");
        citymanager.arrangeCities(7,"The Mausoleum of Halicarnassus",true);
        citymanager.printACities();
        City cityofplayer = citymanager.getPlayerCity(true,"The Mausoleum of Halicarnassus" );
        System.out.println(" CITY OF PLAYER");
        cityofplayer.print();
        System.out.println(" AGE CARDS");
        Player player = playerEngine.getHumanPlayer();
        cardEngine.createFirstAgeCards(7);
        cardEngine.createSecondAgeCards(7);
        ArrayList<Card> cards = cardEngine.getFirstAgeCards();
        //ArrayList<Card> cards = cardEngine.getSecondAgeCards();
        player.setCity(cityofplayer);
        //System.out.println(player.addCardsToTable(cards.get(0)));
        System.out.println("CARD");
        //cards.get(23).print();
        //System.out.println(player.verifySufficientResources(cards.get(23)));
        // playerEngine.
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("CARDS");
        cards.get(0).print();
        System.out.println();
        cards.get(1).print();
        System.out.println();
        cards.get(2).print();
        System.out.println();
        cards.get(3).print();
        System.out.println();
        System.out.println("meowww");
        cards.get(0).print();
        player.addCardsToTable(cards.get(0));
        System.out.println();
        player.addCardsToTable(cards.get(1));
        System.out.println();
        player.addCardsToTable(cards.get(2));
        System.out.println();
        player.addCardsToTable(cards.get(3));
        System.out.println();

        System.out.println();
        System.out.println("*********************************************************************************");
        System.out.println("PLAYER");
        player.print();
        System.out.println();
        System.out.println();
        //citymanager.printACities();
        citymanager.getCitiesA().get(0).print();
        System.out.println();
        PlayerEngine playerEngine2 = new PlayerEngine(7, cityofplayer, citymanager.getCitiesA());
        playerEngine2.printPlayers();
        System.out.println();
        System.out.println("*********************************************************************************");
        System.out.println();
        Bot b = new Bot(3);
        System.out.println("Bot war points: " + b.getWarPoints());

        System.out.println("*********************************************************************************");
        System.out.println("*********************************************************************************");
        System.out.println("*********************************************************************************");


        ArrayList<Player> players = playerEngine.getAllPlayers();
        System.out.println("   " + players.size());
        for(int i = 0; i < 7; i++){
            b.addToHandAtFirst(cards.get(i));
        }
        b.setCity(cityofplayer);
        b.print();
        b.doAction(1,playerEngine.getAllPlayers());
        System.out.println(b.numberOfCard());

        ArrayList<Card> newhand = new ArrayList<>();
        for(int i = 7; i < 14; i++){
            newhand.add(cards.get(i));
        }
        b.setHand(newhand);
        b.doAction(1,playerEngine.getAllPlayers());
        System.out.println(b.numberOfCard());
        b.print();

    }
}
