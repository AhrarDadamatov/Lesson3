package task12;

public class Car {
    private int carYear;
    private String carModel;
    private String carColor;

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDiff(int inputYear){
        return inputYear - carYear;
    }
}
