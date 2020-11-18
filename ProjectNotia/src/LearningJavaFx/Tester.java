package LearningJavaFx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Tester extends Application {
    @Override
    public void start(Stage primaryState) {
        Button buttone = new Button();
        buttone.setText("Say hello world");
        buttone.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello world!");
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(buttone);
        Scene scene = new Scene(root, 300, 250);
        primaryState.setScene(scene);;
        primaryState.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
