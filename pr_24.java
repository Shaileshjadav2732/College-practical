class Circle {
    double radius;
    double PI = 3.14159;

    public Circle() {
        radius = 0;
    }

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return PI * radius * radius;
    }
}

public class pr_24{
    public static void main(String[] args) {
        Circle c = new Circle(5.27);
        System.out.println("Area of circle is " + c.area());
    }
}
