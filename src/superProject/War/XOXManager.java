package superProject.War;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class XOXManager implements Initializable {

    private Button[][] buttons;
    @FXML
    private boolean isWinner;
    @FXML
    private Label resultLabel;
    @FXML
    private Button returnButton;
    @FXML
    private Button button00;
    @FXML
    private Button button01;
    @FXML
    private Button button02;
    @FXML
    private Button button10;
    @FXML
    private Button button11;
    @FXML
    private Button button12;
    @FXML
    private Button button20;
    @FXML
    private Button button21;
    @FXML
    private Button button22;

    public XOXManager(){
        //System.out.println("heyy");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttons = new Button[3][3];
        buttons[0][0] = button00;
        buttons[0][1] = button01;
        buttons[0][2] = button02;
        buttons[1][0] = button10;
        buttons[1][1] = button11;
        buttons[1][2] = button12;
        buttons[2][0] = button20;
        buttons[2][1] = button21;
        buttons[2][2] = button22;
        isWinner = false;
    }


    public boolean checkFinished(int ind0, int ind1){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(buttons[i][j].equals("")){
                    return true;
                }
            }
        }

        return false;

    }

    @FXML
    public void showResult(){
        if(isWinner)
            resultLabel.setText("YOU WON");
        else
            resultLabel.setText("YOU LOST");
        resultLabel.setVisible(true);
        returnButton.setEnabled(true);
    }

    @FXML
    public void returnWarView (MouseEvent event){
        Stage stage;
        Parent root;

        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../War/WarViewFX.fxml"));
            root = loader.load();
            stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e){

        }
    }
}
