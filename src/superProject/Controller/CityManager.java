package superProject.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import superProject.Model.City;

import java.util.ArrayList;

public class CityManager extends Application {

    private ArrayList<City> cities;
    private ArrayList<City> cities2;



    @Override
    public void start(Stage primaryStage) throws Exception {


        try {

            Parent root = FXMLLoader.load(getClass().getResource("../View/CitySelectionViewFX.fxml"));
            primaryStage.setTitle("City Selection");

            primaryStage.setScene(new Scene(root, 500, 350));
            primaryStage.setResizable(false);
            primaryStage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void createCity(){


    }
    public void changeCityStage(City city){

        city.setBoardLevel(city.getBoardLevel()+1);




    }
}
