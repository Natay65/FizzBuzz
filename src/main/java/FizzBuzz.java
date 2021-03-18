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
        if (7 == num)
        {
            return "Seve";
        }

        return String.valueOf(num);
    }
}
