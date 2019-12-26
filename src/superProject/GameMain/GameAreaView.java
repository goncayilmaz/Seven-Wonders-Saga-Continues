package superProject.GameMain;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;
import javafx.util.Duration;
import superProject.City.City;
import superProject.City.CityManager;
import superProject.GameProperties.Card;
import superProject.GameProperties.CardEngine;
import superProject.Player.Bot;
import superProject.Player.PlayerEngine;
import superProject.War.WarWiew;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

public class GameAreaView implements Initializable {

    @FXML
    AnchorPane mainAnchor;

    @FXML
    private Button pt1,aw1,dc1,pt2,aw2,dc2,pt3,aw3,dc3,pt4,aw4,dc4,pt5,aw5,dc5,pt6,aw6,dc6,pt7,aw7,dc7;


    @FXML
    private ImageView firstCard,secondCard,thirdCard,forthCard,fifthCard,sixthCard,seventhCard;

    @FXML
    private ImageView cardImage11,cardImage12,cardImage21,cardImage22,cardImage31,
            cardImage32,cardImage41,cardImage42,cardImage51,cardImage52,cardImage61,cardImage62;

    @FXML
    private Label ageNumberLabel,coinLabel,warLabel,scoreLabel,cityNameLabel,cardInfo;

    @FXML
    private Label cards1,cards2,cards3,cards4,cards5,cards6;

    @FXML
    private ImageView cityImageView;

    @FXML
    private ImageView botCity0, botCity1, botCity2, botCity3, botCity4, botCity5;

    @FXML
    private Button returnButton;

    private ImageView [] botCities;
    private ArrayList<City> citiesOfBots;

    private int noOfPlayers;
    private Button [] pt_buttons;
    private Button [] aw_buttons;
    private Button [] dc_buttons;
    private ImageView[] cardsOnHandImageView;
    // buna bir de kart listesi eklenmesi gerekiyor.
    private Label[] cardLabelLists;

    private ImageView[] showCardsForBotImageList;

    //to start war
    private boolean startWar;

    @FXML
    private Button startWarButton;

    //for image paths
    private String preCard;
    private String preCity;

    private CardEngine cardEngine;
    private int round = 0;

    private PlayerEngine playerEngine; //this should be created and initialized with cities

    private CityManager cityManager; //bu da iletilmeli

    //GameEngine attributes
    private boolean isAgeFinished;

    //TODO
    private int age = 1; //data flow for this and noOfPlayers


    public int getNumberPlayer() {
        return noOfPlayers;
    }

    public void setNumberPlayer(int numberPlayer) {
        this.noOfPlayers = numberPlayer;
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //playerEngine= new PlayerEngine(noOfPlayers);

        preCard = "/Images/images/cards/";
        preCity = "/Images/images/wonders/";

        pt_buttons = new Button[7];
        aw_buttons = new Button[7];
        dc_buttons = new Button[7];
        cardLabelLists= new Label[7];
        showCardsForBotImageList = new  ImageView[12];

        cardLabelLists[0]=cards1;
        cardLabelLists[1]=cards2;
        cardLabelLists[2]=cards3;
        cardLabelLists[3]=cards4;
        cardLabelLists[4]=cards5;
        cardLabelLists[5]=cards6;


        showCardsForBotImageList[0]=cardImage11;
        showCardsForBotImageList[1]=cardImage12;
        showCardsForBotImageList[2]=cardImage21;
        showCardsForBotImageList[3]=cardImage22;
        showCardsForBotImageList[4]=cardImage31;
        showCardsForBotImageList[5]=cardImage32;
        showCardsForBotImageList[6]=cardImage41;
        showCardsForBotImageList[7]=cardImage42;
        showCardsForBotImageList[8]=cardImage51;
        showCardsForBotImageList[9]=cardImage52;
        showCardsForBotImageList[10]=cardImage61;
        showCardsForBotImageList[11]=cardImage62;




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

        cardsOnHandImageView = new ImageView[7];
        cardsOnHandImageView[0] = firstCard;
        cardsOnHandImageView[1] = secondCard;
        cardsOnHandImageView[2] = thirdCard;
        cardsOnHandImageView[3] = forthCard;
        cardsOnHandImageView[4] = fifthCard;
        cardsOnHandImageView[5] = sixthCard;
        cardsOnHandImageView[6] = seventhCard;


        //GameEngine attributes
        isAgeFinished = false;

           /*


        Tooltip tooltip = new Tooltip();
        tooltip.setMaxWidth(250);
        tooltip.setWrapText(true);
        tooltip.setText(deneme);
        ageNumberLabel.setTooltip(tooltip);
        cards1.setTooltip(tooltip);
        cards2.setTooltip(tooltip);
        cards3.setTooltip(tooltip);
        cards4.setTooltip(tooltip);
        cards5.setTooltip(tooltip);
        cards6.setTooltip(tooltip);

        */




    }

