package task26;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        File file = new File("input.txt");

        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            if (numbers.length != 10)
                throw new IllegalArgumentException();
            int sum = 0;

            for (String number : numbers){
                sum += Integer.parseInt(number);
            }

            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e ){
            System.out.println("Некорректный вход файл");
        }

    }
}
