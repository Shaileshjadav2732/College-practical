class Sphere {
    double radius;
    double x;
    double y;
    double z;

    public Sphere(double r, double x, double y, double z) {
        radius = r;
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class pr_26 {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5.0, 1.0, 2.0, 3.0);

        
        System.out.println("Sphere radius: " + sphere.radius);
        System.out.println("Sphere center coordinates: (" + sphere.x + ", " + sphere.y + ", " + sphere.z + ")");
    }
}
