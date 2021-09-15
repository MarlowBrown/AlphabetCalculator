package AlphabetExpressionCalculator;

import AlphabetExpressionToInfixExpression.AlphabetExpressionToInfixExpression;
import InfixExpressionCalculator.InfixExpressionCalculator;
import InfixExpressionOperandParser.InfixExpressionOperandParser;
import InfixExpressionOperatorParser.InfixExpressionOperatorParser;
import IntegerBinaryOperator.IntegerBinaryOperator;
import StringVerifier.InfixExpressionVerifier;
import java.util.List;

public class AlphabetExpressionCalculator {

    private InfixExpressionCalculator infixCalculator;
    private String alphabetExpression;
    private String infixExpression;

    public AlphabetExpressionCalculator() {
        infixCalculator = new InfixExpressionCalculator();
    }

    public Integer getResultOfAlphabetExpression(String alphabetExpression) throws Exception {
        setAlphabetExpression(alphabetExpression);
        convertAlphabetExpressionToInfixExpression();
        if (!canPerformCalculation(infixExpression)) {
            throw new IllegalArgumentException("Cant perform infix calculation due to illegal character configuration");
        }
        setOperandsIntoInfixCalculator();
        setOperatorsIntoInfixCalculator();
        return infixCalculator.getResultWithCurrentlySetOperandsAndOperators();
    }

    private void setAlphabetExpression(String alphabetExpression) {
        this.alphabetExpression = alphabetExpression;
    }

    private void convertAlphabetExpressionToInfixExpression() {
        AlphabetExpressionToInfixExpression converter = new AlphabetExpressionToInfixExpression();
        this.infixExpression = converter.convertAlphabetExpressionToInfixExpression(alphabetExpression);
    }

    private boolean canPerformCalculation(String infixExpression) {
        InfixExpressionVerifier infixExpressionVerifier = new InfixExpressionVerifier();
        return infixExpressionVerifier.isStringValid(infixExpression);
    }

    private void setOperandsIntoInfixCalculator() {
        infixCalculator.setOperands(getOperandsFromInfixExpression());
    }

    private List<Integer> getOperandsFromInfixExpression() {
        InfixExpressionOperandParser operandParser = new InfixExpressionOperandParser();
        return operandParser.getListOfOperandsInInfixExpression(infixExpression);
    }

    private void setOperatorsIntoInfixCalculator() {
        infixCalculator.setListOfOperators(getOperatorsFromInfixExpression());
    }

    private List<IntegerBinaryOperator> getOperatorsFromInfixExpression() {
        InfixExpressionOperatorParser operatorParser = new InfixExpressionOperatorParser();
        return operatorParser.getListOfOperatorsInInfixExpression(infixExpression);
    }

}
