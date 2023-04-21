public class pr_10{
    public static void main(String[] args) {
        int i= 0, j = 1;
        System.out.println("The first 15 numbers in the Fibonacci series are:");
        for (int k = 1; k <= 15; ++k) {
            System.out.print(i+" ");
            int sum = i + j;
            i = j;
            j = sum;
        }
    }
}

