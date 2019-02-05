import java.util.Arrays;
import static java.lang.System.out;

public class HomeWork4Ex3 {

    public static void main(String[] args) {

        int[] firstMassive = new int [] {1, 2, 3, 4, 5};
        int[] secondMassive = new int [] {5, 6, 7};
        int[] sumMas = new int[firstMassive.length + secondMassive.length];

        if (firstMassive.length < secondMassive.length){
           sumMas = sumMassive(firstMassive, secondMassive);
        } else {
           sumMas = sumMassive(secondMassive, firstMassive);
        }

        System.out.println(Arrays.toString(sumMas));


    }

    public static int[] sumMassive (int[] minMassive, int[] maxMassive){

        int lengthSumMassive = minMassive.length + maxMassive.length;
        int[] sumMassive = new int[lengthSumMassive];
        int exceptLength = maxMassive.length;
        int jointLength = minMassive.length;

        for (int i = 0; i < jointLength; i++){
            int j = i * 2;
            sumMassive[j]= maxMassive [i];
            sumMassive[j + 1] = minMassive [i];
        }

        for (int i = 0; i < exceptLength-jointLength; i++) {
            int j = jointLength * 2 + i;
            sumMassive[j] = maxMassive[jointLength+i];
        }

        return sumMassive;
    }
}
