package FileHandler;

public class FileHandler {
    private FileData fileData;
    private String filePathName;
    private FileReader fileReader;

    public void setUp() {
        setFilePathName("D:\\Users\\kumarsah\\IdeaProjects\\FileHandling\\src\\main\\java\\FileHandler\\Imports.txt");
        setFileReader();
    }

    public void setFilePathName(String filePathName) {
        this.filePathName = filePathName;
    }

    public void setMyFile() {
        try {
            fileData = new FileData(filePathName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }

    public void setFileReader() {
        fileReader = new FileReader();
    }

    public void readFile() {
        try {
            fileReader.readFileData(fileData);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void readFileReverse() {
        try {
            fileReader.readFileDataReverse(fileData);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void getWordCount() {
        try {
            int count = fileReader.getWordCount(fileData);
            System.out.println("Word count: " + count);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void getLineCount() {
        try {
            int count = fileReader.getLineCount(fileData);
            System.out.println("Line count: " + count);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void searchWord() {
        try {
            boolean flag = fileReader.isWordPresent(fileData, "This");
            System.out.println(flag);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();

        fileHandler.setUp();
        fileHandler.setMyFile();
        fileHandler.readFile(); // print file
        fileHandler.readFileReverse(); // print file in reverse order
        fileHandler.getLineCount(); // number of lines in file
        fileHandler.getWordCount(); // number of words in file
        fileHandler.searchWord(); // search particular word in file

    }
}
