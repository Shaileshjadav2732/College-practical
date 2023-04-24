import java.util.Scanner;

public class pr_13 {
    public static void main(String[] args) {
        int key;
        
        Scanner sc = new Scanner(System.in);
        key = sc.nextInt();
        int[] array = { 10, 20, 30, 40, 50, 60, 70 };
        boolean found = false;

        for (int b : array) {
            if (b == key) {
                found = true;
                    break;
            }
        }
            if (found) 
                System.out.println("The value " + key + " found in the array");
               
            else 
                System.out.println("The value " + key + "  not found in the array");
            

        }

    }

