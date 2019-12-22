package superProject;

import javafx.application.Application;
import javafx.stage.Stage;
import superProject.Player.Player;
import superProject.War.AttackManager;

public class Main extends Application {

    public static void main(String[] args) {

        //test unit for AttackManager
        int numberOfPlayers = 3;
        Player[] players;
        players = new Player[numberOfPlayers];
        for(int i = 0; i < numberOfPlayers; i ++)
            players[i] = new Player();
        players[0].setWarPoints(2);
        players[1].setWarPoints(2);
        players[2].setWarPoints(3);

        AttackManager attackMan = new AttackManager(numberOfPlayers, 1, players);
        attackMan.fight();

        for(int i = 0; i < numberOfPlayers; i ++)
            System.out.println("Player " + i + " score: " + players[i].getScore());

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
