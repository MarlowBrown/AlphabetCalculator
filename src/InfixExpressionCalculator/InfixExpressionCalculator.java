package InfixExpressionCalculator;

import IntegerBinaryOperator.IntegerBinaryOperator;

import java.util.List;
import java.util.Stack;

public class InfixExpressionCalculator {

    private List<Integer> listOfOperands;
    private List<IntegerBinaryOperator> listOfOperators;
    private Stack<Integer> operandStack;
    private Stack<IntegerBinaryOperator> operatorStack;

    public InfixExpressionCalculator() {

    }

    public void setOperands(List<Integer> listOfOperands) {
        this.listOfOperands = listOfOperands;
    }

    public void setListOfOperators(List<IntegerBinaryOperator> listOfOperators) {
        this.listOfOperators = listOfOperators;
    }

    public Integer getResultWithCurrentlySetOperandsAndOperators() {
        clearOperandStack();
        clearOperatorStack();
        setNewOperandStack();
        setNewOperatorStack();
        repeatArithmeticOperationOnOperandStackUntilOneItemRemains();
        return operandStack.firstElement();
    }

    private void clearOperandStack() {
        operandStack = new Stack<Integer>();
    }

    private void setNewOperandStack() {
        Stack<Integer> newOperandStack = new Stack<Integer>();
        for (int i = listOfOperands.size() - 1; i > -1; i--) {
            newOperandStack.push(listOfOperands.get(i));
        }
        operandStack = newOperandStack;
    }

    private void clearOperatorStack() {
        operatorStack = new Stack<IntegerBinaryOperator>();
    }

    private void setNewOperatorStack() {
        Stack<IntegerBinaryOperator> newOperatorStack = new Stack<IntegerBinaryOperator>();
        for (int i = listOfOperators.size() - 1; i > -1; i--) {
            newOperatorStack.push(listOfOperators.get(i));
        }
        operatorStack = newOperatorStack;
    }

    private void repeatArithmeticOperationOnOperandStackUntilOneItemRemains() {
        while (operandStack.size() != 1) {
            Integer firstOperand = operandStack.pop();
            Integer secondOperand = operandStack.pop();
            IntegerBinaryOperator operator = operatorStack.pop();
            Integer answer = operator.performOperation(firstOperand, secondOperand);
            operandStack.push(answer);
        }
    }

}
