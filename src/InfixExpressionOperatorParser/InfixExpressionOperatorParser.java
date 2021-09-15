package InfixExpressionOperatorParser;

import ImportantHashMaps.OperatorSymbolToIntegerBinaryOperatorHashMap;
import InfixExpressionSpliter.InfixExpressionSpliter;
import IntegerBinaryOperator.IntegerBinaryOperator;
import java.util.ArrayList;
import java.util.List;

public class InfixExpressionOperatorParser {

    private List<IntegerBinaryOperator> operatorsInExpression;
    private List<String> elementsInInfixExpression;
    private String infixExpressionToParse;
    private OperatorSymbolToIntegerBinaryOperatorHashMap operatorSymbolHashMap;

    public InfixExpressionOperatorParser() {
        operatorsInExpression = new ArrayList<>();
        operatorSymbolHashMap = new OperatorSymbolToIntegerBinaryOperatorHashMap();
    }

    public List<IntegerBinaryOperator> getListOfOperatorsInInfixExpression(String infixExpression) {
        clearCurrentSavedListOfOperators();
        setInfixExpressionToParse(infixExpression);
        setElementsInInfixExpression();
        populateOperatorsList();
        return operatorsInExpression;
    }

    private void clearCurrentSavedListOfOperators() {
        operatorsInExpression.clear();
    }

    private void setInfixExpressionToParse(String infixExpressionToParse) {
        this.infixExpressionToParse = infixExpressionToParse;
    }

    private void setElementsInInfixExpression() {
        InfixExpressionSpliter splitter = new InfixExpressionSpliter();
        elementsInInfixExpression = splitter.getElementsOfInfixOperationFromExpression(infixExpressionToParse);
    }

    private void populateOperatorsList() {
        for (int i = 1; i < elementsInInfixExpression.size(); i+= 2) {
            operatorsInExpression.add(getOperatorAtIndexInElementsListAsInteger(i));
        }
    }

    private IntegerBinaryOperator getOperatorAtIndexInElementsListAsInteger(int index) {
        Character operatorSymbolAtIndex = elementsInInfixExpression.get(index).charAt(0);
        return operatorSymbolHashMap.getBinaryOperatorFromOperatorSymbol(operatorSymbolAtIndex);
    }

}