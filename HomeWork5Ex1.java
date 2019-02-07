import java.util.Scanner;

import static java.lang.System.out;

public class HomeWork5Ex1 {

    public static void main(String[] args) {

        out.println("Input any text");
        Scanner scanner = new Scanner(System.in);
        String polinomString = scanner.nextLine();

        out.println(compareInverseString(polinomString));

    }


    public  static String compareInverseString (String workString){
        int counter = 0;
        String result;

        for (int i = 0; i < workString.length(); i++) {
            int backIndex = workString.length()-1-i;
            if (workString.charAt(backIndex) == workString.charAt(i)){
                counter ++;
            }
        }

         if (counter == workString.length()){
             result = "Input text is polynomial";
         } else {
             result = "Input text is not polynomial" ;
         }

         return  result;
    }
}
