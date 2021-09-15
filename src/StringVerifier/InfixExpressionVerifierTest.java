package StringVerifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfixExpressionVerifierTest {

    private InfixExpressionVerifier verifier = new InfixExpressionVerifier();

    @Test
    void testIsStringValid1() {
        String validInfixString = "130+22";
        boolean result = verifier.isStringValid(validInfixString);
        assertTrue(result);
    }

    @Test
    void testIsStringValid2() {
        String validInfixString = "2+3-4*5/6";
        assertTrue(verifier.isStringValid(validInfixString));
    }

    @Test
    void testIsStringValid3() {
        String invalidInfixString = "2+2+2+2+2++";
        assertFalse(verifier.isStringValid(invalidInfixString));
    }

    @Test
    void testIsStringValid4() {
        String invalidInfixString = "++2+3-4*5/6";
        assertFalse(verifier.isStringValid(invalidInfixString));
    }

}