    public PlayerEngine getPlayerEngine() {
        return playerEngine;
    }

    public void setPlayerEngine(PlayerEngine playerEngine) {
        this.playerEngine = playerEngine;
    }

    public CityManager getCityManager() {
        return cityManager;
    }

    public void setCityManager(CityManager cityManager) {
        this.cityManager = cityManager;
    }

    public void setCityImageView(ImageView cityImageView) {
        this.cityImageView.setImage(cityImageView.getImage());
    }

    public void setBotCityImages(Image[] imagesOfCity){
        for(int i = 0; i < noOfPlayers - 1; i++){
            botCities[i].setImage(imagesOfCity[i]);
        }
    }

    public void setCoinLabel(Label coinLabel) {
        this.coinLabel = coinLabel;
    }

    public Label getCoinLabel() {
        return coinLabel;
    }


    public Label getWarLabel() {
        return warLabel;
    }

    public void setWarLabel(Label warLabel) {
        this.warLabel = warLabel;
    }

    public Label getScoreLabel() {
        return scoreLabel;
    }

    public void setScoreLabel(Label scoreLabel) {
        this.scoreLabel = scoreLabel;
    }

    public Label getAgeNumberLabel() {
        return ageNumberLabel;
    }

    public void setAgeNumberLabel(Label ageNumberLabel) {
        this.ageNumberLabel = ageNumberLabel;
    }


    public Label getCityNameLabel() {
        return cityNameLabel;
    }

    public void setCityNameLabel(Label cityNameLabel) {
        this.cityNameLabel = cityNameLabel;
    }


    public ImageView[] getCardsOnHandImageView() {
        return cardsOnHandImageView;
    }

    public void setCardsOnHandImageView(ImageView[] cardsOnHandImageView) {
        this.cardsOnHandImageView = cardsOnHandImageView;
    }

