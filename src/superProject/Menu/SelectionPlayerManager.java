package superProject.Menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import superProject.City.CityManager;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SelectionPlayerManager implements Initializable {

    private int playerNumber = 3;


    @FXML
    private Label playerNumberLabel;

    @FXML
    private Button increasePlayerButton;

    @FXML
    private Button decreasePlayerButton;

    @FXML
    private Button buttonBack;

    @FXML
    private Button nextToSelection;

    @FXML
    private ImageView backgroundImageView;




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        playerNumberLabel.setText(String.valueOf(playerNumber));
        playerNumberLabel.setAlignment(Pos.CENTER);
        playerNumberLabel.setTextAlignment(TextAlignment.CENTER);
        nextToSelection.setAlignment(Pos.BASELINE_CENTER);

    }

    public void selectCity(ActionEvent event){

        Stage stage;
        Parent root;


        try {
            FXMLLoader loader=new FXMLLoader(getClass().getResource("../Menu/CitySelectionViewFX.fxml"));

            root=loader.load();
            CityManager secondController=loader.getController();

            secondController.setNumberOfPeople(playerNumber);
            secondController.getStartButton().setText(String.valueOf(playerNumber)+" People Start");
           // secondController.setChosenCityLabel(getPlayerNumberLabel());

            stage = (Stage) nextToSelection.getScene().getWindow();
            stage.setFullScreen(true);
            stage.setResizable(true);
            System.out.println("go to city selection");
          //  root=FXMLLoader.load(getClass().getResource("../Menu/CitySelectionViewFX.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
        catch (Exception e){

        }
        /*
        try {
            Stage stage = new Stage();
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("../Menu/CitySelectionViewFX.fxml"));
            stage.setScene(new Scene(root));
            stage.setTitle("City Selection");
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)event.getSource()).getScene().getWindow() );

            stage.show();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

         */
    }
    public void increasePlayer(ActionEvent event){

        if(playerNumber < 7) {
            playerNumber++;

            playerNumberLabel.setText(String.valueOf(playerNumber));
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Maximum Number of Player");
            alert.setHeaderText("Maximum number of player limit is reached!");
            alert.setContentText("Game can play with 3 to 7 people!");

            alert.showAndWait();
        }

    }

    public void decreasePlayer(ActionEvent event){
        if(playerNumber > 3) {
            playerNumber--;
            playerNumberLabel.setText(String.valueOf(playerNumber));
        }
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Minimum Number of Player");
            alert.setHeaderText("Minimum number of player limit is reached!");
            alert.setContentText("Game can play with 3 to 7 people!");

            alert.showAndWait();
        }


    }


    public int getPlayerNumber() {
        return playerNumber;
    }

    public Label getPlayerNumberLabel() {
        return playerNumberLabel;
    }

    public void backToMainMenu(ActionEvent event){
        Stage stage;
        Parent root;

        try {
            stage = (Stage) buttonBack.getScene().getWindow();
            root=FXMLLoader.load(getClass().getResource("../Menu/MenuViewFX.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
        catch (Exception e){

        }
    }






}
