import java.io.*;

//Записать массив целых чисел в двоичный поток. Прочитать массив целых чисел из двоичного потока.
// Предполагается, что до чтения массив уже создан, нужно прочитать n чисел, где n — длина массива.
public class BinaryStream {
    public static void writeIntArrayIntoBinaryStream(OutputStream outputStream, int[] array) throws IOException {
        try(DataOutputStream dataOutputStream = new DataOutputStream(outputStream)){
            for(int i : array){
                dataOutputStream.writeInt(i);
            }
        }
    }

    public static void readIntArrayIntoBinaryStream(InputStream inputStream, int[] array) throws IOException{
        try(DataInputStream dataInputStream = new DataInputStream(inputStream)){
            for(int i = 0; i < array.length; i++){
                array[i] = dataInputStream.readInt();
            }
        }
    }
}