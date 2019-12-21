package superProject.GameMain;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import superProject.GameProperties.CardEngine;

import java.net.URL;
import java.util.ResourceBundle;

public class GameAreaView implements Initializable {



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
