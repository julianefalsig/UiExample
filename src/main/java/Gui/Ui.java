package Gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;



public class Ui extends Application {
    public static void run() {
        launch();

    }
    @Override
    public void start(Stage Stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/JavaFXML.fxml"));

        Stage.setTitle("Simpelt eksempel på implementation af en Stage");
        //Label label1 = new Label("Hello java");
        AnchorPane pane = new AnchorPane();
        Scene scene = new Scene(pane, 400, 200);
        Stage.setScene(scene);
        Stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

