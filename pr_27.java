class Circle {
    double radius;
    double x;
    double y;

    public Circle(double r) {
        radius = r;
        x = 0.0;
        y = 0.0;
    }

    public Circle(double x, double y, double r) {
        radius = r;
        this.x = x;
        this.y = y;
    }
}

public class pr_27 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        System.out.println("Circle 1 radius: " + circle1.radius);
        System.out.println("Circle 1 center coordinates: (" + circle1.x + ", " + circle1.y + ")");

        Circle circle2 = new Circle(1.0, 2.0, 3.0);
        System.out.println("Circle 2 radius: " + circle2.radius);
        System.out.println("Circle 2 center coordinates: (" + circle2.x + ", " + circle2.y + ")");
    }
}
