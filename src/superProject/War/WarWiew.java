package superProject.War;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import superProject.Player.Player;

import javafx.scene.control.*;
import javafx.scene.layout.*;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.control.Label;
import javafx.stage.Stage;

public class WarWiew extends Application {
    private boolean leftWarWinner; //winner of the left side war
    private boolean rightWarWinner; //winner of the right side wara
    private Player left;
    private Player right;
    //private Label labelLeft;
    //private Label labelRight;

    public WarWiew(boolean leftWarWinner, boolean rightWarWinner){
        setLeftWarWinner(leftWarWinner);
        setRightWarWinner(rightWarWinner);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../War/WarViewFX.fxml"));
            primaryStage.setTitle("War");

            primaryStage.setScene(new Scene(root, 720, 460));

            primaryStage.setResizable(false);
            primaryStage.centerOnScreen();
            primaryStage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void setLeftWarWinner(boolean leftWarWinner) {
        this.leftWarWinner = leftWarWinner;
    }

    public void setRightWarWinner(boolean rightWarWinner) {
        this.rightWarWinner = rightWarWinner;
    }

    public boolean isLeftWarWinner() {
        return leftWarWinner;
    }

    public boolean isRightWarWinner() {
        return rightWarWinner;
    }

    @FXML
    public void setLeftWarLabel(){
        if( leftWarWinner )
            System.out.print("VICTORY");
        else
            System.out.print("DEFEAT");
    }

    @FXML
    public void setRightWarLabel(){
        if( rightWarWinner )
            System.out.print("VICTORY");
        else
            System.out.print("DEFEAT");
    }

    public void getPlayerLeft() {
        System.out.print(left); //prints left player
    }

    public void getPlayerRight(){
        System.out.print(right); //prints right player
    }
}
