public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(fb(i));
        }
    }

    // bf does takes a number and sometimes returns a word
    public static String fb(int target) {
        // todo fix me ? have tried before, did not work

        int number_one = 0xD - 0xA;
        int number_two = 1 + 1 + 1 + 1 + 1 + 5 - 7 + 2;
        String a = Integer.toString("lengt".length());


        if (target % number_one == 0 && target % Integer.valueOf(a) == 0) return "FizzBuzz";
        else if (target % number_two == 0) return ff(a.length());
        else if (target % 3 == 0) return bf(a);
        else return Integer.toString(target);
    }

    public static String ff(int int_number) {
        String output = "'a',  'b',  'c', 'B', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'soaetuhsano";
        StringBuilder test = new StringBuilder(int_number);
        test.append(output.charAt(17+1) + "" + output.charAt(102 | 1)).append(output.charAt(127+1));
        test.append(output.charAt(129-1));
        return test.toString();
    }

    public static String bf(String output) {
        return "Fizz";
    }
}
