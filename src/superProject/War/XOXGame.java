package superProject.War;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
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
import java.util.ArrayList;
import java.util.List;

public class XOXGame extends Application {
    // Player player1, Player Player2;
    int [] tiles = {0,0,0,0,0,0,0,0,0};
    private boolean isRun;
    private boolean isFinish;
    private int count;
    private boolean turnX = true;
    private boolean playable = true;
    private Tile[][] board = new Tile[3][3];
    private List<Combo> combos = new ArrayList<>();
    Pane root = new Pane();
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }

    private Parent createContent(){

        root.setPrefSize(600,600);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Tile tile = new Tile();
                tile.setTranslateX(j*200);
                tile.setTranslateY(i*200);
                root.getChildren().add(tile);
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

        return root;
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

        root.getChildren().add(line);
        Timeline timeline = new Timeline();
        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5),
                new KeyValue(line.endXProperty(), combo.tiles[2].getCenterX()),
                new KeyValue(line.endYProperty(), combo.tiles[2].getCenterY())));
        timeline.play();
    }

    private class Combo{
        private Tile[] tiles;
        public Combo(Tile... tiles){
            this.tiles = tiles;
        }
        public boolean isComplete(){
            if(tiles[0].getValue().isEmpty())
                return false;

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
            text.setText("0");
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
            while(board[x][y].getValue().equals("X") || board[x][y].getValue().equals("0")){
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

    public static void main(String[] args) {
        launch(args);
    }
}
