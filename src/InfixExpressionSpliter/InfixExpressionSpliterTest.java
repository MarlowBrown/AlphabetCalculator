package InfixExpressionSpliter;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InfixExpressionSpliterTest {

    @org.junit.jupiter.api.Test
    void testGetElementsOfInfixOperationFromExpression() {
        String infixExpression = "130+22";
        InfixExpressionSpliter spliter = new InfixExpressionSpliter();
        List<String> results = spliter.getElementsOfInfixOperationFromExpression(infixExpression);
        
        assertTrue(results == getExpectedResultList());
    }

    private List<String> getExpectedResultList() {
        List<String> expectResultList = new ArrayList<>();
        expectResultList.add("130");
        expectResultList.add("+");
        expectResultList.add("22");
        return expectResultList;
    }
    
}