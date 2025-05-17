package task18;

public class Test {
    public static void main(String[] args) {
        String numbers = "";

        long before = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++){
            numbers += i + " ";
        }

        long after = System.currentTimeMillis();

        System.out.println("Time:" + (after - before));

        System.out.println(numbers);

        StringBuilder sb = new StringBuilder("");

        before = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++)
            sb.append(i).append(" ");

        after = System.currentTimeMillis();

        System.out.println("Time:" + (after - before));

        System.out.println(sb);
    }
}
