import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int i = a + 1;
        while (i < b){
            if (i % 5 == 0 && i % 10 != 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
