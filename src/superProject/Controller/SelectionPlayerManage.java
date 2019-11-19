package superProject.Controller;

import com.sun.org.apache.xml.internal.security.Init;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SelectionPlayerManage implements Initializable {




    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void selectCity(ActionEvent event){
        try {
            Stage stage = new Stage();
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("../View/CitySelectionViewFX.fxml"));
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

    }

    public void decreasePlayer(ActionEvent event){

    }






}
