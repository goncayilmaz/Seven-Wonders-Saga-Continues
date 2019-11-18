package superProject.Controller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class PopUpManager extends Application {



    private String popUpTitle;
    private String popUpText;
    private String popUpButtonName;



    @FXML
    private Label textLabel;

    @FXML
    private Label titleLabel;

    @FXML
    private Button buttonOk;

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {

            Parent root = FXMLLoader.load(getClass().getResource("../View/PopUpViewFX.fxml"));
            primaryStage.setTitle("PopUp");

            primaryStage.setScene(new Scene(root, 300, 160));
            primaryStage.setResizable(false);
            primaryStage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }


    public static void main(String[] args) {
        launch(args);
    }

    public String getPopUpTitle() {
        return popUpTitle;
    }

    public void setPopUpTitle(String popUpTitle) {
        this.popUpTitle = popUpTitle;
    }

    public String getPopUpText() {
        return popUpText;
    }

    public void setPopUpText(String popUpText) {
        this.popUpText = popUpText;
    }

    public String getPopUpButtonName() {
        return popUpButtonName;
    }

    public void setPopUpButtonName(String popUpButtonName) {
        this.popUpButtonName = popUpButtonName;
    }
}
