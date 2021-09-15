package InfixExpressionCalculator;

import IntegerBinaryOperator.IntegerBinaryOperator;
import IntegerBinaryOperator.AdditionOperator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InfixExpressionCalculatorTest {

    private InfixExpressionCalculator calculator = new InfixExpressionCalculator();

    @BeforeEach
    void setUp() {
        calculator.setOperands(getListOfOperands());
        calculator.setListOfOperators(getListOfOperators());
    }

    private List<Integer> getListOfOperands() {
        List<Integer> operands = new ArrayList<>();
        operands.add(130);
        operands.add(22);
        return operands;
    }

    private List<IntegerBinaryOperator> getListOfOperators() {
        List<IntegerBinaryOperator> operators = new ArrayList<IntegerBinaryOperator>();
        operators.add(new AdditionOperator());
        return operators;
    }

    @Test
    void testGetResultWithCurrentlySetOperandsAndOperators() {
        Integer result = calculator.getResultWithCurrentlySetOperandsAndOperators();
        assertTrue(result == 152);
    }

}