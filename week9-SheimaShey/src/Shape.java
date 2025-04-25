import java.sql.SQLOutput;

public abstract class Shape {
    private String color = "vhite";

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double perimeter();

    public abstract double area();

    @Override
    public String toString() {
        System.out.println("");
    }
}