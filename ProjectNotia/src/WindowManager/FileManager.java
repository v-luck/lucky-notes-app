package WindowManager;

import java.io.File;
import java.util.Scanner;

public class FileManager {
    private String pathURL;
    private Scanner scanner;
    private FileObject fileObject;

    public FileManager() {
        this.scanner = new Scanner(System.in);
        this.pathURL = "C:\\";
        this.fileObject = new FileObject(pathURL);
    }

    //Runs the program in a while loop until broken out of
    public void start() {
        while (true) {
            System.out.print("Insert command: ");
            String command = scanner.nextLine();
            pathCommand(command);
        }
    }

    //Prints out all files in the current director of the file manager
    public void pathList() {
        for (File file: fileObject.getFileArray()) {
            System.out.println(file.getName());
        }
    }
    public File[] pathListUI() {
        return fileObject.getFileArray();
    }

    //Changes the current directory of file manager to @param directory
    public void pathChange(String directory) {
        if (directoryExists(directory)) {
            this.pathURL += File.separator + directory;
            fileObject = new FileObject(this.pathURL);
        } else {
            System.out.println("Directory does not exist. Path did not change.");
        }
    }

    //Checks if folder contains a directory named @param checkDirectory
    public boolean directoryExists(String checkDirectory) {
        for (File directory : fileObject.getFileArray()) {
            if (directory.getName().equals(checkDirectory)) {
                return true;
            }
        }
        return false;
    }

    //List all files in current/sub directories
    public void listAllFiles(String pathURL) {
        FileObject fileObject = new FileObject(pathURL);
        if (fileObject.getFileArray() != null) {
            for (File file : fileObject.getFileArray()) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                } else if (file.isDirectory()) {
                    listAllFiles(file.getAbsolutePath());
                }
            }
        }
    }

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

    //User inputted commands
    public void pathCommand(String commandName) {
        switch (commandName) {
            case "list":
                pathList();
                break;
            case "changePath":
                System.out.print("Change path to: ");
                String directory = scanner.nextLine();
                pathChange(directory);
                break;
            case "listPath":
                System.out.println("Current path is: " + this.pathURL);
                break;
            case "listAll":
                listAllFiles(this.pathURL);
                break;
            case "search":
                System.out.print("Search for given string: ");
                String userSearch = scanner.nextLine();
                searchAll(this.pathURL, userSearch);
            default:
                break;
        }
    }





}
