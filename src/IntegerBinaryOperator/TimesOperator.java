package IntegerBinaryOperator;

public class TimesOperator extends IntegerBinaryOperator{

    public TimesOperator() {}

    @Override
    public int performOperation(int operand1, int operand2) {
        return operand1 * operand2;
    }
}
