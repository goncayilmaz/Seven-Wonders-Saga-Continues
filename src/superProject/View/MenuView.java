package superProject.View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class MenuView extends Application {


    Button startButton;
    Button tutorialButton;
    Button quitButton;
    Button creditsButton;
    Button optionsButton;
    Button photoButton;


    Button button;
    Scene scene;



    @Override
    public void start(Stage primaryStage) throws Exception {

        startButton= new Button("Start");
        tutorialButton = new Button("Tutorial");
        quitButton = new Button("Quit");
        creditsButton = new Button("Credits");
        optionsButton = new Button("Options");
        photoButton = new Button("Photo");

        button= new Button("efe");
        button.setMinHeight(100);
        button.setMinWidth(100);

        GridPane pane = new GridPane();
        pane.getChildren().add(button);
        pane.setPadding(new Insets(20,20,20,20));

        scene= new Scene(pane,250,250);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public MenuView() {




    }


}

