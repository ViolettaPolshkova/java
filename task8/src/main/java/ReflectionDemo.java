import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectionDemo {

    //Дан список объектов произвольных типов. Найдите количество элементов
    // списка, которые являются объектами типа Human или его подтипами.
    public static int amountOfObjects(List<Object> objectList){
        int amount = 0;
        for(Object object : objectList){
            if(object instanceof Human){
                amount++;
            }
        }
        return amount;
    }

    //Для объекта получить список имен его открытых методов.
    public static List<String> getListMethodsNames(Object object){
        List<String> methods = new ArrayList<>();
        Class<?> c = object.getClass();
        for(Method method : c.getMethods()){
            methods.add(method.getName());
        }
        return methods;
    }


    //Для объекта получить список (в виде списка строк) имен всех его
    // суперклассов до класса Object включительно.
    public static List<String> getListSuperClasses(Object object){
        List<String> stringList = new ArrayList<>();
        Class<?> c = object.getClass();
        while(c != Object.class){
            c = c.getSuperclass();
            stringList.add(c.getName());
        }
        return stringList;
    }
}