package superProject.War;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class XOXGame implements Initializable {
    // Player player1, Player Player2;
    int[] tiles = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    private boolean isRun;
    private boolean isFinish;
    private int count;
    private boolean turnX = true;
    private boolean playable = true;
    private Tile[][] board = new Tile[3][3];
    private List<Combo> combos = new ArrayList<>();
    Parent root;

    {
        try {
            root = FXMLLoader.load(getClass().getResource("../War/XOXViewFX.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isWinner;
    @FXML
    private Label resultLabel;
    @FXML
    private Button returnButton;
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

    /*
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    } */

    public XOXGame(){
    }

    @Override
    public void initialize(URL location, ResourceBundle resources){

    }

    public void createContent(){

        Button[][] buttons;
        buttons = new Button[3][3];
        buttons[0][0] = button00;
        buttons[0][1] = button01;
        buttons[0][2] = button02;
        buttons[1][0] = button10;
        buttons[1][1] = button11;
        buttons[1][2] = button12;
        buttons[2][0] = button20;
        buttons[2][1] = button21;
        buttons[2][2] = button22;


        //root.setPrefSize(600,600);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Tile tile = new Tile();
                tile.setTranslateX(buttons[i][j].getX());
                tile.setTranslateY(buttons[i][j].getY());
                //root.getChildren().add(tile);
                board[j][i] = tile;
            }
        }
        // horizontal
        for(int y = 0; y < 3; y++){
            combos.add(new Combo(board[0][y],board[1][y], board[2][y]));
        }
        // vertical
        for(int x = 0; x < 3; x++){
            combos.add(new Combo(board[x][0],board[x][1],board[x][2]));
        }
        // diagonals
        combos.add(new Combo(board[0][0], board[1][1], board[2][2]));
        combos.add(new Combo(board[2][0], board[1][1], board[0][2]));

        //return root;
    }
    private void checkState(){
            for(Combo combo : combos){
                if(combo.isComplete()){
                    playable = false;
                    playWinAnimation(combo);
                    break;
                }
            }
    }
    private void playWinAnimation(Combo combo){
        Line line = new Line();
        line.setStartX(combo.tiles[0].getCenterX());
        line.setStartY(combo.tiles[0].getCenterY());
        line.setEndX(combo.tiles[0].getCenterX());
        line.setEndY(combo.tiles[0].getCenterY());

        //root.getChildren().add(line);
        Timeline timeline = new Timeline();
        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5),
                new KeyValue(line.endXProperty(), combo.tiles[2].getCenterX()),
                new KeyValue(line.endYProperty(), combo.tiles[2].getCenterY())));
        timeline.play();

        if(combo.tiles[0].equals("X"))
            isWinner = true;

        if( isWinner )
        {
            resultLabel.setText("YOU WON");
        } else
            resultLabel.setText("YOU LOST");
        resultLabel.setVisible(true);
        returnButton.setEnabled(true);
    }

    private class Combo{
        private Tile[] tiles;
        public Combo(Tile... tiles){
            this.tiles = tiles;
        }
        public boolean isComplete(){
            if(tiles[0].getValue().isEmpty())
                return false;

            if(tiles[0].getValue().equals("X"))
                isWinner = true;
            return tiles[0].getValue().equals(tiles[1].getValue()) && tiles[0].getValue().equals(tiles[2].getValue());
        }
    }



    private class Tile extends StackPane{
        private Text text = new Text();
        int tileNo;

        public Tile(){
            Rectangle border = new Rectangle(200,200);
            border.setFill(null);
            border.setStroke(Color.BLACK);
            text.setFont(Font.font(72));
            setAlignment(Pos.CENTER);
            getChildren().addAll(border, text);


            setOnMouseClicked(event -> {
                //if(!playable){
                    //return;
                //}
                if(event.getButton() == MouseButton.PRIMARY){
                    //int clickX = (int)(event.getX()) / 200;
                    //int clickY = (int)(event.getY()) / 200;
                    // tileNo = clickY * 3 + clickX;

                    if(!turnX || tiles[tileNo] == 1)
                        return;
                    else {
                        drawX();
                        //tiles[tileNo] = 1;
                        turnX = false;
                        checkState();
                        randomTile();
                    }
                }
            });
        }


        public String getValue(){
            return text.getText();
        }
        private void drawX(){
            text.setText("X");
        }
        private void drawY(){
            text.setText("O");
        }
        public double getCenterX(){
            return getTranslateX() + 100;
        }
        public double getCenterY() {
            return getTranslateY() + 100;
        }

        public void randomTile(){
            int x = (int)(Math.random() * 3);
            int y = (int)(Math.random() * 3);
            while(board[x][y].getValue().equals("X") || board[x][y].getValue().equals("O")){
                x = (int)(Math.random() * 3);
                y = (int)(Math.random() * 3);
            }
            System.out.println(x);
            System.out.println(y);
            board[x][y].drawY();
            turnX = true;
            checkState();
        }
    }


    public boolean playXOX(){
        return true;
    }


    public void returnWarView (ActionEvent event){
        Stage stage;
        Parent root;


        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../War/WarViewFX.fxml"));
            root = loader.load();
            stage = new Stage();
            stage.setScene(new Scene(root));
            //stage.show();
            //stage = (Stage) returnButton.getScene().getWindow();
            //root=FXMLLoader.load(getClass().getResource("../War/WarViewFX.fxml"));

            //Scene scene = new Scene(root);
            //stage.setScene(scene);
            stage.show();

        } catch (Exception e){

        }
    }

    /*
    public static void main(String[] args) {
        launch(args);
    } */
}
