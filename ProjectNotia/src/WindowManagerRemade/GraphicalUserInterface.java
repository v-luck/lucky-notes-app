package WindowManagerRemade;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;

public class GraphicalUserInterface extends Application {

    private FileManager fileManager;
    private FileBrowser fileBrowser;

    public GraphicalUserInterface() {
        fileManager = new FileManager();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tree");
        FileBrowser fileBrowser = new FileBrowser("C:\\Users\\bobba\\Documents\\ConnectAppCache");
        TreeItem<String> treeItem = new TreeItem<>("Test");
        fileBrowser.listFiles(treeItem);
        TreeView treeView = new TreeView(treeItem);
        treeView.setRoot(treeItem);
        Scene scene = new Scene(treeView);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void selectedItems(MouseEvent mouseEvent) {
    }





}
