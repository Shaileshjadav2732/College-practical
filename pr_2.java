import java.util.Scanner;

public class pr_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        if (j % 2 == 0)
            System.out.println("The number is Even");
        else
            System.out.println("The number is odd");
    }
}