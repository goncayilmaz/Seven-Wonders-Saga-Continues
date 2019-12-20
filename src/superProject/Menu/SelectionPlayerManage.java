package superProject.Menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SelectionPlayerManage implements Initializable {


    @FXML
    private Label playerNumberLabel;

    @FXML
    private Button increasePlayerButton;

    @FXML
    private Button decreasePlayerButton;





    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void selectCity(ActionEvent event){
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
    }
    public void increasePlayer(ActionEvent event){
        System.out.println( playerNumberLabel.getText());


    }

    public void decreasePlayer(ActionEvent event){

    }






}
