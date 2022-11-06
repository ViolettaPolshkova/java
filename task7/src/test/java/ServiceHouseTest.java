import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.List;

public class ServiceHouseTest {
    @Test
    public void serialHouse() throws IOException, ClassNotFoundException {
        House house = new House("9848854827.0", 644034, new Person("lastName", "name", "middleName", "12.09.1997"),
                List.of(new Flat(14,55, List.of(new Person("lastName","name", "middleName", "12.09.1997")))));

        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("house.txt"))) {
            ServiceHouse.serialHouse(stream, house);
        }
        House resultHouse;
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream("house.txt"))){
            resultHouse = ServiceHouse.deserialHouse(stream);
        }
        Assert.assertEquals(house, resultHouse);
    }

    @Test
    public void serialHouseJSON() throws IOException {
        House house = new House("9848854827.0", 644034, new Person("lastName1", "name1", "middleName1", "15.12.1997"),
                List.of(new Flat(1,2,
                        List.of(new Person("lastName","name", "middleName", "12.09.1997")))));
        Assert.assertEquals(house, ServiceHouse.deserialHouseJSON(ServiceHouse.serialHouseJSON(house)));
    }
}