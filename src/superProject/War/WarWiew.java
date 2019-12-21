package superProject.War;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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

public class WarWiew extends Application {

    @FXML
    private Label leftResLabel;
    @FXML
    private Label rightResLabel;
    @FXML
    private Button resultsButton;
    @FXML
    private Rectangle2D primaryScreenBounds;
    @FXML
    private  AnchorPane smallPane1;
    @FXML
    private  AnchorPane smallPane2;


    private double prefHeightSmall;
    private boolean leftWarWinner; //winner of the left side war
    private boolean rightWarWinner; //winner of the right side war (true means this current player is winner)

    private Player leftNeighbour;
    private Player rightNeighbour;
    private Player mainPlayer;

    public WarWiew(){
        //leftWarWinner = true;
        //rightWarWinner = true;
    }

    public WarWiew(Player mainPlayer, Player leftNeighbour, boolean leftWarWinner, Player rightNeighbour, boolean rightWarWinner){
        setLeftWarWinner(leftWarWinner);
        setRightWarWinner(rightWarWinner);
        setLeftNeighbour(leftNeighbour);
        setRightNeighbour(rightNeighbour);
        setMainPlayer(mainPlayer);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../War/WarViewFX.fxml"));
            primaryStage.setTitle("War");

            primaryStage.setScene(new Scene(root));
            primaryStage.setFullScreen(true);

            primaryScreenBounds = Screen.getPrimary().getVisualBounds();
            System.out.println(primaryScreenBounds);

            prefHeightSmall = (int) primaryScreenBounds.getHeight() * 9 / 10;
            int prefWidthSmall = (int) primaryScreenBounds.getWidth() / 2;

            /*
            smallPane1.setMaxWidth(prefWidthSmall);
            smallPane1.setMaxHeight(prefHeightSmall);
            smallPane1.setPrefSize(prefWidthSmall, prefHeightSmall);
            smallPane2.setMaxWidth(prefWidthSmall);
            smallPane2.setMaxHeight(prefHeightSmall);
            smallPane2.setPrefSize(prefWidthSmall, prefHeightSmall);
            */

            primaryStage.setResizable(true);
            primaryStage.centerOnScreen();

            primaryStage.show();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public double getPrefHeightSmall(){
        System.out.println("hey " + this.prefHeightSmall);
        return this.prefHeightSmall;
    }

    public void setPrefHeightSmall(int prefHeightSmall) {
        this.prefHeightSmall = prefHeightSmall;
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
    public void setLabels(){
        setLeftWarLabel();
        setRightWarLabel();
        resultsButton.setDisable(true);
    }

    @FXML
    public void setLeftWarLabel(){
        if( leftWarWinner )
            leftResLabel.setText("VICTORY");
        else
            leftResLabel.setText("DEFEAT");
    }

    @FXML
    public void setRightWarLabel(){
        if( rightWarWinner )
            rightResLabel.setText("VICTORY");
        else
            rightResLabel.setText("DEFEAT");
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

    public static void main(String[] args) {
        launch(args);
    }
}

//public class LabelController
