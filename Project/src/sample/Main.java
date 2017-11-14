package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        Pane root = new Pane();
        Button btn = new Button();
        btn.setText("ДА НАЧНЕТСЯ ТЕСТИРОВАНИЕ!!!");
        btn.setTranslateX(140);
        btn.setTranslateY(140);
        btn.setPrefSize(100,100);
        primaryStage.show();
        Scene scene = new Scene(root);
        root.getChildren().addAll(btn);
        
    }


    public static void main(String[] args) {
        launch(args);
    }
}
