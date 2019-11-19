package superProject.Controller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class PopUpManager implements Initializable {



    private String popUpTitle;
    private String popUpText;
    private String popUpButtonName;


    @FXML private javafx.scene.control.Button closeButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

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
