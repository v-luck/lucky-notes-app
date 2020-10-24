package WindowManager;

import java.io.File;
import java.util.Scanner;

public class FileManager {
    private String command, path;
    private Scanner scanner;

    public FileManager(String command) {
        this.command = command;
        this.scanner = new Scanner(System.in);
        this.path = "C:\\";
    }


    public void list(String path) {
        File file = new File(path);
        String[] pathnames = file.list();
        for (String pathname : pathnames) {
            System.out.println(pathname);
        }
    }

    public void changePath(String path, String directory) {
        path += File.separator + directory;
    }

    public void command(String commandName, String path) {
        switch (commandName) {
            case "list":
                list(path);
                break;
            case "changePath":
                break;
            default:
                break;
        }
    }

}
