package task16;

public class Test {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("ABS", 1978, 74, 500, 55);
        Airplane airplane2 = new Airplane("МТА", 1985, 54, 550, 70);

        Airplane.compareAirplane(airplane1, airplane2);
    }
}
