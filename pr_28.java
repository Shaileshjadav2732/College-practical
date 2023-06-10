class Sphere {

    double x;
    double y;
    double z;
    double radius;

    public Sphere() {
        x = 0;
        y = 0;
        z = 0;
        radius = 1;
    }

    public Sphere(double radius) {
        x = 0;
        y = 0;
        z = 0;
        this.radius = radius;
    }

    public Sphere(double x, double y, double z, double radius) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
    }
}

 public class pr_28 {
    public static void main(String[] args) {
        Sphere sphere = new Sphere();
        
    }
    
}