    public void setInitialView(int age, int noOfPlayers) {
        this.age = age;
        this.noOfPlayers = noOfPlayers;
        cardEngine = new CardEngine();
        System.out.println("no of players before age cards creation " + noOfPlayers);
        System.out.println("round: " + round);
        ArrayList<Card> ageCards = new ArrayList<Card>();
        if (round == 0) {
            if (age == 1) {
                cardEngine.createFirstAgeCards(noOfPlayers);
                ageCards = cardEngine.getFirstAgeCards();
            } else if (age == 2) {
                cardEngine.createSecondAgeCards(noOfPlayers);
                ageCards = cardEngine.getSecondAgeCards();
            } else {
                cardEngine.createThirdAgeCards(noOfPlayers);
                ageCards = cardEngine.getThirdAgeCards();
            }

            //adding cards
            for (int j = 0; j < noOfPlayers; j++) {
                for (int i = 0; i < 7; i++) { //always starts with same number of cards
                    if (j == 0) {
                        playerEngine.getHumanPlayer().addToHandAtFirst(ageCards.get(i));
                        Image imCard = new Image(preCard + ageCards.get(i).getPhotoName());
                        cardsOnHandImageView[i].setImage(imCard);
                        pt_buttons[i].setVisible(true);
                        aw_buttons[i].setVisible(true);
                        dc_buttons[i].setVisible(true);
                        System.out.println("player cards " + playerEngine.getHumanPlayer().numberOfCardAtHand());
                    } else //add card to bots
                    {
                        playerEngine.getAllPlayers().get(j).setId(j);
                        playerEngine.getAllPlayers().get(j).addToHandAtFirst(ageCards.get(i + (j * 7)));
                        System.out.println("bot cards size on hand " + playerEngine.getBots().get(j - 1).numberOfCardAtHand());
                    }
                }
            }

        } else{
            for(int i = 0; i < 7 - round; i++){
                pt_buttons[i].setVisible(true);
                aw_buttons[i].setVisible(true);
                dc_buttons[i].setVisible(true);
                Image imCard = new Image(preCard + playerEngine.getHumanPlayer().getCards().get(i).getPhotoName());
                cardsOnHandImageView[i].setImage(imCard);
            }

            for(int i = 7 - round; i < 7; i++){
                pt_buttons[i].setVisible(false);
                aw_buttons[i].setVisible(false);
                dc_buttons[i].setVisible(false);
                cardsOnHandImageView[i].setVisible(false);
            }
        }

        ArrayList<Card> cardsOfPlayer = playerEngine.getHumanPlayer().getCardsOnTable();
        if( cardsOfPlayer != null && cardsOfPlayer.size() != 0){
            ImageView imageView = new ImageView();
            for(int i = 0; i < cardsOfPlayer.size(); i++){
                Image imCard = new Image(preCard + cardsOfPlayer.get(i).getPhotoName());
                imageView.setImage(imCard);
                imageView.setX(cardsOnHandImageView[i].getX() - (age) * 10);
                imageView.setY(cardsOnHandImageView[i].getY() - 150);
                //TODO efe bunu göstermeye bakabilir misiinn
            }
        }

        Image imCity = new Image(preCity + playerEngine.getHumanPlayer().getCity().getPhotoName());
        setCityImageView(new ImageView(imCity));
        getAgeNumberLabel().setText("Age is " + String.valueOf(age));
        getCityNameLabel().setText("City Name is " + playerEngine.getHumanPlayer().getCity().getBoardName());
    }

    public void disableCities(){
        //disabling cities
        for( int i = noOfPlayers - 1; i < 6; i++){
            botCities[i].setVisible(false);
            cardLabelLists[i].setVisible(false);
        }

        // citylerin önünde gözüken  kartların kısım.
        int count =1;
        for( int i = noOfPlayers-1  ; i < 6; i++){

            showCardsForBotImageList[12-count].setVisible(false);
            showCardsForBotImageList[11-count].setVisible(false);
            count+=2;
        }
    }

    void discardCard(int cardIndex) throws Exception{
        try {
            System.out.println("round : " + round);

            Stage stage;

            stage = (Stage) dc_buttons[cardIndex].getScene().getWindow();
            TranslateTransition translate = new TranslateTransition();
            translate.setByX(0);
            translate.setByY(-250);
            translate.setDuration(Duration.millis(1000));
            translate.setCycleCount(1);
            ImageView temp = cardsOnHandImageView[cardIndex];
            ImageView temp2 = cardsOnHandImageView[6-round];
            cardsOnHandImageView[6-round].setImage(temp.getImage());
            cardsOnHandImageView[6-round].setX(temp.getX());
            cardsOnHandImageView[6-round].setY(temp.getY());
            cardsOnHandImageView[cardIndex].setImage(temp2.getImage());
            cardsOnHandImageView[cardIndex].setX(temp2.getX());
            cardsOnHandImageView[cardIndex].setY(temp2.getY());
            translate.setNode(cardsOnHandImageView[6-round]);
            translate.play();
            cardsOnHandImageView[6-round].setFitHeight(90);
            cardsOnHandImageView[6-round].setFitWidth(90);

            Scene scene = new Scene(dc_buttons[cardIndex].getScene().getRoot(), 1080, 720);
            stage.setScene(scene);

            stage.show();
        } catch (Exception e) {
            pt_buttons[6-round].setVisible(false);
            aw_buttons[6-round].setVisible(false);
            dc_buttons[6-round].setVisible(false);
            //add 3 coin to the human player
            playerEngine.getHumanPlayer().setCoin(playerEngine.getHumanPlayer().getCoin() + 3);
            Card chosenCard = playerEngine.getHumanPlayer().getCards().get(cardIndex);
            chosenCard.setUsed(true);
            //playerEngine.getHumanPlayer().removeFromHand(chosenCard);
            int action;
            for(int i = 0; i < noOfPlayers - 1; i++){
                action = 0; //TODO 0 add wonder, 1 put on table, 2 discard
                Bot b = playerEngine.getBots().get(i);
                Card played = b.doAction(age, playerEngine.getAllPlayers());
                System.out.println("bot " + b.getId() + " plays, card size " + b.getCards().size());
                if( action == 0 ){

                } else  if( action == 1){

                } else {

                }
            }
            cardChangeRotate();
            round++;
            if (startWar) {
                goToWar();
                startWar = false;
            }
            isAgeFinished();
        }
    }

