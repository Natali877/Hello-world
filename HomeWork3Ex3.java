import java.util.Scanner;

import static java.lang.System.out;

public class HomeWork3Ex3 {
    public static void main(String[] args) {

        out.println("Input the number of days");
        Scanner scanner = new Scanner(System.in);
        int theNumberOfDays = scanner.nextInt();
        int rainfall = 0;
        int sumRainfall = 0;
        int maxRainfall = 0;
        int middleRainfall = 0;

        for (int i = 1; i <= theNumberOfDays; i++) {
            out.println("Enter rainfall of " + i + " day");
            Scanner scanner1 = new Scanner(System.in);
            rainfall = scanner1.nextInt();
            sumRainfall += rainfall;
            maxRainfall= lesson2.searchMax(maxRainfall, rainfall);
        }

        middleRainfall = sumRainfall / theNumberOfDays;
        out.println("The middle rainfall of " + theNumberOfDays + " days is " + middleRainfall);
        out.println("The summ rainfall of " + theNumberOfDays + " days is " + sumRainfall);
        out.println("The max rainfall of " + theNumberOfDays + " days is " + maxRainfall);

    }
}
