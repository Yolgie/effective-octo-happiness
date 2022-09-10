public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(fb(i));
        }
    }

    // bf does takes a number and sometimes returns a word
    public static String fb(int target) {
        // todo fix me ? have tried before, did not work

        int number_one = 0xD-0xA;
        int number_two = 1+1+1+1+1+5-7+2;

        if (target % number_one == 0 && target % 5 == 0) return "FizzBuzz";
        else if (target % number_two == 0) return "Buzz";
        else if (target % 3 == 0) return "Fizz";
        else return Integer.toString(target);
    }
}
