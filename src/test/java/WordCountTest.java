import org.junit.Test;
import org.spark.example.WordCountTask;

import java.net.URISyntaxException;

public class WordCountTest {
    @Test
    public void test() throws URISyntaxException {
        String inputFile = getClass().getResource("loremipsum.txt").toURI().toString();
        new WordCountTask().run(inputFile);
    }
}
