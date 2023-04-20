public class pr_7 {
    public static void main(String[] ar) {

        double number1 = Double.parseDouble(ar[0]);
        String firstName = ar[1];

        if (firstName.equals("meter")) {
            double feet = 3.28 * number1;
            System.out.println(feet + " feet");
        } else if (firstName.equals("feet")) {
            double meter = number1 / 3.28;
            System.out.println(meter + " meter");

        }
    }

}

