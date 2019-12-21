package superProject.GameMain;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;
import superProject.GameProperties.CardEngine;

import java.net.URL;
import java.util.ResourceBundle;

public class GameAreaView implements Initializable {

    @FXML
    private GridPane firstGridPane;

    @FXML
    private Button pt1;

    @FXML
    private Button aw1;

    @FXML
    private Button dc1;


    @FXML
    private ImageView fifthCard;

    @FXML
    private ImageView seventhCard;

    @FXML
    private ImageView thirdCard;

    @FXML
    private ImageView firstCard;

    @FXML
    private ImageView forthCard;

    @FXML
    private ImageView sixthCard;

    @FXML
    private ImageView secondCard;


    @FXML
    void discardCard1(ActionEvent event) throws Exception{
        try {


            Stage stage;

            stage = (Stage) dc1.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(700);
            translate.setByY(-250);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(firstCard);


            translate.play();
            firstCard.setFitHeight(90);
            firstCard.setFitWidth(90);



            Scene scene = new Scene(dc1.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();

        }catch (Exception e){

            pt1.setVisible(false);
            aw1.setVisible(false);
            dc1.setVisible(false);



        }
    }

    

    @FXML
    void addWonder1(ActionEvent event) throws Exception{
        try {


            Stage stage;

            stage = (Stage) aw1.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(-100);
            translate.setByY(-150);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(firstCard);


            translate.play();
            firstCard.setFitHeight(90);
            firstCard.setFitWidth(90);



            Scene scene = new Scene(aw1.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();

        }catch (Exception e){

            pt1.setVisible(false);
            aw1.setVisible(false);
            dc1.setVisible(false);



        }
    }

    @FXML
    void putOnTable1(ActionEvent event) throws Exception {

        try {


            Stage stage;

            stage = (Stage) pt1.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(150);
            translate.setByY(-150);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(firstCard);

            //playing the transition
            translate.play();
            firstCard.setFitHeight(90);
            firstCard.setFitWidth(90);


            //Configuring Group and Scene
            //  root= FXMLLoader.load(getClass().getResource("../GameMain/GameAreaViewFX.fxml"));
            //  root.getChildren().addAll(firstCard);
            Scene scene = new Scene(pt1.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();
        }
        catch (Exception e){
            pt1.setVisible(false);
            aw1.setVisible(false);
            dc1.setVisible(false);


        }

 /*
        try {


            Stage stage;
            // Parent root;

            Pane root = new Pane();

            stage = (Stage) pt1.getScene().getWindow();
            Path path = new Path();
            path.getElements().add(new MoveTo(248, 532));
            path.getElements().add(new CubicCurveTo(248, 532, 500, 700, 350, 400));

            PathTransition ptr = new PathTransition();

            ptr.setDuration(Duration.seconds(6));
            ptr.setDelay(Duration.seconds(2));
            ptr.setPath(path);
            ptr.setNode(firstCard);
          //  ptr.setCycleCount(2);
            //ptr.setAutoReverse(true);
            ptr.play();

            root= FXMLLoader.load(getClass().getResource("../GameMain/GameAreaViewFX.fxml"));
            root.getChildren().addAll(path,firstCard);
           // root.getChildren().addAll(path, circle);

            Scene scene = new Scene(root, 1080, 720);


            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }

             */

    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {


        CardEngine cardEngine = new CardEngine();
        cardEngine.createFirstAgeCards(7);

        String preCard= "/Images/images/cards/";
        String cardName=cardEngine.getFirstAgeCards().get(0).getPhotoName();

        Image image = new Image(getClass().getResourceAsStream(preCard+cardName));
        firstCard.setImage(image);


        String cardName1=cardEngine.getFirstAgeCards().get(1).getPhotoName();
        Image image1 = new Image(getClass().getResourceAsStream(preCard+cardName1));
        secondCard.setImage(image1);


        String cardName2=cardEngine.getFirstAgeCards().get(2).getPhotoName();
        Image image2 = new Image(getClass().getResourceAsStream(preCard+cardName2));
        thirdCard.setImage(image2);


        String cardName3=cardEngine.getFirstAgeCards().get(3).getPhotoName();
        Image image3 = new Image(getClass().getResourceAsStream(preCard+cardName3));
        forthCard.setImage(image3);


        String cardName4=cardEngine.getFirstAgeCards().get(4).getPhotoName();
        Image image4 = new Image(getClass().getResourceAsStream(preCard+cardName4));
        fifthCard.setImage(image4);


        //fifthCard.setTranslateX(250);
        //fifthCard.setTranslateY(123);


        String cardName5=cardEngine.getFirstAgeCards().get(5).getPhotoName();
        Image image5 = new Image(getClass().getResourceAsStream(preCard+cardName5));
        sixthCard.setImage(image5);


        String cardName6=cardEngine.getFirstAgeCards().get(6).getPhotoName();
        Image image6 = new Image(getClass().getResourceAsStream(preCard+cardName6));
        seventhCard.setImage(image6);




    }
}
