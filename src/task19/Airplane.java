package task19;

public class Airplane {
    private String manufacturer;
    private int yearOfIssue;
    private int length;
    private int weight;
    private int fuelVolume;

    public Airplane(String manufacturer, int yearOfIssue, int length, int weight, int fuelVolume) {
        this.manufacturer = manufacturer;
        this.yearOfIssue = yearOfIssue;
        this.length = length;
        this.weight = weight;
        this.fuelVolume = 0;
    }
    public void info(){
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + yearOfIssue + ", длина: " + length + ", вес: " + weight + ", обьем топлива в баке: " + fuelVolume);
    }
    public void fillUp(int inputFuel){
        fuelVolume += inputFuel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    @Override
    public String toString() {
        return "Изготовитель: " + manufacturer + ", год выпуска: " + yearOfIssue + ", длина: " + length + ", вес: " + weight + ", обьем топлива в баке: " + fuelVolume;
    }
}
