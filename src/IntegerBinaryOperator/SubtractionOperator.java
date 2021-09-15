package IntegerBinaryOperator;

public class SubtractionOperator extends IntegerBinaryOperator{

    public SubtractionOperator() {}

    @Override
    public int performOperation(int operand1, int operand2) {
        return operand1 - operand2;
    }
}
