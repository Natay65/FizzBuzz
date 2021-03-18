public class FizzBuzz {
    public String check(int num) {
        if (3 == num)
        {
            return "Fizz";
        }
        if (5 == num)
        {
            return "Buzz";
        }

        return String.valueOf(num);
    }
}
