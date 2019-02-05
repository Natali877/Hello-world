import java.util.Arrays;
import static java.lang.System.out;

public class HomeWork4Ex2Char {

    public static void main(String[] args) {

        char workChar = '0';
        char[][] workMassive = new char[][] {
                {'2', '8', '5', '4'},
                {'5', '9', '3', '2'},
                {'8', '7', '4', '6'}
        };

        for (int i = 0; i < 10; i++){
            selectDouble(workMassive, workChar);
            workChar++;
        }

        for (int i = 0; i < workMassive.length; i++) {
            System.out.println(Arrays.toString(workMassive[i]));
        }
    }

    public static void selectDouble (char massive [][], char findingNumber) {
        int count = 0;
        for (int i = 0; i < massive.length; i++){
            for (int j = 0; j < massive[i].length; j++){
                if (massive[i][j] == findingNumber && count != 0){
                    massive[i][j] = ' ';
                } else if (massive[i][j] == findingNumber) {
                    count ++;
                }
            }
        }
    }
}
