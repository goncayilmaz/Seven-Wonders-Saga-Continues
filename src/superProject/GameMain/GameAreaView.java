package superProject.GameMain;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;
import javafx.util.Duration;
import superProject.GameProperties.CardEngine;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class GameAreaView implements Initializable {

    @FXML
    private GridPane firstGridPane;

    @FXML
    private GridPane secondGridPane;

    @FXML
    private Button pt1,aw1,dc1,pt2,aw2,dc2,pt3,aw3,dc3,pt4,aw4,dc4,pt5,aw5,dc5,pt6,aw6,dc6,pt7,aw7,dc7;


    @FXML
    private ImageView firstCard,secondCard,thirdCard,forthCard,fifthCard,sixthCard,seventhCard;

    @FXML
    private Label ageNumberLabel;

    @FXML
    private Label cards1,cards2,cards3,cards4,cards5,cards6;


    @FXML
    void discardCard7(ActionEvent event) throws Exception{
        try {


            Stage stage;

            stage = (Stage) dc7.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(20);
            translate.setByY(-250);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(seventhCard);


            translate.play();
            seventhCard.setFitHeight(90);
            seventhCard.setFitWidth(90);


            Scene scene = new Scene(dc7.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();

        }catch (Exception e){

            pt7.setVisible(false);
            aw7.setVisible(false);
            dc7.setVisible(false);
            cardChangeRotate();



        }
    }



    @FXML
    void addWonder7(ActionEvent event) throws Exception{
        try {


            Stage stage;

            stage = (Stage) aw7.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(-850);
            translate.setByY(-150);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(seventhCard);


            translate.play();
            seventhCard.setFitHeight(90);
            seventhCard.setFitWidth(90);





            Scene scene = new Scene(aw7.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();

        }catch (Exception e){

            pt7.setVisible(false);
            aw7.setVisible(false);
            dc7.setVisible(false);
            cardChangeRotate();



        }
    }

    @FXML
    void putOnTable7(ActionEvent event) throws Exception {
        try {
            Stage stage;

            stage = (Stage) pt7.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(-150);
            translate.setByY(-150);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(seventhCard);


            translate.play();
            seventhCard.setFitHeight(90);
            seventhCard.setFitWidth(90);




            Scene scene = new Scene(pt7.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();
        }
        catch (Exception e){
            pt7.setVisible(false);
            aw7.setVisible(false);
            dc7.setVisible(false);
            cardChangeRotate();


        }



    }
    @FXML
    void discardCard6(ActionEvent event) throws Exception{
        try {


            Stage stage;

            stage = (Stage) dc6.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(100);
            translate.setByY(-250);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(sixthCard);


            translate.play();
            sixthCard.setFitHeight(90);
            sixthCard.setFitWidth(90);




            Scene scene = new Scene(dc6.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();

        }catch (Exception e){

            pt6.setVisible(false);
            aw6.setVisible(false);
            dc6.setVisible(false);
            cardChangeRotate();


        }
    }



    @FXML
    void addWonder6(ActionEvent event) throws Exception{
        try {


            Stage stage;

            stage = (Stage) aw6.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(-750);
            translate.setByY(-150);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(sixthCard);


            translate.play();
            sixthCard.setFitHeight(90);
            sixthCard.setFitWidth(90);




            Scene scene = new Scene(aw6.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();

        }catch (Exception e){

            pt6.setVisible(false);
            aw6.setVisible(false);
            dc6.setVisible(false);
            cardChangeRotate();


        }
    }

    @FXML
    void putOnTable6(ActionEvent event) throws Exception {
        try {
            Stage stage;

            stage = (Stage) pt6.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(-120);
            translate.setByY(-150);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(sixthCard);


            translate.play();
            sixthCard.setFitHeight(90);
            sixthCard.setFitWidth(90);





            Scene scene = new Scene(pt6.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();
        }
        catch (Exception e){
            pt6.setVisible(false);
            aw6.setVisible(false);
            dc6.setVisible(false);
            cardChangeRotate();


        }



    }


    @FXML
    void discardCard5(ActionEvent event) throws Exception{
        try {


            Stage stage;

            stage = (Stage) dc5.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(250);
            translate.setByY(-250);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(fifthCard);


            translate.play();
            fifthCard.setFitHeight(90);
            fifthCard.setFitWidth(90);





            Scene scene = new Scene(dc5.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();

        }catch (Exception e){

            pt5.setVisible(false);
            aw5.setVisible(false);
            dc5.setVisible(false);
            cardChangeRotate();


        }
    }



    @FXML
    void addWonder5(ActionEvent event) throws Exception{
        try {


            Stage stage;

            stage = (Stage) aw5.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(-630);
            translate.setByY(-150);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(fifthCard);


            translate.play();
            fifthCard.setFitHeight(90);
            fifthCard.setFitWidth(90);




            Scene scene = new Scene(aw5.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();

        }catch (Exception e){

            pt5.setVisible(false);
            aw5.setVisible(false);
            dc5.setVisible(false);
            cardChangeRotate();


        }
    }

    @FXML
    void putOnTable5(ActionEvent event) throws Exception {
        try {
            Stage stage;

            stage = (Stage) pt5.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(-80);
            translate.setByY(-150);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(fifthCard);


            translate.play();
            fifthCard.setFitHeight(90);
            fifthCard.setFitWidth(90);





            Scene scene = new Scene(pt5.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();
        }
        catch (Exception e){
            pt5.setVisible(false);
            aw5.setVisible(false);
            dc5.setVisible(false);
            cardChangeRotate();


        }



    }

    @FXML
    void discardCard4(ActionEvent event) throws Exception{
        try {


            Stage stage;

            stage = (Stage) dc4.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(320);
            translate.setByY(-250);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(forthCard);


            translate.play();
            forthCard.setFitHeight(90);
            forthCard.setFitWidth(90);





            Scene scene = new Scene(dc4.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();

        }catch (Exception e){

            pt4.setVisible(false);
            aw4.setVisible(false);
            dc4.setVisible(false);
            cardChangeRotate();

        }
    }



    @FXML
    void addWonder4(ActionEvent event) throws Exception{
        try {


            Stage stage;

            stage = (Stage) aw4.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(-450);
            translate.setByY(-150);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(forthCard);


            translate.play();
            forthCard.setFitHeight(90);
            forthCard.setFitWidth(90);





            Scene scene = new Scene(aw4.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();

        }catch (Exception e){

            pt4.setVisible(false);
            aw4.setVisible(false);
            dc4.setVisible(false);
            cardChangeRotate();


        }
    }

    @FXML
    void putOnTable4(ActionEvent event) throws Exception {
        try {
            Stage stage;

            stage = (Stage) pt4.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(-30);
            translate.setByY(-150);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(forthCard);


            translate.play();
            forthCard.setFitHeight(90);
            forthCard.setFitWidth(90);





            Scene scene = new Scene(pt4.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();
        }
        catch (Exception e){
            pt4.setVisible(false);
            aw4.setVisible(false);
            dc4.setVisible(false);
            cardChangeRotate();

        }



    }

    @FXML
    void discardCard3(ActionEvent event) throws Exception{
        try {


            Stage stage;

            stage = (Stage) dc3.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(450);
            translate.setByY(-250);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(thirdCard);


            translate.play();
            thirdCard.setFitHeight(90);
            thirdCard.setFitWidth(90);




            Scene scene = new Scene(dc3.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();

        }catch (Exception e){

            pt3.setVisible(false);
            aw3.setVisible(false);
            dc3.setVisible(false);
            cardChangeRotate();


        }
    }



    @FXML
    void addWonder3(ActionEvent event) throws Exception{
        try {


            Stage stage;

            stage = (Stage) aw3.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(-400);
            translate.setByY(-150);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(thirdCard);


            translate.play();
            thirdCard.setFitHeight(90);
            thirdCard.setFitWidth(90);





            Scene scene = new Scene(aw3.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();

        }catch (Exception e){

            pt3.setVisible(false);
            aw3.setVisible(false);
            dc3.setVisible(false);
            cardChangeRotate();


        }
    }

    @FXML
    void putOnTable3(ActionEvent event) throws Exception {
        try {
            Stage stage;

            stage = (Stage) pt3.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(25);
            translate.setByY(-150);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(thirdCard);


            translate.play();
            thirdCard.setFitHeight(90);
            thirdCard.setFitWidth(90);





            Scene scene = new Scene(pt3.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();
        }
        catch (Exception e){
            pt3.setVisible(false);
            aw3.setVisible(false);
            dc3.setVisible(false);
            cardChangeRotate();

        }



    }

    @FXML
    void discardCard2(ActionEvent event) throws Exception{
        try {


            Stage stage;

            stage = (Stage) dc2.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(500);
            translate.setByY(-250);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(secondCard);


            translate.play();
            secondCard.setFitHeight(90);
            secondCard.setFitWidth(90);




            Scene scene = new Scene(dc1.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();

        }catch (Exception e){

            pt2.setVisible(false);
            aw2.setVisible(false);
            dc2.setVisible(false);
            cardChangeRotate();


        }
    }



    @FXML
    void addWonder2(ActionEvent event) throws Exception{
        try {


            Stage stage;

            stage = (Stage) aw2.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(-200);
            translate.setByY(-150);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(secondCard);


            translate.play();
            secondCard.setFitHeight(90);
            secondCard.setFitWidth(90);




            Scene scene = new Scene(aw2.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();

        }catch (Exception e){

            pt2.setVisible(false);
            aw2.setVisible(false);
            dc2.setVisible(false);
            cardChangeRotate();



        }
    }

    @FXML
    void putOnTable2(ActionEvent event) throws Exception {
        try {
            Stage stage;

            stage = (Stage) pt2.getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(80);
            translate.setByY(-150);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(secondCard);


            translate.play();
            secondCard.setFitHeight(90);
            secondCard.setFitWidth(90);




            Scene scene = new Scene(pt2.getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();
        }
        catch (Exception e){
            pt2.setVisible(false);
            aw2.setVisible(false);
            dc2.setVisible(false);
            cardChangeRotate();

        }



    }


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
            cardChangeRotate();



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
            cardChangeRotate();



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
            cardChangeRotate();


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

    

    public void cardChangeRotate(){
        boolean card1 = false;
        boolean card2 = false;
        boolean card3 = false;
        boolean card4 = false;
        boolean card5 = false;
        boolean card6 = false;
        boolean card7 = false;


        ArrayList<ImageView> imageList = new ArrayList<>();

        CardEngine cardEngine = new CardEngine();
        cardEngine.createFirstAgeCards(7);

        if(pt1.isVisible()){
            card1=true;
            imageList.add(firstCard);


        }
        if(pt2.isVisible()){
            card2=true;
            imageList.add(secondCard);


        }
        if(pt3.isVisible()){
            card3=true;
            imageList.add(thirdCard);
        }
        if(pt4.isVisible()){
            card4=true;
            imageList.add(forthCard);
        }if(pt5.isVisible()){
            card5=true;
            imageList.add(fifthCard);
        }if(pt6.isVisible()){
            card6=true;
            imageList.add(sixthCard);
        }
        if(pt7.isVisible()){
            card7=true;
            imageList.add(seventhCard);
        }

        for(int i=0;i<imageList.size();i++){
            System.out.println("kac tane kart var" +imageList.size());
            String preCard= "/Images/images/cards/";
            String cardName=cardEngine.getFirstAgeCards().get(i).getPhotoName();
            Image image = new Image(getClass().getResourceAsStream(preCard+cardName));
            imageList.get(i).setImage(image);
        }




    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        /// player number a göre yukarıdaki imageviewlar visible yada invisible olacak.
        // imagelerin önüne label koyup tooltip ile kartları liste haline getirio gösterebiliriz.


        CardEngine cardEngine = new CardEngine();
        cardEngine.createFirstAgeCards(7);

        String preCard= "/Images/images/cards/";
        String cardName=cardEngine.getFirstAgeCards().get(0).getPhotoName();

        // kartın üstüne gelince view açacak kısım.
        // karşı tarafın kartlarının rengini ve ne getirdikleirini print edecek sadece.
        String deneme = cardEngine.getFirstAgeCards().toString();

        ImageView imageFor = new ImageView();
        Image imageForTip = new Image(getClass().getResourceAsStream(preCard+cardName));
        imageFor.setImage(imageForTip);
        Tooltip tooltip = new Tooltip();
        tooltip.setMaxWidth(250);
        tooltip.setWrapText(true);

      //  tooltip.setGraphic(imageFor);
        tooltip.setText(deneme);

        ageNumberLabel.setTooltip(tooltip);
        cards1.setTooltip(tooltip);
        cards2.setTooltip(tooltip);
        cards3.setTooltip(tooltip);
        cards4.setTooltip(tooltip);
        cards5.setTooltip(tooltip);
        cards6.setTooltip(tooltip);
        pt1.setTooltip(tooltip);


        cardName=cardEngine.getFirstAgeCards().get(0).getPhotoName();
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



        String cardName5=cardEngine.getFirstAgeCards().get(5).getPhotoName();
        Image image5 = new Image(getClass().getResourceAsStream(preCard+cardName5));
        sixthCard.setImage(image5);


        String cardName6=cardEngine.getFirstAgeCards().get(6).getPhotoName();
        Image image6 = new Image(getClass().getResourceAsStream(preCard+cardName6));
        seventhCard.setImage(image6);




    }
}
