package FileHandler;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class FileReaderTest {

    private String filePathReadable;
    private String filePathNotReadable;
    private FileData fileDataReadable;
    private FileData fileDataNotReadable;
    private FileReader fileReader;

    @Before
    public void setUp() {
        filePathReadable = new String("D:\\Users\\kumarsah\\IdeaProjects\\FileHandling\\src\\main\\java\\FileHandler\\Imports.txt");
        filePathNotReadable = new String("D:\\Users\\kumarsah\\IdeaProjects\\FileHandling\\src\\main\\java\\FileHandler\\ImportsNoRead.txt");
        fileDataReadable = new FileData(filePathReadable);
        fileDataNotReadable = new FileData(filePathNotReadable);
        fileReader = new FileReader();
    }

    @Test
    public void shouldNotThrowAnyException() {
        boolean flag = false;
        try {
            fileReader.readFileData(fileDataReadable);
        }
        catch (Exception exception) {
            flag = true;
        }
        assertEquals(flag, false);
    }

    @Test
    public void shouldThrowException() throws Exception {
        boolean flag = false;
        try {
            fileReader.readFileData(fileDataNotReadable);
        }
        catch (Exception e) {
            flag = true;
        }
        assertEquals(flag, true);
    }

    @Test
    public void shouldGiveWordCountEqual() throws Exception {
        int count = fileReader.getWordCount(fileDataReadable);
        assertEquals(count, 5104);
    }

    @Test
    public void shouldGiveLineCountEqual() throws  Exception{
        int count = fileReader.getLineCount(fileDataReadable);
        assertEquals(count, 393);
    }

    @Test
    public void shouldWordPresent() throws Exception {
        boolean flag = fileReader.isWordPresent(fileDataReadable, "This");
        assertEquals(flag, true);
    }
}