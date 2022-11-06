import java.io.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ServiceHouse {
    public static void serialHouse(OutputStream outputStream, House house) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(house); //преобразует в байты и сохраняет в файл
        }
    }

    public static House deserialHouse(InputStream inputStream) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            return (House) objectInputStream.readObject();
        }
    }

    public static String serialHouseJSON(House house) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(house);
    }

    public static House deserialHouseJSON(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, House.class);
    }
}