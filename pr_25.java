class Complex {
    double real;
    double imag;

    public Complex(double r, double i) {
        real = r;
        imag = i;
    }

    public Complex add(Complex c) {
        return new Complex(real + c.real, imag + c.imag);
    }

    public boolean equals(Complex c) {
        return (real == c.real && imag == c.imag);
    }
}

public class pr_25 {
    public static void main(String[] args) {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);

        Complex sum = c1.add(c2);
        System.out.println("Sum of " + c1.real + "+" + c1.imag + "i and " + c2.real + "+" + c2.imag + "i is " + sum.real
                + "+" + sum.imag + "i");

        if (c1.equals(c2)) {
            System.out.println(c1.real + "+" + c1.imag + "i is equal to " + c2.real + "+" + c2.imag + "i");
        } else {
            System.out.println(c1.real + "+" + c1.imag + "i is not equal to " + c2.real + "+" + c2.imag + "i");
        }
    }
}
