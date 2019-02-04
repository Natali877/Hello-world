import java.util.Scanner;

import static java.lang.System.out;
//делали в классе
public class HomeWork3Ex1 {

    public static void main(String[] args) {

        out.println("Input value");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int result = 0;

        while ((value / 10 != 0) || (value  % 10 != 0)) {
            result += value % 10;
            value /= 10;
        }
        System.out.println(result);
    }
   ;
}
