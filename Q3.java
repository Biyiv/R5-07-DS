// Fichier : Q3.java
// Auteur : Hay Baptiste
public class Q3 {
    public static void main(String[] args) {
        // Vérifiez que le nombre d'étoiles est fourni en paramètre
        if (args.length < 1) {
            System.out.println("Veuillez fournir le nombre d'étoiles en paramètre.");
            return;
        }

        try {
            // Convertir le paramètre en entier
            int nbEtoiles = Integer.parseInt(args[0]);
            
            // Afficher la ligne d'étoiles
            for (int i = 0; i < nbEtoiles; i++) {
                System.out.print("*");
            }

        } catch (NumberFormatException e) {
            System.out.println("Le paramètre doit être un entier valide.");
        }
    }
}
