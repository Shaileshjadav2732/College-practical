import java.util.Scanner;
public class pr_18{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string containing five numbers separated by commas");
            String input =scanner.nextLine();
            String[] numbers = input.split(",");
            String lastnumber=numbers[numbers.length-1];
            System.out.println("The last numbers is: " + lastnumber);
    }
}