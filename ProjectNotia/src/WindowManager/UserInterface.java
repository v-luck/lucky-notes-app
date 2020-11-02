package WindowManager;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class UserInterface extends Application {
    private FileManager fileManager;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Test");
        fileManager = new FileManager();
        ListView listView = new ListView();

        System.out.println("test");
        //for (File file : fileManager.pathListUI()) {
        //    listView.getItems().add(file.getName());
        //}

        //class ListViewHandler implements EventHandler<MouseEvent> {
        //    @Override
        //    public void handle(MouseEvent event) {
        //        fileManager.pathChange(listView.getSelectionModel().getSelectedItem().toString());
        //        System.out.println(listView.getSelectionModel().getSelectedItem().toString());
        //        listView.getItems().clear();
        //    }
        //}

        listView.setMaxSize(500, 500);
        listView.setPrefHeight(1000);
        //listView.setOnMouseClicked(new ListViewHandler());

        VBox layout = new VBox();
        layout.getChildren().addAll(label, listView);

        Scene scene = new Scene(layout, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Project Notia");
        primaryStage.show();
    }


}
