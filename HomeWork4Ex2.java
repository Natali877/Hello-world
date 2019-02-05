
import static java.lang.System.out;

public class HomeWork4Ex2 {

    public static void main(String[] args) {

        int [][] workMassive = new int[][] {
                {2, 8, 5, 4},
                {5, 9, 3, 2},
                {8, 7, 4, 6}
        };

        for (int i = 1; i < 10; i++){
           selectDouble(workMassive, i);
        }

        for (int i = 0; i < workMassive.length; i++){
            for (int j = 0; j < workMassive[i].length; j++){
                out.print(workMassive[i][j]);
            }
            out.println();
        }
    }

    public static void selectDouble (int massive [][], int findingNumber) {
        int count = 0;
        for (int i = 0; i < massive.length; i++){
            for (int j = 0; j < massive[i].length; j++){
                if (massive[i][j] == findingNumber && count != 0){
                    massive[i][j] = 0;
                } else if (massive[i][j] == findingNumber) {
                    count ++;
                }
            }
        }
    }
}
