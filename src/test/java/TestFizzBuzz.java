import org.junit.Assert;
import org.junit.Test;

public class TestFizzBuzz {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testWithOne() {
        Assert.assertEquals("1", fizzBuzz.check(1));
    }

    @Test
    public void testWithTwo() {
        Assert.assertEquals("2", fizzBuzz.check(2));
    }

    @Test
    public void testWithThree() {
        Assert.assertEquals("Fizz", fizzBuzz.check(3));
    }

    @Test
    public void testWithFive() {
        Assert.assertEquals("Buzz", fizzBuzz.check(5));
    }

    @Test
    public void testWithSeven() {
        Assert.assertEquals("Seven", fizzBuzz.check(7));
    }
}
