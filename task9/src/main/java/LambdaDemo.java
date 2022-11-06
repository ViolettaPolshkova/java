import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaDemo {

    //1)	для строки символов получить ее длину
    public static Function<String, Integer> length = String::length; // имя класса::имя методa

    //2)	для строки символов получить ее первый символ, если он существует, или null иначе
    public static Function<String, Character> firstChar = str ->{
        if(str != null && str.length() > 0){
            return str.charAt(0);
        }
        return null;
    };

    //3)	для строки проверить, что она не содержит пробелов
    public static Function<String, Boolean> isNotOpenSpace = str -> str.indexOf(' ') == -1;

    //4)	слова в строке разделены запятыми, по строке получить количество слов в ней
    public static Function<String, Integer> amountOfWords = str -> {
        StringBuilder stringBuilder = new StringBuilder(str);
        while (stringBuilder.charAt(0) == ','){
            stringBuilder.deleteCharAt(0);
        }
        return stringBuilder.toString().split(",+").length;
    };

    //5)	по человеку получить его возраст
    public static Function<Human, Integer> getAge = Human::getAge; // имя класса::имя методa

    //6)	по двум людям проверить, что у них одинаковая фамилия
    public static BiFunction<Human, Human, Boolean> theSameLastName =
            (human1, human2) -> human1.getLastName().equals(human2.getLastName());

    //7)	получить фамилию, имя и отчество человека в виде одной строки (разделитель — пробел)
    public static Function<Human, String> getFIO =
            human -> human.getLastName() + " " + human.getName() + " " + human.getMiddleName();

    //8)	сделать человека старше на один год (по объекту Human создать новый объект)
    public static Function<Human, Human> makePersonOlder =
            human -> new Human(human.getLastName(), human.getName(), human.getMiddleName(), human.getAge() + 1);

    //9)    по трем людям и заданному возрасту maxAge проверить, что все три человека моложе maxAge
    public static MyOperation personsIsElderThanMaxAge =
            (Human human1, Human human2, Human human3, int maxAge) ->
                    human1.getAge() < maxAge && human2.getAge() < maxAge && human3.getAge() < maxAge;
}