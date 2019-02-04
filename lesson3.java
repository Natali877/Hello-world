import java.util.Scanner;

import static java.lang.System.out;
//import static  java.math;

public class lesson3 {
    public static void main(String[] args) {

        out.println("Equation has view ax2+bx+c=0. Please enter parameters: a");
        Scanner scanner = new Scanner(System.in);
        int paramA = scanner.nextInt();
        out.println("Input b");
        Scanner scanner1 = new Scanner(System.in);
        int paramB = scanner1.nextInt();
        out.println("Input c");
        Scanner scanner2 = new Scanner(System.in);
        int paramC = scanner2.nextInt();

        int solution1 = 0;
        int solution2 = 0;
        int descrimEquation = descriminant(paramA, paramB, paramC);

        if (descrimEquation < 0){
            out.println("Descriminant is negative. The equation has no solution.");
        } else if (descrimEquation == 0){
            solution1 = - paramB / (2 * paramA);
            out.println("Descriminant is zero. The equation has one solution. x = " + solution1);
        } else {
            solution1 = (- paramB + (int) Math.sqrt(descrimEquation))/ (2 * paramA);
            solution2 = (- paramB - (int) Math.sqrt(descrimEquation)) / (2 * paramA);
            out.println("Descriminant is positive. The equation has two solution. x1 = " + solution1 + "; x2 = " + solution2);
        }

    }

    public  static int descriminant (int a, int b, int c) {
        int descrim = b * b - 4 * a * c;
        return descrim;
    }
}
