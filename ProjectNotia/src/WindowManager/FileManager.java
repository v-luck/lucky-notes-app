package WindowManager;

import java.io.File;
import java.util.Scanner;

public class FileManager {
    private String path;
    private File file;
    private String[] fileArray;
    private Scanner scanner;

    public FileManager() {
        scanner = new Scanner(System.in);
        path = "C:\\";
        file = new File(path);
        fileArray = file.list();
    }

    public void start() {
        while (true) {
            System.out.print("Insert command: ");
            String command = scanner.nextLine();
            pathCommand(command);
        }
    }

    public void pathList() {
        for (String pathname : fileArray) {
            System.out.println(pathname);
        }
    }

    //public void searchForFile(String search, String path, String[] fileArray) {
    //    for (String file : fileArray) {
    //        System.out.println(file);
    //        if (file.contains(search)) {
    //            System.out.println(file);
    //        }
    //        String fileDirectory = path + File.separator + file;
    //        File searchedDirectory = new File(fileDirectory);
    //        String[] searchedDirectoryList = searchedDirectory.list();
    //        if (searchedDirectory.isDirectory()) {
    //            searchForFile(search, fileDirectory, searchedDirectoryList);
    //        }
    //    }
    //}

    public void pathChange(String directory) {
        if (directoryExists(directory)) {
            path += File.separator + directory;
            file = new File(path);
            fileArray = file.list();
        } else {
            System.out.println("Directory does not exist. Path did not change.");
        }
    }

    public boolean directoryExists(String checkDirectory) {
        for (String directory : fileArray) {
            if (directory.equals(checkDirectory)) {
                return true;
            }
        }
        return false;
    }

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
                System.out.println("Current path is: " + path);
                break;
            //case "search":
            //    System.out.print("Enter word to search for: ");
            //    String userInput = scanner.nextLine();
            //    searchForFile(userInput, path, fileArray);
            //    break;
            default:
                break;
        }
    }





}
