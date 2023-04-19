import java.util.Scanner;

public class pr_5 {
    public static void main(String[] args) {
        System.out.println("Enter number of row");
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j <n; j++) {

                System.out.print("A ");
            }
            System.out.println();
        }
    }
}
