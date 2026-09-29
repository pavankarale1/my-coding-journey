package in.pavan.Overridding.Shape;

public class Main {
    static void main(String[] args) {

        Shape shape =new Shape();
        shape.calculateArea();

        Rectangle rectangle = new Rectangle();
        System.out.println("Arera of rectangle is : "+rectangle.calculateArea());

        Triangle triangle = new Triangle();
        System.out.println("Area of triangle is : "+triangle.calculateArea());

        Circle circle = new Circle();
        System.out.println("Area of Circle is : "+circle.calculateArea());
    }
}
