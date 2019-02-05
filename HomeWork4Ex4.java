import java.util.Arrays;

public class HomeWork4Ex4 {

    public static void main(String[] args) {

        int[][] massive = new int [][] {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {9, 8, 7, 6, 5}
        };

        int[] sumMas = new int[massive.length * massive[0].length];

        sumMas = sumMassive(massive);

        System.out.println(Arrays.toString(sumMas));

    }

    public static int[] sumMassive (int[][] minMassive){

        int lengthSumMassive = minMassive.length * minMassive[0].length;
        int[] sumMassive = new int[lengthSumMassive];
        //int exceptLength = maxMassive.length;
        //int jointLength = minMassive.length;

        for (int i = 0; i < minMassive.length; i++){
            for (int j = 0; j < minMassive[i].length; j++){
               int position = minMassive[i] .length * i;
               sumMassive[position + j] = minMassive[i][j];
            }
        }

        return sumMassive;
    }
}
