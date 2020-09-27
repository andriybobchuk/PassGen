package home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        primaryStage.setTitle("Генератор паролів");
        primaryStage.setScene(new Scene(root, 563, 442));
        primaryStage.setResizable(false);//Locks the window size
        primaryStage.getIcons().add(new Image("file:D:/DOCUMENTS/PassGen/src/favicon.png"));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

