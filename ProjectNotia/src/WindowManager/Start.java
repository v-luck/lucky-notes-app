package WindowManager;

import java.io.File;
import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\");
        String[] pathnames = file.list();
        for (String pathname : pathnames) {
            System.out.println(pathname);
        }
    }
}
