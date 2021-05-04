package FileHandler;
import java.io.File;
import java.util.Scanner;

public class FileReader {

    public void readFileData(FileData fileData) throws Exception {
        File myFile = fileData.getMyFile();
        if(myFile.canRead()) {
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                System.out.println(myReader.nextLine());
            }
        }
        else {
            throw new IllegalArgumentException("File Is Not Readable");
        }
    }
    public void readFileDataReverse(FileData fileData) throws Exception{
        File myFile = fileData.getMyFile();
        if(myFile.canRead()) {
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                StringBuffer word = new StringBuffer(myReader.nextLine());
                word.reverse();
                System.out.println(word);
            }
        }
        else {
            throw new Exception("File Is Not Readable");
        }
    }

    public int getWordCount(FileData fileData) throws Exception{
        File myFile = fileData.getMyFile();
        int count = 0;
        if(myFile.canRead()) {
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNext()) {
                myReader.next();
                count = count + 1;
            }
            return count;
        }
        else {
            throw new Exception("File Is Not Readable");
        }
    }

    public int getLineCount(FileData fileData) throws Exception{
        File myFile = fileData.getMyFile();
        int count = 0;
        if(myFile.canRead()) {
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                myReader.nextLine();
                count = count + 1;
            }
            return count;
        }
        else {
            throw new Exception("File Is Not Readable");
        }
    }

    public boolean isWordPresent(FileData fileData, String word) throws Exception {
        File myFile = fileData.getMyFile();;
        if(myFile.canRead()) {
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNext()) {
                if(myReader.next().equals(word)) {
                    return true;
                }
            }
            return false;
        }
        else {
            throw new Exception("File Is Not Readable");
        }
    }
}
