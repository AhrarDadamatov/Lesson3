package task12;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarColor("Yellow");
        car.setCarModel("Mercedes");
        car.setCarYear(1985);

        System.out.println("Your car " + car.getCarModel() + " model " + car.getCarYear() + " year " + car.getCarColor() + " color");
        car.info();

        System.out.println(car.yearDiff(2002));
    }
}
