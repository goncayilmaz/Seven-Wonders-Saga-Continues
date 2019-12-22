package superProject.War;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import superProject.Player.Player;
import superProject.City.City;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.stage.Screen;
import javafx.stage.Stage;

import javafx.scene.control.*;
import javafx.scene.layout.*;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.stage.Screen.getPrimary;

public class WarWiew  /*implements Initializable */ extends Application {

    @FXML
    private Label leftResLabel;
    @FXML
    private Label rightResLabel;
    @FXML
    private Button resultsButton;
    @FXML
    private Button xoxButton1;
    @FXML
    private Button xoxButton2;
    @FXML
    private Rectangle2D primaryScreenBounds;
    @FXML
    private  AnchorPane smallPane1;
    @FXML
    private  AnchorPane smallPane2;


    @FXML
    private double prefHeightSmall;
    @FXML
    private double prefWidthSmall;

    private int leftWarWinner; //winner of the left side war
    private int rightWarWinner; //winner of the right side war (true means this current player is winner)

    private Player leftNeighbour;
    private Player rightNeighbour;
    private Player mainPlayer;

    public WarWiew(){
        //leftWarWinner = true;
        //rightWarWinner = true;
        leftWarWinner = 1;
        rightWarWinner = 0;
    }


    @Override
    public void start( Stage primaryStage) throws Exception{

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../War/WarViewFX.fxml"));
            primaryStage.setTitle("War");

            primaryStage.setScene(new Scene(root));
            primaryStage.setFullScreen(true);

        //
        //
        primaryStage.setResizable(true);
        primaryStage.centerOnScreen();
        //
        primaryStage.show();
        //
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public WarWiew(Player mainPlayer, Player leftNeighbour, int leftWarWinner, Player rightNeighbour, int rightWarWinner){
        setLeftWarWinner(leftWarWinner);
        setRightWarWinner(rightWarWinner);
        setLeftNeighbour(leftNeighbour);
        setRightNeighbour(rightNeighbour);
        setMainPlayer(mainPlayer);
    }

    /*
    public double getPrefHeightSmall(){
        System.out.println("hey " + this.prefHeightSmall);
        return this.prefHeightSmall;
    } */

    public void setPrefHeightSmall(int prefHeightSmall) {
        this.prefHeightSmall = prefHeightSmall;
    }

    public void setLeftWarWinner(int leftWarWinner) {
        this.leftWarWinner = leftWarWinner;
    }

    public void setRightWarWinner(int rightWarWinner) {
        this.rightWarWinner = rightWarWinner;
    }

    public boolean isLeftWarWinner() {
        if( leftWarWinner > 0)
            return true;
        return false;
    }

    public boolean isRightWarWinner() {
        if(rightWarWinner > 0)
            return true;
        return false;
    }

    @FXML
    public void setLabels(){
        setLeftWarLabel();
        setRightWarLabel();
        resultsButton.setDisable(true);
    }

    @FXML
    public void setLeftWarLabel(){
        if( leftWarWinner > 0 )
            leftResLabel.setText("VICTORY");
        else if (leftWarWinner < 0)
            leftResLabel.setText("DEFEAT");
        else {
            xoxButton1.setVisible(true);
            leftResLabel.setText("EQUALITY");
        }
    }

    @FXML
    public void setRightWarLabel(){
        if( rightWarWinner > 0 )
            rightResLabel.setText("VICTORY");
        else if (rightWarWinner < 0)
            rightResLabel.setText("DEFEAT");
        else{
            xoxButton2.setVisible(true);
            rightResLabel.setText("EQUALITY");
        }
    }

    public void getPlayerLeft() {
        System.out.print("hey"); //prints left player
    }

    public void getPlayerRight(){
        System.out.print("hey2"); //prints right player
    }

    public Player getLeftNeighbour() {
        return leftNeighbour;
    }

    public void setLeftNeighbour(Player leftNeighbour) {
        this.leftNeighbour = leftNeighbour;
    }

    public Player getRightNeighbour() {
        return rightNeighbour;
    }

    public void setRightNeighbour(Player rightNeighbour) {
        this.rightNeighbour = rightNeighbour;
    }

    public Player getMainPlayer() {
        return mainPlayer;
    }

    public void setMainPlayer(Player mainPlayer) {
        this.mainPlayer = mainPlayer;
    }

    /*
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //leftNeighbour.
        primaryScreenBounds = getPrimary().getVisualBounds();
        //System.out.println(primaryScreenBounds);

        prefHeightSmall = primaryScreenBounds.getHeight() * 9 / 10;
        prefWidthSmall  = primaryScreenBounds.getWidth() / 2;

        smallPane1.setMaxWidth(prefWidthSmall);
        smallPane1.setMaxHeight(prefHeightSmall);
        smallPane1.setPrefSize(prefWidthSmall, prefHeightSmall);
        smallPane2.setMaxWidth(prefWidthSmall);
        smallPane2.setMaxHeight(prefHeightSmall);
        smallPane2.setPrefSize(prefWidthSmall, prefHeightSmall);

    } */

    @FXML
    public void goToXOX_1(){
        Stage stage;
        Parent root;

        //System.out.println("xox button is clicked");

        try {
            stage = (Stage) xoxButton1.getScene().getWindow();
            root=FXMLLoader.load(getClass().getResource("../War/XOXViewFX.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){

        }
    }

    @FXML
    public void goToXOX_2(){
        Stage stage;
        Parent root;
        //XOXGame xox;
        //new XOXGame();

        //System.out.println("xox button is clicked");

        try {
            System.out.println("heyy");
            stage = (Stage) xoxButton2.getScene().getWindow();
            root= FXMLLoader.load(getClass().getResource("../War/XOX_FX.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setFullScreen(true);
            stage.show();
        }
        catch (Exception e){

        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}

//public class LabelController
