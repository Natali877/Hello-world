import java.util.Arrays;
import static java.lang.System.out;

public class HomeWork4Ex1 {

    public static void main(String[] args) {

      final int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9};

      int[] workMassive = value;

      rightSlide(value);

      out.println(Arrays.toString(workMassive));
    }

    public static void rightSlide (int[] source){
        int lastNumber = source[source.length-1];
        for (int i = source.length-1; i > 0; i--) {
           int ii = i - 1;
            int valueMassive = source [ii];
            source[i] = valueMassive;
        }
        source[0] = lastNumber;
    }


}
