import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReflectionDemoTest {

    @Test
    public void testAmountOfObjects(){
        Student student = new Student("Surname","Name","MiddleName", 19,"faculty");
        List<Object> objectList = new ArrayList<>();
        objectList.add(new Human("Surname1", "Name1", "MiddleName1", 20));
        objectList.add(new Human("Surname2", "Name2", "MiddleName2", 21));
        objectList.add(new Human("Surname3", "Name3", "MiddleName3",17));

        objectList.add(new Student("Surname1", "Name1", "MiddleName1", 18,"f"));
        objectList.add(new Student("Surname2", "Name2", "MiddleName2", 22,"k"));

        Assert.assertEquals(5, ReflectionDemo.amountOfObjects(objectList));
    }

    @Test
    public void testGetListSuperClasses(){
        Student student = new Student("Surname", "Name", "MiddleName", 19,"f");
        Assert.assertEquals(List.of("Human", "java.lang.Object"), ReflectionDemo.getListSuperClasses(student));
    }


    @Test
    public void testGetListMethodsNames(){
        Comparator<String> comparator = String::compareTo; // имя класса::имя методa
        Human human = new Human("lastName", "name", "middleName", 16);
        ArrayList<String> list = new ArrayList<>(
                List.of("getName", "equals", "hashCode", "setName", "getLastName",
                        "setLastName", "getAge", "setAge", "getMiddleName", "setMiddleName", "wait", "wait",
                        "wait", "toString", "getClass", "notify", "notifyAll"));

        list.sort(comparator);
        List<String> result = ReflectionDemo.getListMethodsNames(human);
        result.sort(comparator);
        Assert.assertEquals(list, result);
    }

}