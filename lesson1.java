package PACKAGE_NAME;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class lesson1 {
    public static void main(String[] args) {
        out.println("Input data");
        Scanner scanner = new Scanner(System.in);
        int dataM = scanner.nextInt();
        out.println("Input month");
        Scanner scanner1 = new Scanner(System.in);
        int monthM = scanner1.nextInt();
        out.println("Input year");
        Scanner scanner2 = new Scanner(System.in);
        int yearM = scanner2.nextInt();
        int dataNum = 0;
        //int addYear =0;
        int addMonth = 0;

        if ((31 < dataM || dataM < 1) || (12 < monthM || monthM < 1) || yearM < 100) {
        out.println("Uncorrected value");
        }
        else {

            dataNum = dataNumber(monthM);

            if (dataM > dataNum) {
                addMonth = dataM / dataNum;
                monthM += addMonth;
                dataM = dataM % dataNum;
            }

            //if (monthM > 12) {
            //    addYear = monthM / 12;
            //    monthM = monthM % 12;
            //}
            // yearM += addYear;

            //out.println(dataNum);
            //out.println(addYear);

            out.println(formatOutData(dataM,monthM,yearM));
        }

    }

    public static String formatOutData (int data, int month, int year) {
        String format = data + "." + month + "." + year;
        return format;
    }

    public static int dataNumber (int monthNumber){
        int dataNumber1=0;
        switch (monthNumber){
            case 1: dataNumber1=31; break;
            case 2: dataNumber1=28; break;
            case 3: dataNumber1=31; break;
            case 4: dataNumber1=30; break;
            case 5: dataNumber1=31; break;
            case 6: dataNumber1=30; break;
            case 7: dataNumber1=31; break;
            case 8: dataNumber1=31; break;
            case 9: dataNumber1=30; break;
            case 10: dataNumber1=31; break;
            case 11: dataNumber1=30; break;
            case 12: dataNumber1=31; break;
        }
        return dataNumber1;
    }
}
