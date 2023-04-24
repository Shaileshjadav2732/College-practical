public class pr_12 {
    public static void main(String[] args) {
        int sum = 0;
        byte[] bytes = { 10, 20, 30, 40 };

        for (int i = 0; i < bytes.length; i++) {
            sum += bytes[i];
        }
        System.out.println("The sum is " + sum);

    }

}
