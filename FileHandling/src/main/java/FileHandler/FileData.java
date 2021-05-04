package FileHandler;

import java.io.File;


public class FileData {
    private File myFile;
    private String filePathName;

    public FileData(String filePathName) throws IllegalArgumentException{
        if(filePathName.equals("")) {
           throw new IllegalArgumentException("file path can not be empty");
        }
        this.filePathName = filePathName;
        myFile = new File(filePathName);
        if(!myFile.exists()) {
            throw new IllegalArgumentException("File Not Found");
        }
    }

    public void setFilePathName(String filePathName) throws IllegalArgumentException{
        if(filePathName.equals("")) {
            throw new IllegalArgumentException("file path can not be empty");
        }
        this.filePathName = filePathName;
    }

    public void setMyFile() throws IllegalArgumentException {
        File newFile = new File(this.filePathName);
        myFile = newFile;
        if(!myFile.exists()) {
            throw new IllegalArgumentException("File Not Found");
        }
    }

    public File getMyFile() {
        return myFile;
    }

    public String getFilePathName() {
        return filePathName;
    }
}
