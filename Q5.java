public class Q5 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Q5 <number_of_lines>");
            return;
        }

        try {
            int nbEtoiles = Integer.parseInt(args[0]);
            for (int i = nbEtoiles; i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("x");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer.");
        }
    }
}
