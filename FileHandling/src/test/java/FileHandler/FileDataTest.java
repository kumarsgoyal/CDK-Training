package FileHandler;

import org.junit.Before;
import org.junit.Test;


public class FileDataTest {
    private String filePathName;
    private FileData fileData;

    @Before
    public void setUp() {
        filePathName = new String("D:\\Users\\kumarsah\\IdeaProjects\\FileHandling\\src\\main\\java\\FileHandler\\Imports.t");
        fileData = new FileData(filePathName + "xt");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExceptionWhenFilePathIsInValid() {
        FileData fileData = new FileData("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExceptionWhenFileIsNotFound() {
        FileData fileData = new FileData(filePathName);
    }

    @Test
    public void shouldNotReturnAnyExceptionIfFileIsFound() {
        FileData fileData = new FileData(filePathName + "xt");
    }

    @Test
    public void shouldNotReturnAnyExceptionWhileSetUpValidFilePathName() {
        fileData.setFilePathName(filePathName + "xt");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExceptionWhileSetUpInValidFilePathName() {
        fileData.setFilePathName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExceptionWhileSetUpInValidFile() {
        fileData.setFilePathName(filePathName);
        fileData.setMyFile();
    }

    @Test
    public void shouldNotReturnAnyExceptionWhileSetUpValidFile() {
        fileData.setFilePathName(filePathName + "xt");
        fileData.setMyFile();
    }


}