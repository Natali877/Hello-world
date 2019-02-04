import java.util.Scanner;

import static java.lang.System.out;

public class HomeWork3Ex2 {

    public static void main(String[] args) {
        out.println("Input value");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int count = 0;
        int firstAddend = 0;
        int secondAddend = 1;
        int numberFibonachi = 0;

        out.println("NF(" + count + ")=" + firstAddend);

     if (value > 0) {
         count++;
         out.println("NF(" + count + ")=" + secondAddend);
         while (numberFibonachi < value) {
           numberFibonachi = firstAddend + secondAddend;
           firstAddend = secondAddend;
           secondAddend = numberFibonachi;
           count++;
           out.println("NF(" + count + ")=" + numberFibonachi);
         }

     }
     else {
         count--;
         out.println("NF(" + count + ")=" + secondAddend);
         while (Math.abs(numberFibonachi) < Math.abs(value)) {
             numberFibonachi = firstAddend - secondAddend;
             firstAddend = secondAddend;
             secondAddend = numberFibonachi;
             count--;
             out.println("NF(" + count + ")=" + numberFibonachi);
         }

     }

    }
}
