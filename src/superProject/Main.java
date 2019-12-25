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

        citymanager.createACities();
        System.out.println(" BEFORE ARRANGE");
        citymanager.printACities();
        System.out.println(" AFTER ARRANGE");
        citymanager.arrangeCities(7,"The Mausoleum of Halicarnassus",true);
        citymanager.printACities();

        City cityofplayer = citymanager.getPlayerCity(true,"The Mausoleum of Halicarnassus" );
        PlayerEngine playerEngine = new PlayerEngine(7,cityofplayer,citymanager.getCitiesA());
        System.out.println(" CITY OF PLAYER");
        cityofplayer.print();
        System.out.println(" AGE CARDS");
        Player player = playerEngine.getHumanPlayer();
        cardEngine.createFirstAgeCards(7);
        //cardEngine.createSecondAgeCards(7);
        ArrayList<Card> firstAgeCards = cardEngine.getFirstAgeCards();
        //ArrayList<Card> cards = cardEngine.getSecondAgeCards();
        player.setCity(cityofplayer);
        //System.out.println(player.addCardsToTable(cards.get(0)));
        System.out.println("PLAYERSSS");
        ArrayList<Player> players = playerEngine.getAllPlayers();
        for(int i = 0; i < players.size(); i++){
            players.get(i).print();
        }
        playerEngine.distributeHands(firstAgeCards);
        playerEngine.getHumanPlayer().print();

        for(int i = 0; i < players.size(); i++){
            players.get(i).print();
        }
       // do action for bots
        ArrayList<Bot> botplayers = playerEngine.getBots();
        for(int i = 0; i < botplayers.size(); i++){
            botplayers.get(i).doAction(1,players);
        }
        for(int i = 0; i < botplayers.size(); i++){
            botplayers.get(i).doAction(1,players);
        }
        for(int i = 0; i < botplayers.size(); i++){
            botplayers.get(i).doAction(1,players);
        }
        for(int i = 0; i < botplayers.size(); i++){
            botplayers.get(i).doAction(1,players);
        }
        for(int i = 0; i < botplayers.size(); i++){
            botplayers.get(i).doAction(1,players);
        }
        for(int i = 0; i < botplayers.size(); i++){
            botplayers.get(i).doAction(1,players);
        }
        for(int i = 0; i < botplayers.size(); i++){
            botplayers.get(i).doAction(1,players);
        }
//        botplayers.get(0).print();
//        botplayers.get(0).doAction(1,players);
        System.out.println("PLAYERS AFTER DO ACTİION");
        for(int i = 0; i < botplayers.size(); i++){
            botplayers.get(i).print();
        }


    }
}
