package task31;

public class Task31 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 133, 1354, -13, 3134, 1334, 1234, 4341, 324};

        System.out.println(sum(numbers, 0));
    }
    public static int sum (int[] numbers, int i){
        if (i == numbers.length)
            return 0;
        return numbers[i] + sum(numbers, i + 1);

    }
}
