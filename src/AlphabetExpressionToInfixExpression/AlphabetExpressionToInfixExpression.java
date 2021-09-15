package AlphabetExpressionToInfixExpression;

import CharacterVerifier.OperandVerifier;
import ImportantHashMaps.OperandSymbolHashMap;
import ImportantHashMaps.OperatorSymbolHashMap;

public class AlphabetExpressionToInfixExpression {

    private String alphabetExpression;
    private OperandSymbolHashMap operandSymbolHashMap;
    private OperatorSymbolHashMap operatorSymbolHashMap;
    private StringBuilder infixExpressionBuilder;
    private final int capacityOfStringBuilder = 999;

    public AlphabetExpressionToInfixExpression() {
        operandSymbolHashMap = new OperandSymbolHashMap();
        operatorSymbolHashMap = new OperatorSymbolHashMap();
        infixExpressionBuilder = new StringBuilder(capacityOfStringBuilder);
    }

    public String convertAlphabetExpressionToInfixExpression(String alphabetExpression) {
        clearCurrentInfixExpression();
        setAlphabetExpression(alphabetExpression);
        parseAllCharactersInAlphabetExpression();
        return infixExpressionBuilder.toString();
    }

    private void clearCurrentInfixExpression() {
        this.infixExpressionBuilder = new StringBuilder(capacityOfStringBuilder);
    }

    private void setAlphabetExpression(String alphabetExpression) {
        this.alphabetExpression = alphabetExpression;
    }

    private void parseAllCharactersInAlphabetExpression() {
        for (int i = 0; i < alphabetExpression.length(); i++) {
            Character characterBeingExamined = alphabetExpression.charAt(i);
            if (isCharacterAnOperand(characterBeingExamined)) {
                addOperandCharacterToInfixExpression(characterBeingExamined);
            } else {
                addOperatorCharacterToInfixExpression(characterBeingExamined);
            }
        }
    }

    private boolean isCharacterAnOperand(Character characterToCheck) {
        OperandVerifier operandVerifier = new OperandVerifier();
        return operandVerifier.isValid(characterToCheck);
    }

    private void addOperandCharacterToInfixExpression(Character operandCharacter) {
        Character operandCharacterAsNumber = convertCharacterToOperandSymbol(operandCharacter);
        infixExpressionBuilder.append(operandCharacterAsNumber);
    }

    private Character convertCharacterToOperandSymbol(Character operandCharacter) {
        return this.operandSymbolHashMap.getOperandSymbolFromCharacterSymbol(operandCharacter);
    }

    private void addOperatorCharacterToInfixExpression(Character operatorCharacter) {
        Character operatorCharacterAsOperatorSymbol = convertCharacterToOperatorSymbol(operatorCharacter);
        infixExpressionBuilder.append(operatorCharacterAsOperatorSymbol);
    }

    private Character convertCharacterToOperatorSymbol(Character operatorSymbol) {
        return this.operatorSymbolHashMap.getOperatorSymbolFromCharacterSymbol(operatorSymbol);
    }

}
