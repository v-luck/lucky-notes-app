package WindowManager;

import java.io.File;
import java.util.Scanner;

public class FileManager {
    private String command;
    private Scanner scanner;

    public FileManager(String command) {
        this.command = command;
        this.scanner = new Scanner(System.in);
    }

    public String userPrompt() {
        String path = "C:";
        while (true) {
            path += File.separator;
            System.out.print("list? (y/n): ");


        }
    }






}
