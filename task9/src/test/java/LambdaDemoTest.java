import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class LambdaDemoTest {
    @Test
    public void testLengthString(){
        Assert.assertEquals(Optional.of(5), Optional.of(LambdaRunner.biFunction(LambdaDemo.length, "12798")));
    }

    @Test
    public void testFirstChar(){
        Assert.assertEquals(Optional.of('c'), Optional.of(LambdaRunner.biFunction(LambdaDemo.firstChar, "cafe")));
        Assert.assertNull(LambdaRunner.biFunction(LambdaDemo.firstChar, ""));
        Assert.assertNull(LambdaRunner.biFunction(LambdaDemo.firstChar, null));
    }

    @Test
    public void testIsNotOpenSpace(){
        Assert.assertFalse(LambdaRunner.biFunction(LambdaDemo.isNotOpenSpace, "ab a"));
    }

    @Test
    public void testAmountOfWords(){
        Assert.assertEquals(Optional.of(3), Optional.of(LambdaRunner.biFunction(LambdaDemo.amountOfWords, "a,b,c")));
        Assert.assertEquals(Optional.of(3), Optional.of(LambdaRunner.biFunction(LambdaDemo.amountOfWords, "a,,,,b,,,,,c")));
        Assert.assertEquals(Optional.of(3), Optional.of(LambdaRunner.biFunction(LambdaDemo.amountOfWords, ",,a,,,,b,,,,,c")));
        Assert.assertEquals(Optional.of(4), Optional.of(LambdaRunner.biFunction(LambdaDemo.amountOfWords, "a, ,,,b,,,,,c,")));
    }

    @Test
    public void testGetAge(){
        Assert.assertEquals(Optional.of(5), Optional.of(LambdaRunner.biFunction(LambdaDemo.getAge, new Human("a", "a", "a", 5))));
    }

    @Test
    public void testTheSameLastName(){
        Assert.assertTrue(LambdaRunner.threeFunction(LambdaDemo.theSameLastName, new Human("lastName", "name", "middleName", 19),
                new Human("lastName", "name", "middleName", 6)));
    }

    @Test
    public void testGetFIO(){
        Assert.assertEquals("a a a", LambdaRunner.biFunction(LambdaDemo.getFIO, new Human("a", "a", "a", 7)));
    }

    @Test
    public void testMakePersonOlder(){
        Assert.assertEquals(new Human("a", "a", "a", 8),
                LambdaRunner.biFunction(LambdaDemo.makePersonOlder, new Human("a", "a", "a", 7)));
    }

    @Test
    public void testPersonsIsElderThanMaxAge(){
        Assert.assertTrue(LambdaRunner.myOperation(LambdaDemo.personsIsElderThanMaxAge, new Human("lastName1", "name1", "middleName1", 95),
                new Human("lastName2", "name2", "middleName2", 61),
                new Human("lastName3", "name3", "middleName3", 40), 100));
    }


}