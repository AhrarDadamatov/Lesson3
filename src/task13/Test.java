package task13;

public class Test {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2020, " BMW", "Black");
        System.out.println(motorbike.getModel() + "\n " +motorbike.getColor() + "\n " + motorbike.getYear() + "\n ");
        motorbike.info();

        System.out.println(motorbike.yearDiff(2007));
    }
}
