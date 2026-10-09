package bai1;

public class MainThread {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        System.out.println("Ban kinh cua hinh tron: " + circle.getRadius());
        System.out.println("Chu vi hinh tron la: " + circle.getPerimeter());
        System.out.println("Dien tich hinh tron la: " + circle.getArea());
    }
}