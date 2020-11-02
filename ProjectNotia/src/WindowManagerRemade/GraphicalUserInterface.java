package WindowManagerRemade;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

import java.io.File;

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

        for (File file : fileManager.pathListUI()) {
            String itemName = file.getName();
            test.getChildren().add(new TreeItem<>(itemName));
        }
        TreeView treeView = new TreeView(test);


        Scene scene = new Scene(treeView, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void addTree(String pathURL, TreeView<String> treeView) {
        if (fileManager.returnFileObject().getFileArray() != null) {
            for (File file : fileManager.returnFileObject().getFileArray()) {
                if (file.isFile()) {
                    treeView.getChildren().add(file.getName());
                } else if (file.isDirectory()) {
                    addTree(file.getAbsolutePath(), treeView);
                }
            }
        }
    }

}
