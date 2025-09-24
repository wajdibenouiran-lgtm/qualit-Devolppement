package r5a08.example.project;

import org.junit.jupiter.api.Test;

public class UserGreetingtest {
    @Test
    public void when_titi_povided_sould_retrun_correct_greeting(){
        // Arrange

        //Act

        String expected = "Bonjour , titi ";
        String actual = UserGreeting.formatGreeting("titi")
    }
}
