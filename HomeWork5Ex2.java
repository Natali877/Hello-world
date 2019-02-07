import java.util.Scanner;

import static java.lang.System.out;

public class HomeWork5Ex2 {

    public static void main(String[] args) {

        out.println("Input tne number in Roman numerals");
        Scanner scanner = new Scanner(System.in);
        String romanNumber = scanner.nextLine();

        int arabNumeral = arabNumber(romanNumber);

        out.println(arabNumeral);

    }

    public static int arabNumber (String workString){

        int arabSum = 0;
        int lengthString = workString.length()-1;
        int arabPrevious = 0;

        for (int i = lengthString; 0 <= i; i--) {

            int arabNumber = 0;

            switch (workString.charAt(i)){
                case 'M': arabNumber = 1000;
                    break;
                case 'D': arabNumber = 500;
                    break;
                case 'C': arabNumber = 100;
                    break;
                case 'L': arabNumber = 50;
                    break;
                case 'X': arabNumber = 10;
                    break;
                case 'V': arabNumber = 5;
                    break;
                case 'I': arabNumber = 1;
                    break;
            }

            if (arabPrevious > arabNumber){
                arabSum -= arabNumber;
            } else {
                arabSum += arabNumber;
            }

            arabPrevious = arabNumber;
        }

        return arabSum;

    }

}
