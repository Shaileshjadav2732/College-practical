import java.util.Scanner;

public class pr_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter raw ");
        int raw = sc.nextInt();
        System.out.println("Enter column");
        int col = sc.nextInt();

        int[][] array = new int[raw][col];
        System.out.println("Enter data");
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int[] row : array) {
            for (int element : row) {
                sum += element;
            }
        }
        System.out.println("The sum of data is " + sum);
    }
}

