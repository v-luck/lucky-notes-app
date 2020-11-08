package WindowManagerRemade;

import javafx.scene.control.TreeItem;

import java.io.File;

public class FileBrowser {
    private File fileObject;
    private Object MouseEvent;

    public FileBrowser(String pathURL) {
        fileObject = new File(pathURL);
    }

    public void changePathURL(String pathURL) {
        fileObject = new File(pathURL);
    }

    public void listFiles(TreeItem treeItem) {
        for (File file : fileObject.listFiles()) {
            TreeItem treeItem1 = new TreeItem<>(new FileObject(file.getAbsolutePath()));
            treeItem.getChildren().add(treeItem1);
        }
    }
}
