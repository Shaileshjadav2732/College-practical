public class pr_1 {
    public static void main(String[] args) {
       if (args.length > 0) {
            String name = args[0];
            String[] nameParts = name.split(" ");
            String firstName = nameParts[0];
            String secondName = nameParts[1];
            String lastName = nameParts[2];

            System.out.println("First Name : " + firstName);
            System.out.println("Second Name : " + secondName);
            System.out.println("Last Name : " + lastName);

        }

    }
}