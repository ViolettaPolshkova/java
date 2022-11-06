import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessStreamTest {
    @Test
    public void readStreamTest() throws IOException {
        RandomAccessFile stream = new RandomAccessFile("c.txt", "rw");
        int[] arr = {1, 2, 3};
        for (int i : arr) {
            stream.writeInt(i);
        }
        int[] result = new int[2];
        RandomAccessStream.readIntArrayFromSetPosition(stream, result, 1);
        Assert.assertArrayEquals(new int[]{2, 3}, result);
        stream.close();
    }
}