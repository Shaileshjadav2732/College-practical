
public class pr_11 {
    public static void main(String[] ar) {

        Float[] array = new Float[5];
        if (array.length < 5) {
            System.out.println("please enter 5 command line");
            return;
        }
        for (int i = 0; i <= 4; i++) {

            array[i] = Float.parseFloat(ar[i]);
        }
        System.out.println("Array Length " + array.length);
        System.out.println("Array Element");
        for(Float f : array){
            System.out.println(f);
        }
    }
}
