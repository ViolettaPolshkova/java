import java.io.IOException;
import java.io.RandomAccessFile;

//Используя класс RandomAccessFile,
// прочитайте массив целых чисел, начиная с заданной позиции.
public class RandomAccessStream {
    public static void readIntArrayFromSetPosition(RandomAccessFile stream, int[] array, int position) throws IOException {
        stream.seek(position * 4L);
        for(int i = 0; i < array.length - position + 1; i++){
            int tmp = stream.readInt();
            array[i] = tmp;
        }
    }
}