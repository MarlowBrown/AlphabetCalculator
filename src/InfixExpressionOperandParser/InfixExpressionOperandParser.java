package InfixExpressionOperandParser;

import InfixExpressionSpliter.InfixExpressionSpliter;

import java.util.ArrayList;
import java.util.List;

public class InfixExpressionOperandParser {

    private List<Integer> operandsInInfixExpression;
    private List<String> elementsInInfixExpression;
    private String infixExpressionToParse;

    public InfixExpressionOperandParser() {
        operandsInInfixExpression = new ArrayList<>();
    }

    public List<Integer> getListOfOperandsInInfixExpression(String infixExpression) {
        clearCurrentSavedListOfOperands();
        setInfixExpressionToParse(infixExpression);
        setElementsInInfixExpression();
        populateOperandsList();
        return operandsInInfixExpression;
    }

    private void clearCurrentSavedListOfOperands() {
        operandsInInfixExpression.clear();
    }

    private void setInfixExpressionToParse(String infixExpressionToParse) {
        this.infixExpressionToParse = infixExpressionToParse;
    }

    private void setElementsInInfixExpression() {
        InfixExpressionSpliter splitter = new InfixExpressionSpliter();
        elementsInInfixExpression = splitter.getElementsOfInfixOperationFromExpression(infixExpressionToParse);
    }

    private void populateOperandsList() {
        for (int i = 0; i < elementsInInfixExpression.size(); i+= 2) {
            operandsInInfixExpression.add(getOperandAtIndexInElementsListAsInteger(i));
        }
    }

    private Integer getOperandAtIndexInElementsListAsInteger(int index) {
        return Integer.parseInt(elementsInInfixExpression.get(index));
    }

}
