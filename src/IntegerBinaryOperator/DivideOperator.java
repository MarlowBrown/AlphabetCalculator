package IntegerBinaryOperator;

public class DivideOperator extends IntegerBinaryOperator{

    public DivideOperator() {}

    @Override
    public int performOperation(int operand1, int operand2) {
        return operand1 / operand2;
    }
}
