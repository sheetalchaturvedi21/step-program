public class HelloWorld5 {
    public static void main(String[] args) {

        // Check if arguments are passed
        if(args.length > 0) {

            // Enhanced for loop
            for(String name : args) {
                System.out.println("Hello " + name);
            }

        } else {
            System.out.println("Hello, World!");
        }
    }
}