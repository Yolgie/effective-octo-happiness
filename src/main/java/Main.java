public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(fb(i));
        }
    }

    // bf does takes a number and sometimes returns a word
    public static String fb(int target) {
        // todo fix me ? have tried before, did not work

        if (target % 3 == 0 && target % 5 == 0) return "FizzBuzz";
        else if (target % 5 == 0) return "Buzz";
        else if (target % 3 == 0) return "Fizz";
        else return Integer.toString(target);
    }
}
