package task13;

public class Motorbike {
    private int year;
    private String model;
    private String color;

    public Motorbike(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
    public void info(){
        System.out.println("Это мотоцикл");
    }
    public int yearDiff(int inputYear){
       return inputYear - year;
    }
}
