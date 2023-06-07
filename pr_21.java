public class pr_21 {
    public static double average(String[] array) {
        double sum = 0;
        for (String s : array) {
            sum += Double.parseDouble(s);
        }
        return sum / array.length;
    }
    public static void main(String[] args) {   
        String[] numbers = {"2.6", "2.7", "4.7", "3.6"};
        double result = average(numbers);
        System.out.println("The average is: " + result);
    }
}

