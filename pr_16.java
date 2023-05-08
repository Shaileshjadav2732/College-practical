public class pr_16 {
    public static void main(String[] args) {
        String original="java123is234fun";
        String modified=original.replaceAll("\\d","");
        String [] StringArray=modified.split("");
        for(String str :StringArray){
            System.out.println(str);
        }
    }
}
