package InfixExpressionSpliter;

import CharacterVerifier.OperandVerifier;

import java.util.ArrayList;
import java.util.List;

public class InfixExpressionSpliter {

    private List<String> elementsOfInfixExpression;
    private StringBuilder operandBeingBuilt;

    public InfixExpressionSpliter() {
        elementsOfInfixExpression = new ArrayList<String>();
        operandBeingBuilt = new StringBuilder();
    }

    public List<String> getElementsOfInfixOperationFromExpression(String infixExpression) {
        clearCurrentListOfElements();
        splitExpressionIntoElements(infixExpression);
        return elementsOfInfixExpression;
    }

    private void clearCurrentListOfElements() {
        elementsOfInfixExpression.clear();
    }

    private void splitExpressionIntoElements(String infixExpression) {
        for (int i = 0; i < infixExpression.length(); i++) {
            Character characterBeingParsed = infixExpression.charAt(i);
            if (isCharacterAnOperand(characterBeingParsed)) {
                addCharacterToOperandBeingBuilt(characterBeingParsed);
            } else {
                addCurrentOperandBeingBuiltToElementList();
                clearOperandBeingBuilt();
                addOperatorToElementList(characterBeingParsed);
            }
        }
        addCurrentOperandBeingBuiltToElementList();
    }

    private boolean isCharacterAnOperand(Character characterToExamine) {
        String numericCharacters = "0123456789";
        return numericCharacters.indexOf(characterToExamine) != -1;
    }

    private void addCharacterToOperandBeingBuilt(Character operandCharacter) {
        operandBeingBuilt.append(operandCharacter);
    }

    private void addCurrentOperandBeingBuiltToElementList() {
        elementsOfInfixExpression.add(operandBeingBuilt.toString());
    }

    private void clearOperandBeingBuilt() {
        operandBeingBuilt = new StringBuilder();
    }

    private void addOperatorToElementList(Character operatorSymbol) {
        String operatorSymbolAsString = new String(String.valueOf(operatorSymbol));
        elementsOfInfixExpression.add(operatorSymbolAsString);
    }

}
