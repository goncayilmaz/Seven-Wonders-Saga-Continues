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
import superProject.Player.Player;
import superProject.Player.PlayerEngine;

import static javafx.fxml.FXMLLoader.load;


public class Main {







    public static void main(String[] args) {
        // GameEngine gameEngine = new GameEngine();
        CityManager citymanager = new CityManager();
        CardEngine cardEngine = new CardEngine();
        PlayerEngine playerEngine = new PlayerEngine(5);

        citymanager.createACities();
        System.out.println(" BEFORE ARRANGE");
        citymanager.printACities();
        System.out.println(" AFTER ARRANGE");
        citymanager.arrangeCities(5,"The Mausoleum of Halicarnassus",true);
        citymanager.printACities();
        City cityofplayer = citymanager.getPlayerCity(true,"The Mausoleum of Halicarnassus" );
        System.out.println(" CITY OF PLAYER");
        cityofplayer.print();
        System.out.println(" AGE CARDS");
        Player player = playerEngine.getHumanPlayer();
        cardEngine.createFirstAgeCards(5);
        cardEngine.createSecondAgeCards(5);
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
        player.addCardsToTable(cards.get(0));
        System.out.println();
        player.addCardsToTable(cards.get(1));
        System.out.println();
        player.addCardsToTable(cards.get(2));
        System.out.println();
        player.addCardsToTable(cards.get(3));
        System.out.println();

        System.out.println("PLAYER");
        player.print();


    }
}
