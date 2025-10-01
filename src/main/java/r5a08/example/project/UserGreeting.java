package r5a08.example.project;
public class UserGreeting {

    public String formatGreeting(String nom) throws UserGreetingFailureException {
        // Vérification des conditions
        if (nom == null || nom.isEmpty()) {
            throw new UserGreetingFailureException("Le nom ne doit pas être vide");
        }
        if (nom.length() > 10) {
            throw new UserGreetingFailureException("Le nom ne doit pas dépasser 10 caractères");
        }
        if (!nom.matches("[a-zA-Z]+")) {
            throw new UserGreetingFailureException("Le nom ne doit contenir que des lettres");
        }

        return "Bonjour, " + nom;
    }
    // je suis present test
}


