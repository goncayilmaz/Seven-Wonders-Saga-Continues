package superProject.GameMain;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;
import javafx.util.Duration;
import superProject.City.City;
import superProject.City.CityManager;
import superProject.GameProperties.Card;
import superProject.GameProperties.CardEngine;
import superProject.Player.Bot;
import superProject.Player.PlayerEngine;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
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
    private ImageView cityImageView;

    @FXML
    private ImageView botCity0, botCity1, botCity2, botCity3, botCity4, botCity5;

    private ImageView [] botCities;
    private ArrayList<City> citiesOfBots;

    private int noOfPlayers = 7;
    private Button [] pt_buttons;
    private Button [] aw_buttons;
    private Button [] dc_buttons;
    private ImageView[] cardsOnHandImageView;

    //for image paths
    private String preCard;
    private String preCity;

    private CardEngine cardEngine;
    private int round = 0;
    private PlayerEngine playerEngine; //this should be created and initialized with cities
    private CityManager cityManager; //bu da iletilmeli

    //TODO
    private int age = 1; //data flow for this and noOfPlayers

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        /// player number a göre yukarıdaki imageviewlar visible yada invisible olacak.
        // imagelerin önüne label koyup tooltip ile kartları liste haline getirio gösterebiliriz.

        preCard = "/Images/images/cards/";
        preCity = "/Images/images/wonders/";

        cardEngine = new CardEngine();
        playerEngine = new PlayerEngine(noOfPlayers);
        if( age == 1 )
            cardEngine.createFirstAgeCards(noOfPlayers);
        else if( age == 2)
            cardEngine.createSecondAgeCards(noOfPlayers);
        else
            cardEngine.createThirdAgeCards(noOfPlayers);

        pt_buttons = new Button[7];
        aw_buttons = new Button[7];
        dc_buttons = new Button[7];

        pt_buttons[0] = pt1;
        pt_buttons[1] = pt2;
        pt_buttons[2] = pt3;
        pt_buttons[3] = pt4;
        pt_buttons[4] = pt5;
        pt_buttons[5] = pt6;
        pt_buttons[6] = pt7;

        aw_buttons[0] = aw1;
        aw_buttons[1] = aw2;
        aw_buttons[2] = aw3;
        aw_buttons[3] = aw4;
        aw_buttons[4] = aw5;
        aw_buttons[5] = aw6;
        aw_buttons[6] = aw7;

        dc_buttons[0] = dc1;
        dc_buttons[1] = dc2;
        dc_buttons[2] = dc3;
        dc_buttons[3] = dc4;
        dc_buttons[4] = dc5;
        dc_buttons[5] = dc6;
        dc_buttons[6] = dc7;

        botCities = new ImageView[6];

        botCities[0] = botCity0;
        botCities[1] = botCity1;
        botCities[2] = botCity2;
        botCities[3] = botCity3;
        botCities[4] = botCity4;
        botCities[5] = botCity5;

        String cardName=cardEngine.getFirstAgeCards().get(0).getPhotoName();

        //tooltip mantığını çöz ne icin kullanılıyor
        String deneme = cardEngine.getFirstAgeCards().toString();

        ImageView imageFor = new ImageView();
        Image imageForTip = new Image(getClass().getResourceAsStream(preCard+cardName));
        imageFor.setImage(imageForTip);

        Tooltip tooltip = new Tooltip();
        tooltip.setMaxWidth(250);
        tooltip.setWrapText(true);

        //tooltip.setGraphic(imageFor);
        tooltip.setText(deneme);

        ageNumberLabel.setTooltip(tooltip);
        cards1.setTooltip(tooltip);
        cards2.setTooltip(tooltip);
        cards3.setTooltip(tooltip);
        cards4.setTooltip(tooltip);
        cards5.setTooltip(tooltip);
        cards6.setTooltip(tooltip);
        pt1.setTooltip(tooltip);

        cardsOnHandImageView = new ImageView[7];
        cardsOnHandImageView[0] = firstCard;
        cardsOnHandImageView[1] = secondCard;
        cardsOnHandImageView[2] = thirdCard;
        cardsOnHandImageView[3] = forthCard;
        cardsOnHandImageView[4] = fifthCard;
        cardsOnHandImageView[5] = sixthCard;
        cardsOnHandImageView[6] = seventhCard;

        for( int j = 0; j < noOfPlayers - 1; j++){
            for( int i = 0; i < 7; i++){ //always starts with same number of cards
                if( j == 0)
                {
                    playerEngine.getHumanPlayer().addToHandAtFirst(cardEngine.getFirstAgeCards().get(i));
                    Image imCard = new Image( preCard + cardEngine.getFirstAgeCards().get(i).getPhotoName());
                    cardsOnHandImageView[i].setImage(imCard);
                    pt_buttons[i].setVisible(true);
                    aw_buttons[i].setVisible(true);
                    dc_buttons[i].setVisible(true);
                }
                else //add card to bots
                    playerEngine.getBots().get(j-1).addToHandAtFirst(cardEngine.getFirstAgeCards().get(i + j));
            }
        }

        //TODO it can be changed this is just for testing now, CityManager should be forwarded
        boolean boardType = false;
        cityManager = new CityManager(false);
        cityManager.createBCities();
        City chosen = cityManager.arrangeCities(noOfPlayers, "The Colossus of Rhodes", boardType);
        playerEngine.getHumanPlayer().setCity(chosen);
        Image imCity = new Image(preCity + playerEngine.getHumanPlayer().getCity().getPhotoName());
        cityImageView.setImage(imCity);

        //disabling cities
        for( int i = noOfPlayers; i < 6; i++){
            botCities[i].setVisible(false);
        }

        //City images for bots
        if(boardType) {
            citiesOfBots = cityManager.getCitiesA();
            for(int i = 0; i < citiesOfBots.size(); i++)
            {
                if( citiesOfBots.get(i).getBoardName().equals(playerEngine.getHumanPlayer().getCity().getBoardName()))
                    citiesOfBots.remove(i);
            }
        }
        else{
            citiesOfBots = cityManager.getCitiesB();
            for(int i = 0; i < citiesOfBots.size(); i++)
            {
                if( citiesOfBots.get(i).getBoardName().equals(playerEngine.getHumanPlayer().getCity().getBoardName()))
                    citiesOfBots.remove(i);
            }
        }

        for(int i = 0; i < citiesOfBots.size(); i++){
            Image city_img = new Image(preCity + citiesOfBots.get(i).getPhotoName());
            botCities[i].setImage(city_img);
        }

    }

    void discardCard(int cardIndex) throws Exception{
        try {
            Stage stage;

            stage = (Stage) dc_buttons[cardIndex].getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(20 + (6 - cardIndex ) * 20);
            translate.setByY(-250);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(cardsOnHandImageView[cardIndex]);


            translate.play();
            cardsOnHandImageView[cardIndex].setFitHeight(90);
            cardsOnHandImageView[cardIndex].setFitWidth(90);


            Scene scene = new Scene(dc_buttons[cardIndex].getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();
        } catch (Exception e) {
            pt_buttons[cardIndex].setVisible(false);
            aw_buttons[cardIndex].setVisible(false);
            dc_buttons[cardIndex].setVisible(false);
            //add 3 coin to the human player
            playerEngine.getHumanPlayer().setCoin(playerEngine.getHumanPlayer().getCoin() + 3);
            Card chosenCard = playerEngine.getHumanPlayer().getCards().get(cardIndex);
            chosenCard.setUsed(true);
            playerEngine.getHumanPlayer().removeFromHand(chosenCard);
            for(int i = 0; i < noOfPlayers - 1; i++){
                Bot b = playerEngine.getBots().get(i);
                //TODO play for bot
            }
            round++;
            cardChangeRotate();
            //TODO new distribution of cards on hand
        }
    }

    public void addWonder(int cardIndex) throws Exception{
        try {
            Stage stage;

            stage = (Stage) aw_buttons[cardIndex].getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(-150 - (cardIndex * 90));
            translate.setByY(-150);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(cardsOnHandImageView[cardIndex]);


            translate.play();
            cardsOnHandImageView[cardIndex].setFitHeight(90);
            cardsOnHandImageView[cardIndex].setFitWidth(90);


            Scene scene = new Scene(aw_buttons[cardIndex].getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();

        }catch (Exception e){


            pt_buttons[cardIndex].setVisible(false);
            aw_buttons[cardIndex].setVisible(false);
            dc_buttons[cardIndex].setVisible(false);
            Card chosenCard = playerEngine.getHumanPlayer().getCards().get(cardIndex);
            chosenCard.setUsed(true);
            playerEngine.getHumanPlayer().removeFromHand(chosenCard);
            //TODO city manager adds the wonder to the associated city
            for(int i = 0; i < noOfPlayers - 1; i++){
                Bot b = playerEngine.getBots().get(i);
                //TODO play for bot
            }
            round++;
            cardChangeRotate();
            //TODO new distribution of cards to players
        }
    }

    public void putOnTable(int cardIndex) throws Exception{
        try {
            Stage stage;

            stage = (Stage) pt_buttons[cardIndex].getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(-150);
            translate.setByY(-150);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            translate.setNode(cardsOnHandImageView[cardIndex]);

            translate.play();
            cardsOnHandImageView[cardIndex].setFitHeight(90);
            cardsOnHandImageView[cardIndex].setFitWidth(90);

            Scene scene = new Scene(pt_buttons[cardIndex].getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();
        }
        catch (Exception e){
            String message = playerEngine.getHumanPlayer().addCardsToTable(playerEngine.getHumanPlayer().getCards().get(cardIndex));
            //if card was added to table
            if( message.equals(""))
            {
                pt_buttons[cardIndex].setVisible(false);
                aw_buttons[cardIndex].setVisible(false);
                dc_buttons[cardIndex].setVisible(false);
                Card chosenCard = playerEngine.getHumanPlayer().getCards().get(cardIndex);
                chosenCard.setUsed(true);
                playerEngine.getHumanPlayer().removeFromHand(chosenCard);
                for(int i = 0; i < noOfPlayers - 1; i++){
                    Bot b = playerEngine.getBots().get(i);
                    //TODO play for bot
                }
                round++;
                cardChangeRotate();
                //TODO new distribution of cards
            }
            else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Card cannot be added.");
                alert.setHeaderText("Please choose another card or choose another operation.");
                alert.setContentText(message);
            }
        }
    }



    @FXML
    void discardCard7() throws Exception{
        discardCard(6);
    }

    @FXML
    void addWonder7() throws Exception{
        addWonder(6);
    }

    @FXML
    void putOnTable7() throws Exception {
        putOnTable(6);
    }

    @FXML
    void discardCard6() throws Exception{
        discardCard(5);
    }



    @FXML
    void addWonder6() throws Exception{
        addWonder(5);
    }

    @FXML
    void putOnTable6() throws Exception {
        putOnTable(5);
    }


    @FXML
    void discardCard5() throws Exception{
        discardCard(4);
    }



    @FXML
    void addWonder5() throws Exception{
        addWonder(4);
    }

    @FXML
    void putOnTable5() throws Exception {
        putOnTable(4);
    }

    @FXML
    void discardCard4() throws Exception{
        discardCard(3);
    }


    @FXML
    void addWonder4() throws Exception{
        addWonder(3);
    }

    @FXML
    void putOnTable4() throws Exception {
        putOnTable(3);
    }

    @FXML
    void discardCard3() throws Exception{
        discardCard(2);
    }

    @FXML
    void addWonder3() throws Exception{
        addWonder(2);
    }

    @FXML
    void putOnTable3() throws Exception {
        putOnTable(2);
    }

    @FXML
    void discardCard2() throws Exception{
        discardCard(1);
    }

    @FXML
    void addWonder2() throws Exception{
        addWonder(1);
    }

    @FXML
    void putOnTable2() throws Exception {
        putOnTable(1);
    }


    @FXML
    void discardCard1() throws Exception{
        discardCard(0);
    }



    @FXML
    void addWonder1() throws Exception{
        addWonder(0);
    }

    @FXML
    void putOnTable1() throws Exception {
        putOnTable(0);
    }



    public void cardChangeRotate(){
        boolean [] cards = new boolean[7];
        ArrayList<ImageView> imageList = new ArrayList<>();

        //cardEngine.getFirstAgeCards();

        for(int i = 0; i < 7; i++){
            cards[i] = false;
            if(pt_buttons[i].isVisible())
            {
                cards[i] = true;
                imageList.add(cardsOnHandImageView[i]);
            }
        }

        for(int i=0; i < imageList.size() ;i++){
            String preCard= "/Images/images/cards/";
            String cardName = cardEngine.getFirstAgeCards().get(i).getPhotoName();
            Image image = new Image(getClass().getResourceAsStream(preCard+cardName));
            imageList.get(i).setImage(image);
        }
    }
}
