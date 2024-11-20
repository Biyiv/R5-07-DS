public class Q4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Q4 <number_of_lines>");
            return;
        }

        try {
            int nbEtoiles = Integer.parseInt(args[0]);
            for (int i = 1; i <= nbEtoiles; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer.");
        }
    }
}
