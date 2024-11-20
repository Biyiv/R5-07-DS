public class Q6 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Q6 <number_of_lines>");
            return;
        }

        try {
            
            int nbEtoiles = Integer.parseInt(args[0]);
            for (int i = nbEtoiles; i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("x");
                }
                System.out.println(); // Print a newline at the end of each line
            }
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer.");
        }
    }
}