    public void addWonder(int cardIndex) throws Exception{
        int curLevel = playerEngine.getHumanPlayer().getCity().getBoardLevel();
        cityManager.changeCityStage(playerEngine.getHumanPlayer().getCity(), playerEngine.getHumanPlayer());
        if( curLevel < playerEngine.getHumanPlayer().getCity().getBoardLevel()) {
            try {
                Stage stage;

                stage = (Stage) aw_buttons[cardIndex].getScene().getWindow();
                TranslateTransition translate = new TranslateTransition();
                translate.setByX(-150 - (cardIndex * 90));
                translate.setByY(-150);
                translate.setDuration(Duration.millis(1000));
                translate.setCycleCount(1);
                ImageView temp = cardsOnHandImageView[cardIndex];
                ImageView temp2 = cardsOnHandImageView[6 - round];
                cardsOnHandImageView[6 - round].setImage(temp.getImage());
                cardsOnHandImageView[6 - round].setX(temp.getX());
                cardsOnHandImageView[6 - round].setY(temp.getY());
                cardsOnHandImageView[cardIndex].setImage(temp2.getImage());
                cardsOnHandImageView[cardIndex].setX(temp2.getX());
                cardsOnHandImageView[cardIndex].setY(temp2.getY());
                translate.setNode(cardsOnHandImageView[6 - round]);


                translate.play();
                cardsOnHandImageView[6 - round].setFitHeight(90);
                cardsOnHandImageView[6 - round].setFitWidth(90);


                Scene scene = new Scene(aw_buttons[cardIndex].getScene().getRoot(), 1080, 720);
                stage.setScene(scene);

                stage.show();

            } catch (Exception e) {
                pt_buttons[6 - round].setVisible(false);
                aw_buttons[6 - round].setVisible(false);
                dc_buttons[6 - round].setVisible(false);
                Card chosenCard = playerEngine.getHumanPlayer().getCards().get(cardIndex);
                chosenCard.setUsed(true);
                for(int i = 0; i < noOfPlayers - 1; i++){
                    Bot b = playerEngine.getBots().get(i);
                    b.doAction(age, playerEngine.getAllPlayers());
                    System.out.println("bot " + b.getId() + " plays, card size " + b.getCards().size());
                }
                cardChangeRotate();
                round++;
                if (startWar) {
                    goToWar();
                    startWar = false;
                }
                isAgeFinished();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Wonder cannot be built.");
            alert.setHeaderText("Please choose another operation.");
            alert.setContentText("Resources are not sufficient.");
            alert.showAndWait();
        }
    }


    public void toolTipForBots(){
        int number=playerEngine.getBots().size();
        String  cardsOnTable="";
        for(int i=0;i<number;i++){
            for(int j=0;j<playerEngine.getBots().get(i).getCardsOnTable().size();j++){
                cardsOnTable = cardsOnTable+ playerEngine.getBots().get(i).getCardsOnTable().get(j);
            }
            Tooltip tooltip1 = new Tooltip();
            tooltip1.setMaxWidth(250);
            tooltip1.setWrapText(true);
            tooltip1.setText(cardsOnTable);
            tooltip1.setGraphic(new ImageView(botCities[i].getImage()));
            cardLabelLists[i].setTooltip(tooltip1);

        }


    }



    public void putOnTable(int cardIndex) throws Exception{


        System.out.println("card size " + playerEngine.getHumanPlayer().getCards().size());
        String message = playerEngine.getHumanPlayer().addCardsToTable(playerEngine.getHumanPlayer().getCards().get(cardIndex));
        if( message.equals("")) {
            String cardsOnTable="";
            for(int i=0;i<playerEngine.getHumanPlayer().getCardsOnTable().size();i++){
                cardsOnTable=cardsOnTable+ playerEngine.getHumanPlayer().getCardsOnTable().get(i);
            }
            Tooltip tooltip = new Tooltip();
            tooltip.setMaxWidth(250);
            tooltip.setWrapText(true);
            tooltip.setText(cardsOnTable);
            cardInfo.setTooltip(tooltip);
            toolTipForBots();



            try {
                Stage stage;

                stage = (Stage) pt_buttons[cardIndex].getScene().getWindow();
                TranslateTransition translate = new TranslateTransition();
                translate.setByX(-150);
                translate.setByY(-150);
                translate.setDuration(Duration.millis(1000));
                translate.setCycleCount(1);
                ImageView temp = cardsOnHandImageView[cardIndex];
                ImageView temp2 = cardsOnHandImageView[6 - round];
                cardsOnHandImageView[6 - round].setImage(temp.getImage());
                cardsOnHandImageView[6 - round].setX(temp.getX());
                cardsOnHandImageView[6 - round].setY(temp.getY());
                cardsOnHandImageView[cardIndex].setImage(temp2.getImage());
                cardsOnHandImageView[cardIndex].setX(temp2.getX());
                cardsOnHandImageView[cardIndex].setY(temp2.getY());
                translate.setNode(cardsOnHandImageView[6 - round]);

                translate.play();
                cardsOnHandImageView[6 - round].setFitHeight(90);
                cardsOnHandImageView[6 - round].setFitWidth(90);

                Scene scene = new Scene(pt_buttons[cardIndex].getScene().getRoot(), 1080, 720);
                stage.setScene(scene);

                stage.show();
            } catch (Exception e) {
                pt_buttons[6-round].setVisible(false);
                aw_buttons[6-round].setVisible(false);
                dc_buttons[6-round].setVisible(false);
                Card chosenCard = playerEngine.getHumanPlayer().getCards().get(cardIndex);
                chosenCard.setUsed(true);
                for(int i = 0; i < noOfPlayers - 1; i++){
                    Bot b = playerEngine.getBots().get(i);
                    b.doAction(age, playerEngine.getAllPlayers());
                    System.out.println("bot " + b.getId() + " plays, card size " + b.getCards().size());
                }
                cardChangeRotate();
                round++;
                if (startWar) {
                    goToWar();
                    startWar = false;
                }
                isAgeFinished();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Card cannot be added.");
            alert.setHeaderText("Please choose another card or choose another operation.");
            alert.setContentText(message);
            alert.showAndWait();
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

    @FXML
    void startWarButtonClicked()throws Exception{
        startWar = true;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Starting war");
        alert.setContentText("War will be started after this round is over.");
        alert.showAndWait();
    }

    void goToWar() throws Exception{
        Stage stage;
        Parent root;

        try {
            FXMLLoader loader=new FXMLLoader(getClass().getResource("../War/WarViewFX.fxml"));

            root=loader.load();

            WarWiew secondController = loader.getController();
            secondController.setCityManager(this.cityManager);
            secondController.setPlayerEngine(playerEngine);
            Image[] botCityImages = new Image[noOfPlayers-1];
            for(int i = 0; i < noOfPlayers -1; i++)
            {
                botCityImages[i] = botCities[i].getImage();
            }
            secondController.setBotCities(botCityImages);
            secondController.setIsAgeFinished(isAgeFinished);
            secondController.setCurAgeNo(age);
            secondController.fight();

            stage = (Stage) startWarButton.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){

        }
    }


    public void cardChangeRotate(){
        //rotating cards at hand
        ArrayList<Card> tempCard = playerEngine.getHumanPlayer().getCards(); //cards on hand
        playerEngine.getHumanPlayer().setCards(playerEngine.getBots().get(0).getCards());

        for( int i = 0; i < playerEngine.getBots().size() - 1; i++ ){
            System.out.println("Bot " + i + " card size: " + playerEngine.getBots().get(i).getCards().size());
            playerEngine.getBots().get(i).setCards(playerEngine.getBots().get(i+1).getCards());
        }

        playerEngine.getBots().get(playerEngine.getBots().size()-1).setCards(tempCard);


        int totRounds = 6;

        for(int i = 0; i < totRounds - round; i++ ){
            System.out.println("card size " + playerEngine.getHumanPlayer().getCards().size());
            String cardName =  preCard + playerEngine.getHumanPlayer().getCards().get(i).getPhotoName();
            Image imCard = new Image(cardName);
            cardsOnHandImageView[i].setImage(imCard);
        }

    }

    @FXML
    public void returnToMain() throws Exception{
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Return to Main");
        alert.setContentText("Game information will be lost.");
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                try {
                    Stage stage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("../Menu/MenuViewFX.fxml"));
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    //music();
                    stage.show();
                } catch (Exception e) {

                }
            }
        });
    }

