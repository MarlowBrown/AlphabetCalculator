package AlphabetExpressionCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetExpressionCalculatorTest {

    @Test
    void getResultOfAlphabetExpression() throws Exception {
        String alphabet = "BDAPCC";
        AlphabetExpressionCalculator calculator = new AlphabetExpressionCalculator();
        Integer result = calculator.getResultOfAlphabetExpression(alphabet);
        assertTrue(result == 152);
    }
}