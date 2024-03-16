package laba2.Example6;

public class Parallelogram implements Shape{
    private double sideA;
    private double sideB;
    private double height;

    public Parallelogram(double sideA, double sideB, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return sideA * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (sideA + sideB);
    }
}
