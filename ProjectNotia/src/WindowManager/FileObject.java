package WindowManager;

import java.io.File;

public class FileObject {
    private File file;
    private File[] fileArray;
    private String pathURL;

    public FileObject(String pathURL) {
        this.file = new File(pathURL);
        this.fileArray = this.file.listFiles();
        this.pathURL = pathURL;
    }

    public File[] getFileArray() {
        return fileArray;
    }

    public File getFile() {
        return file;
    }


}
