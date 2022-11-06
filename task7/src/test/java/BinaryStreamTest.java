import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class BinaryStreamTest {
    @Test
    public void testWriteAndReadBinaryStream() throws IOException {
        int[] a = {1, 2, 100};
        try (OutputStream outputStream = new FileOutputStream("a.bin")) {
            BinaryStream.writeIntArrayIntoBinaryStream(outputStream, a);
        }
        int[] inTs = new int[a.length];
        try (InputStream inputStream = new FileInputStream("a.bin")){
            BinaryStream.readIntArrayIntoBinaryStream(inputStream, inTs);
        }
        Assert.assertArrayEquals(a, inTs);
    }
}