package WindowManagerRemade;

import WindowManager.FileObject;
import javafx.scene.control.TreeView;

import java.io.File;

public class FileManager {
    private String pathURL;
    private FileObject fileObject;

    public FileManager() {
        this.pathURL = "C:\\";
        this.fileObject = new FileObject(pathURL);
    }

    //Prints out all files in the current director of the file manager
    public void pathList() {
        for (File file: fileObject.getFileArray()) {
            System.out.println(file.getName());
        }
    }

    public FileObject returnFileObject() {
        return this.fileObject;
    }

    public File[] pathListUI() {
        return fileObject.getFileArray();
    }

    public void listAllFiles(String pathURL, TreeView treeView) {
        if (fileObject.getFileArray() != null) {
            for (File file : fileObject.getFileArray()) {
                if (file.isFile()) {
                    treeView.getChildren().add()
                }
            }
        }
    }

    ////List all files in current/sub directories
    //public void listAllFiles(String pathURL) {
    //    if (fileObject.getFileArray() != null) {
    //        for (File file : fileObject.getFileArray()) {
    //            if (file.isFile()) {
    //                System.out.println(file.getName());
    //            } else if (file.isDirectory()) {
    //                listAllFiles(file.getAbsolutePath());
    //            }
    //        }
    //    }
    //}

    public void searchAll(String pathURL, String searchedString) {
        FileObject fileObject = new FileObject(pathURL);
        if (fileObject.getFileArray() != null) {
            for (File file : fileObject.getFileArray()) {
                if (file.isFile() && file.getName().contains(searchedString)) {
                    System.out.println(file.getName());
                } else if (file.isDirectory()) {
                    if (file.getName().contains(searchedString)) {
                        System.out.println(file.getName());
                    }
                    searchAll(file.getAbsolutePath(), searchedString);
                }
            }
        }
    }
}