    public void isAgeFinished() {
        if( pt_buttons[1].isVisible() ){
            isAgeFinished = false;

        } else{
            isAgeFinished = true;
            for(int i = 0; i < noOfPlayers; i++){
                playerEngine.getAllPlayers().get(i).getCards().get(0).setUsed(true);
            }
            ButtonType nextAge = new ButtonType("Go to War");
            ButtonType returnB = new ButtonType("Return to Main");
            Alert alert;
            alert = new Alert(Alert.AlertType.NONE);
            alert.getButtonTypes().addAll(nextAge, returnB);
            alert.setTitle("Age " + (age) + " is finished.");
            alert.setContentText("Go to war, or return to main.");
            alert.showAndWait().ifPresent(response -> {
                if (response == nextAge) {
                    try {
                        goToWar();
                    } catch (Exception e) {

                    }
                } else if( response == returnB )
                {
                    try {
                        returnToMain();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        try{
            isGameFinished();
        } catch(Exception e){

        }
    }

    public void isGameFinished() throws Exception{
        //TODO bunu warview a koymak daha mantıklı galiba
        //TODO alert da eğer eşitlik yoksa çıkar
        if( isAgeFinished && age == 3 ){
            ButtonType gotToScoreBoard = new ButtonType("Go to Score Board");
            ButtonType returnB = new ButtonType("Return to Main");
            Alert alert;
            alert = new Alert(Alert.AlertType.NONE);
            alert.getButtonTypes().addAll(gotToScoreBoard, returnB);
            alert.setTitle("Game is finished.");
            alert.setContentText("Go to score board, or return to main.");
            alert.showAndWait().ifPresent(response -> {
                if (response == gotToScoreBoard) {
                    try {
                        //TODO scoreboard a geciş
                        Stage stage = new Stage();
                        //Parent root = FXMLLoader.load(getClass().getResource("../Menu/WarViewFX.fxml"));
                        //Scene scene = new Scene(root);
                        //stage.setScene(scene);
                        //music();
                        stage.show();
                    } catch (Exception e) {

                    }
                } else if( response == returnB )
                {
                    try {
                        returnToMain();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void setRound(int round){
        this.round = round;
    }


}
