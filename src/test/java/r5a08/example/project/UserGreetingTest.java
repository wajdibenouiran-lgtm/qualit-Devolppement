package r5a08.example.project;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserGreetingTest {

    @Test
    public void testFormatGreetingValide() throws UserGreetingFailureException {
        // Création de l'objet UserGreeting
        UserGreeting userGreeting = new UserGreeting();

        // Appel de la méthode formatGreeting
        String result = userGreeting.formatGreeting("Alice");

        // Vérification du résultat
        assertEquals("Bonjour, Alice", result);
    }
    @Test
    public void testNomVide() {
        UserGreeting userGreeting = new UserGreeting();
        // Vérification que l'exception est bien levée pour un nom vide
        Exception exception = assertThrows(Exception.class, () -> {
            userGreeting.formatGreeting("");  // Envoi d'un nom vide
        });
        // Vérification du message de l'exception
        assertEquals("Le nom ne doit pas être vide", exception.getMessage());
    }

}
