import static org.junit.Assert.*;

import java.io.IOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import org.junit.*;
public class MarkdownParseTest extends MarkdownParse{
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void links() throws IOException {
        ArrayList<String> testTheTesterFile = new ArrayList<>();
        testTheTesterFile.add("https://something.com");
        testTheTesterFile.add("some-thing.html");
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}
