import junit.framework.TestCase;
import org.junit.Assert;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CharStreamTest extends TestCase {
    public void testWriteReadStream() throws IOException {
        int[] a = {1, 2, 100};
        try (Writer writer = new FileWriter("a.txt", StandardCharsets.UTF_8)) {
            CharStream.writeCharArrayIntoBinaryStream(writer, a);
        }
        int[] b = new int[a.length];
        try (Reader reader = new FileReader("a.txt", StandardCharsets.UTF_8)) {
            CharStream.readCharArrayIntoBinaryStream(reader, b);
        }
        Assert.assertArrayEquals(a, b);
    }
}