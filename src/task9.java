import java.util.Random;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        int[] array = new int[100];

        Random random = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10000);

        int max = 0;
        for (int element : array){
            if (element > max )
                max = element;
        }
            System.out.println(max);
        int min = 10000;
        for (int element : array){
            if (element < min)
                min = element;
        }

        }
    }
}
