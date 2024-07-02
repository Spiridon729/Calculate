import java.util.Scanner;

public class Calc {
    static Scanner s = new Scanner(System.in);

    public static String calc(String input) throws CalcEx {

        String c = null;

        String[] result = input.split(" ");
        if (result.length<3) {
            throw new CalcEx("//т.к. строка не является математической операцией");
        }
        if (result.length>4) {
            throw new CalcEx("//Т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        if (result.length==4) {
            throw new CalcEx(" ");
        }

        int x = Integer.parseInt(result[0]);
        int y = Integer.parseInt(result[2]);

        if ((0 <= x && x <= 10) && (0 <= y && y <= 10)) {

            if (input.contains("+") == true) {
                int b = x + y;
                c = Integer.toString(b);
            }
            if (input.contains("-") == true) {
                int b = x - y;
                c = Integer.toString(b);
            }
            if (input.contains("*") == true) {

                int b = x * y;
                c = Integer.toString(b);
                }
            if (input.contains("/") == true) {
                int b = x / y;
                c = Integer.toString(b);
                }
               }
            return (c);
        }

        public static void main (String[]args) throws CalcEx {
            System.out.println(calc(s.nextLine()));
        }
}