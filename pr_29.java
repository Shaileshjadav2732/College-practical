 class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

   double area() {
    return Math.PI * radius * radius;
}

}

class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    double area() {
        double circleArea = super.area();
        return 2 * circleArea + 2 * Math.PI * radius * height;
    }
}

public class pr_29 {
    public static void main(String[] args) {
        Circle circle = new Circle(27);
        System.out.println("Area of circle: " + circle.area());

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("Surface area of cylinder: " + cylinder.area());
    }
}
