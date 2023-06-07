public class pr_20 {
        public static void main(String[] args) { 
            for (String arg : args) {
                if (!Character.isUpperCase(arg.charAt(0))) {
                    System.out.println("Invalid argument: " + arg);
                    System.exit(1);
                }
            }
            System.out.println("All arguments are valid.");
        }
    }


