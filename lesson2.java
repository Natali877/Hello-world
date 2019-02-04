
import java.util.Scanner;

import static java.lang.System.out;

public class lesson2 {
    public static void main(String[] args) {
        out.println("Please,input the first side length of first house");
        Scanner scanner = new Scanner(System.in);
        int firstSideFirstHome = scanner.nextInt();

        out.println("Please,input the second side length of first house");
        Scanner  scanner1 = new Scanner(System.in);
        int secondSideFirstHome = scanner1.nextInt();

        out.println("Please,input the first side length of second house");
        Scanner scanner2 = new Scanner(System.in);
        int firstSideSecondHome = scanner2.nextInt();

        out.println("Please,input the second side length of second house");
        Scanner  scanner3 = new Scanner(System.in);
        int secondSideSecondHome = scanner3.nextInt();

        out.println("Please,input the second side length of grounds");
        Scanner  scanner4 = new Scanner(System.in);
        int firstGroudsSide = scanner4.nextInt();

        out.println("Please,input the second side length of grounds");
        Scanner  scanner5 = new Scanner(System.in);
        int secondGroundsSide = scanner5.nextInt();

        int firstHomeSquare = firstSideFirstHome * secondSideFirstHome;
        int secondHomeSquare = firstSideSecondHome * secondSideSecondHome;
        int groundsSquare = firstGroudsSide * secondGroundsSide;

        int maxHomeSide = 0;
        int maxSide = 0;
        int minGroundsSide = 0;
        int maxHomeSquare = 0;

        maxSide = searchMax(firstSideFirstHome, secondSideFirstHome);
        maxHomeSide = searchMax(maxSide, firstSideSecondHome);
        maxSide = maxHomeSide;
        maxHomeSide = searchMax(maxSide, secondSideSecondHome);

        maxHomeSquare = searchMax(firstHomeSquare, secondHomeSquare);

        minGroundsSide = searchMin(firstGroudsSide, secondGroundsSide);

        if ((maxHomeSide > minGroundsSide) || (maxHomeSquare > (groundsSquare/2)) ) {
            out.println("These houses can't be placed on this grounds");
        }
        else {
            out.println("These houses can be placed on this grounds");
        }


    }

    public static int searchMax (int firstNumber, int secondNumber){
        int maxValue = firstNumber;
        if (maxValue < secondNumber){
            maxValue = secondNumber;
        }
        return maxValue;
    }

    public static int searchMin (int firstNumber, int secondNumber){
        int minValue = firstNumber;
        if (minValue > secondNumber){
            minValue = secondNumber;
        }
        return minValue;
    }
}
