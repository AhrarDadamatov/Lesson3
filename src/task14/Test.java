package task14;

public class Test {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("ABS", 1978, 74, 500, 55);

        airplane.setYearOfIssue(2011);
        airplane.setLength(35);

        airplane.fillUp(1000);
        airplane.fillUp(5000);

        airplane.info();


    }
}
