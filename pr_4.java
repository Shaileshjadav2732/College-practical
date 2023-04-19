import java.util.Scanner;

public class pr_4 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==2)
            System.out.println("Number is Prime");
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("The number is Non prime");
                break;
            } else {
                System.out.println("The number is Prime");
                break;
            }
        }
    }
}



