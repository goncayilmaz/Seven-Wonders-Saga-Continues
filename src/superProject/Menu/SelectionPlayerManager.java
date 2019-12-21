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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SelectionPlayerManager implements Initializable {

    private int playerNumber=2;


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





    @Override
    public void initialize(URL location, ResourceBundle resources) {
        playerNumberLabel.setText(String.valueOf(playerNumber));


    }

    public void selectCity(ActionEvent event){

        Stage stage;
        Parent root;

        try {
            stage = (Stage) nextToSelection.getScene().getWindow();
            root=FXMLLoader.load(getClass().getResource("../Menu/CitySelectionViewFX.fxml"));

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

        if(playerNumber<6) {
            playerNumber++;

            playerNumberLabel.setText(String.valueOf(playerNumber));
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Maximum Number of Player");
            alert.setHeaderText("Reach Maximum Number of Player Limit");
            alert.setContentText("Game can play with 2 to 7 people!");

            alert.showAndWait();
        /*
        kırmızı alert için bu da olabilir
        Alert alert = new Alert(AlertType.ERROR);
alert.setTitle("Error Dialog");
alert.setHeaderText("Look, an Error Dialog");
alert.setContentText("Ooops, there was an error!");

alert.showAndWait();
         */

        }

    }

    public void decreasePlayer(ActionEvent event){
        if(playerNumber>2) {
            playerNumber--;

            playerNumberLabel.setText(String.valueOf(playerNumber));
        }
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Minimum Number of Player");
            alert.setHeaderText("Reach Minimum Number of Player Limit");
            alert.setContentText("Game can play with 2 to 7 people!");

            alert.showAndWait();
        }


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
