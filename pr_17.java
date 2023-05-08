public class pr_17 {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Please provide as a command line argument");
            return;
        }
        String inputstring=args[0];
        int length=inputstring.length();
        if(length<=10){
            System.out.println("The input string is less than or equal to 10 characters");
            System.out.println("Input String: "+inputstring);
            return;
        }
        String lastTenCharacters=inputstring.substring(length-10);
        System.out.println("Last Ten Characters: "+lastTenCharacters);
    }
}
