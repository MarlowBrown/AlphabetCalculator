package InfixExpressionOperandParser;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InfixExpressionOperandParserTest {

    @Test
    void testGetListOfOperandsInInfixExpression() {
        InfixExpressionOperandParser parser = new InfixExpressionOperandParser();
        String infixExpression = "130+22";
        List<Integer> parsedOperands = parser.getListOfOperandsInInfixExpression(infixExpression);
        assertTrue(parsedOperands.equals(getExpectedResultsList()));
    }

    private List<Integer> getExpectedResultsList() {
        List<Integer> listOfExpectedResults = new ArrayList<>();
        listOfExpectedResults.add(130);
        listOfExpectedResults.add(22);
        return listOfExpectedResults;
    }

}