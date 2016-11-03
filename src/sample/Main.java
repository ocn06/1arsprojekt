package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.DAO.DAOthing;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("Støberiet");
        primaryStage.setScene(new Scene(root, 1000, 500));
        primaryStage.show();

        Button logInd = new Button("Log ind");
        logInd.setOnAction(event -> {});
    }


    public static void main(String[] args) {
        DAOthing.connect();
        // launch(args);
    }
}
