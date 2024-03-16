package laba2.Example8;

public class Maths {
    public static void main(String[] args) {
        Circle circle = new Circle(8);
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Периметр круга: " + circle.calculatePerimeter());
        System.out.println("Диагональ круга: " + circle.calculateDiagonal());

        Square square = new Square(5);
        System.out.println("Площадь квадрата: " + square.calculateArea());
        System.out.println("Периметр квадрата: " + square.calculatePerimeter());
        System.out.println("Диагональ квадрата: " + square.calculateDiagonal());

        Triangle triangle = new Triangle(5.7,9.5,12.1);
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Периметр треугльника: " + triangle.calculatePerimeter());
    }
}
