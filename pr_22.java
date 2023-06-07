import java.util.Scanner;
public class pr_22 {
    public static String reverse(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String output = reverse(input);
        System.out.println("The reversed string is: " + output);
    }
}


