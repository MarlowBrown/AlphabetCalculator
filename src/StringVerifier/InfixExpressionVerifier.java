package StringVerifier;

import InfixExpressionSpliter.InfixExpressionSpliter;

import java.util.List;

public class InfixExpressionVerifier extends StringVerifier {

    private String infixExpressionToVerify;
    private List<String> elementsOfInfixExpression;
    private boolean isExpressionCorrectlyOrdered;

    public InfixExpressionVerifier() {
        isExpressionCorrectlyOrdered = true;
    }




    @Override
    public boolean isStringValid(String stringToVerify) {
        setInfixExpressionToVerify(stringToVerify);
        setElementsOfInfixExpression();
        verifyThatInfixExpressionIsCorrectlyOrdered();
        return isExpressionCorrectlyOrdered;
    }

    private void setInfixExpressionToVerify(String infixExpressionToVerify) {
        this.infixExpressionToVerify = infixExpressionToVerify;
    }

    private void setElementsOfInfixExpression() {
        elementsOfInfixExpression = getElementsOfInfixExpression();
    }

    private List<String> getElementsOfInfixExpression() {
        InfixExpressionSpliter splitter = new InfixExpressionSpliter();
        return splitter.getElementsOfInfixOperationFromExpression(infixExpressionToVerify);
    }

    private void verifyThatInfixExpressionIsCorrectlyOrdered() {
        int currentIndexInElementsOfInfixExpressionList = 0;
        while (isExpressionCorrectlyOrdered && currentIndexInElementsOfInfixExpressionList < elementsOfInfixExpression.size()) {
            if (shouldCheckIfIndexInInfixExpressionElementsListContainsAnOperand(currentIndexInElementsOfInfixExpressionList)) {
                isExpressionCorrectlyOrdered = doesIndexInInfixExpressionElementsListContainAnOperand(currentIndexInElementsOfInfixExpressionList);
            } else {
                isExpressionCorrectlyOrdered = !doesIndexInInfixExpressionElementsListContainAnOperand(currentIndexInElementsOfInfixExpressionList);
            }
            currentIndexInElementsOfInfixExpressionList++;
        }
    }

    private boolean shouldCheckIfIndexInInfixExpressionElementsListContainsAnOperand(int index) {
        return index % 2 == 0;
    }

    private boolean doesIndexInInfixExpressionElementsListContainAnOperand(int index) {
        String elementAtIndexInElementsList = this.elementsOfInfixExpression.get(index);
        try {
            Integer.parseInt(elementAtIndexInElementsList);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
