package no.hvl.dat102.innlevering2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParentesSjekkerTest {

    @Test
    public void testKorrektParenteser() {
        ParentesSjekker sjekker = new ParentesSjekker();
        
        assertTrue(sjekker.sjekkParenteser("{ [ ( ) ] }"));
        assertTrue(sjekker.sjekkParenteser("{ [ ( ) ] }"));
        assertTrue(sjekker.sjekkParenteser("class HelloWorld { public static void main(String[] args) { System.out.println(\"Hello World!\"); }}"));
    }

    @Test
    public void testFeilParenteser() {
        ParentesSjekker sjekker = new ParentesSjekker();
        
       assertFalse(sjekker.sjekkParenteser("{ [ ( ) }"));
       assertFalse(sjekker.sjekkParenteser("[ ( ) ] }"));
       assertFalse(sjekker.sjekkParenteser("{ [ ( ] ) }"));
    }
}
