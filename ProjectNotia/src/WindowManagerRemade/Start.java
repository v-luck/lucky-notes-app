package WindowManagerRemade;

public class Start {
    public static void main(String[] args) {
        System.out.println("Hi");
        FileManager fileManager = new FileManager();
        fileManager.listAllFiles(fileManager.retrunURL());
    }
}
