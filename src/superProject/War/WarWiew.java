package superProject.War;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;
import javafx.util.Duration;
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

import java.net.URL;
import java.util.Collections;
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
    private Button button00;
    @FXML
    private Button button01;
    @FXML
    private Button button02;
    @FXML
    private Button button10;
    @FXML
    private Button button11;
    @FXML
    private Button button12;
    @FXML
    private Button button20;
    @FXML
    private Button button21;
    @FXML
    private Button button22;

    @FXML
    private Label resultLabel;

    @FXML
    private Button returnButton;

    @FXML
    private Label turnLabel;

    private boolean isWinner; //for only xox


    @FXML
    private double prefHeightSmall;
    @FXML
    private double prefWidthSmall;

    private int leftWarWinner; //winner of the left side war
    private int rightWarWinner; //winner of the right side war (true means this current player is winner)

    private Player leftNeighbour;
    private Player rightNeighbour;
    private Player mainPlayer;

    @FXML
    Button[] buttons;

    private boolean isXOXover;

    public WarWiew(){
        //leftWarWinner = true;
        //rightWarWinner = true;
        leftWarWinner = 1;
        rightWarWinner = 0;
        buttons = new Button[9];
        isXOXover = true;
    }


    @Override
    public void start( Stage primaryStage) throws Exception{

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../War/WarViewFX.fxml"));
            primaryStage.setTitle("War");

            primaryStage.setScene(new Scene(root));
            primaryStage.setFullScreen(true);

            primaryStage.setResizable(true);
            primaryStage.centerOnScreen();
            primaryStage.show();

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
        buttons = new Button[9];
        isXOXover = true;
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
            System.out.println("gata");

        }
    }

    @FXML
    public void goToXOX_2(){
        Stage stage;
        Parent root;

        try {
            //System.out.println("heyy");
            stage = (Stage) xoxButton2.getScene().getWindow();
            root= FXMLLoader.load(getClass().getResource("../War/XOX_FX.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setFullScreen(true);
            stage.show();

        }
        catch (Exception e){
            System.out.println("aasd");

        }
    }

    private void createButtons(){
        isXOXover = false;
        buttons[0] = button00;
        buttons[1] = button01;
        buttons[2] = button02;
        buttons[3] = button10;
        buttons[4] = button11;
        buttons[5] = button12;
        buttons[6] = button20;
        buttons[7] = button21;
        buttons[8] = button22;
    }

    public void isGameFinished(){
        boolean areButtonsFull = true;
        boolean isCombo = false;
        for(int i = 0; i < 9; i++){
            if(!buttons[i].isDisabled())
                areButtonsFull = false;
        }

        Button[] combo = new Button[3];

        //horizontal
        for(int i = 0; i < 9; i = i + 3){
            if(!buttons[i].getText().equals("") && buttons[i].getText().equals(buttons[i+1].getText()) && buttons[i].getText().equals(buttons[i+2].getText())) {
                if (buttons[i].getText().equals("X"))
                    isWinner = true;
                else
                    isWinner = false;
                combo[0] = buttons[i];
                combo[1] = buttons[i+1];
                combo[2] = buttons[i+2];
                isXOXover = true;
                isCombo = true;
            }
        }

        if( !isXOXover) {

            //vertical
            for (int i = 0; i < 3; i++) {
                if (!buttons[i].getText().equals("") && buttons[i].getText().equals(buttons[i + 3].getText()) && buttons[i].getText().equals(buttons[i + 6].getText())) {
                    if (buttons[i].getText().equals("X"))
                        isWinner = true;
                    else
                        isWinner = false;
                    combo[0] = buttons[i];
                    combo[1] = buttons[i+3];
                    combo[2] = buttons[i+6];
                    isXOXover = true;
                    isCombo = true;
                }
            }

        }

        if(!isXOXover) {
            //diagonal
            if (!buttons[0].getText().equals("") && buttons[0].getText().equals(buttons[4].getText()) && buttons[0].getText().equals(buttons[8].getText())) {
                if (buttons[0].getText().equals("X"))
                    isWinner = true;
                else
                    isWinner = false;
                combo[0] = buttons[0];
                combo[1] = buttons[4];
                combo[2] = buttons[8];
                isXOXover = true;
                isCombo = true;
            }
            else if( !buttons[2].getText().equals("")&&  buttons[2].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[6].getText()))
            {
                if (buttons[2].getText().equals("X"))
                    isWinner = true;
                else
                    isWinner = false;
                combo[0] = buttons[2];
                combo[1] = buttons[4];
                combo[2] = buttons[6];
                isXOXover = true;
                isCombo = true;
            }
        }



        if(isWinner)
            resultLabel.setText("YOU WON");
        else
            resultLabel.setText("YOU LOST");

        if( areButtonsFull && !isCombo) {
            isWinner = false; //that means player couldn't win against bot
            isXOXover = true;
            resultLabel.setVisible(true);
        }

        if( isXOXover ) {
            resultLabel.setVisible(true);
            turnLabel.setVisible(false);
            if( isCombo ) {
                playWinAnimation(combo);
            }
            returnButton.setDisable(false);
            for(int i = 0; i < 9; i ++){
                buttons[i].setDisable(true);
            }
        }


    }

    public void playWinAnimation(Button[] combo){
        Line line = new Line();
        line.setStartX(combo[0].getLayoutX());
        line.setStartY(combo[0].getLayoutY());
        line.setEndX(combo[0].getLayoutX());
        line.setEndY(combo[0].getLayoutY());

        //root.getChildren().add(line);
        Timeline timeline = new Timeline();
        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5),
                new KeyValue(line.endXProperty(), combo[2].getLayoutX()),
                new KeyValue(line.endYProperty(), combo[2].getLayoutY())));
        timeline.play();
    }



    @FXML
    public void returnToGameVieww(ActionEvent event) throws Exception{
        Stage stage;
        Parent root;

        try {
            stage = (Stage) returnButton.getScene().getWindow();
            root=FXMLLoader.load(getClass().getResource("../GameMain/GameAreaViewFX.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){

        }
    }

    @FXML
    public void drawX(MouseEvent e) throws Exception{
        Button sourceButton = (Button) e.getSource();
        if(buttons[0] == null || buttons[0].equals(button00))
            createButtons();
        try {
            sourceButton.setText("X");
            sourceButton.setDisable(true);
        }
        catch (Exception f){
            f.printStackTrace();
        }

        isWinner = true;
        isGameFinished();

        if( !isXOXover)
            drawO();

    }

    @FXML
    public void drawO(){


        System.out.println("drawing o ");

        int i = (int) (Math.random() * 9);

        while (!buttons[i].getText().equals("")) {
            System.out.println("hhh");
            i = (int) (Math.random() * 9);

        }

        PauseTransition pauseTransition = new PauseTransition();
        pauseTransition.setDuration(Duration.millis(600));
        buttons[i].setText("O");
        buttons[i].setDisable(true);
        isWinner = false;
        isGameFinished();


    }

    @FXML
    public void returnToWarView(){
        //TODO
        System.out.println("return button is clicked");
    }



    public static void main(String[] args) {
        launch(args);
    }
}

//public class LabelController
