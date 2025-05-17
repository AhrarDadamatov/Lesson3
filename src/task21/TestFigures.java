package task21;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Black", 5, 12, 10),
                new Triangle("Green", 6, 5, 45),
                new Rectangle(5, 10, "Red"),
                new Rectangle(10, 10, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Blue"),
                new Circle(6, "Red")


        };
        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));

    }

    public static double calculateRedPerimeter(Figure[] figures){
        double sum = 0;
        for (Figure figure : figures){
            if (figure.getColor().equals("Red"))
                sum += figure.perimeter();
        }
        return sum;

    }
    public static double calculateRedArea(Figure[] figures){
        double sum = 0;
        for (Figure figure : figures){
            if (figure.getColor().equals("Red"))
                sum += figure.perimeter();
        }
        return sum;

    }
}
