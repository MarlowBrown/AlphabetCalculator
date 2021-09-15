package IntegerBinaryOperator;

public class AdditionOperator extends IntegerBinaryOperator {

    public AdditionOperator() {}

    @Override
    public int performOperation(int operand1, int operand2) {
        return operand1 + operand2;
    }
}
