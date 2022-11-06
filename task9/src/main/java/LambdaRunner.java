import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaRunner {
    public static <T, K> K biFunction(Function<T, K> function, T obj){
        return function.apply(obj);
    }

    public static <T, K, F> F threeFunction(BiFunction<T, K, F> biFunction, T obj1, K obj2){
        return biFunction.apply(obj1, obj2);
    }

    public static boolean myOperation(MyOperation function, Human human1, Human human2, Human human3, int maxAge){
        return function.apply(human1, human2, human3, maxAge);
    }

}