package WindowManagerRemade;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

public class GraphicalUserInterface extends Application {

    private FileManager fileManager;

    public GraphicalUserInterface() {
        fileManager = new FileManager();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tree");
        TreeItem<String> test = new TreeItem<>("test");
        fileManager.addTree(fileManager.retrunURL(), test);

        //for (File file : fileManager.pathListUI()) {
        //    String itemName = file.getName();
        //    test.getChildren().add(new TreeItem<>(itemName));
        //}
        TreeView treeView = new TreeView(test);


        Scene scene = new Scene(treeView, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
