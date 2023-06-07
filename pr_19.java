public class pr_19 {
        public static void main(String[] args) {
            int total = 0;
            for (String arg : args) {
                total += arg.length();
            }
            System.out.println("The total number of characters is " + total + ".");
        }
    }

