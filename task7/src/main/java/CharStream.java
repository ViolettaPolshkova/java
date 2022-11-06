import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//используя символьные потоки. В потоке числа должны разделяться пробелами.
public class CharStream {
    public static void writeCharArrayIntoBinaryStream(Writer writer, int[] array) throws IOException {
        for(int i : array){
            writer.write(Integer.toString(i));
            writer.write(' ');
        }
    }

    public static void readCharArrayIntoBinaryStream(Reader reader, int[] array) throws IOException{
        try(BufferedReader stream = new BufferedReader(reader)){
            String str = stream.readLine();
            String[] numbers = str.split(" ");
            for(int i = 0; i < array.length; i++){
                array[i] = Integer.parseInt(numbers[i]);
            }
        }
    }
}