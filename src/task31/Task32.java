package task31;

public class Task32 {
    public static void main(String[] args) {
        System.out.println(count7(753476577));
    }
    public static int count7(int number){
        if (number == 0)
            return 0;

        if (number % 10 == 7)
            return 1 + count7(number / 10);
        else
            return count7(number / 10);

    }
}
