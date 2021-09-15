package ImportantHashMaps;

import IntegerBinaryOperator.AdditionOperator;
import IntegerBinaryOperator.SubtractionOperator;
import IntegerBinaryOperator.TimesOperator;
import IntegerBinaryOperator.DivideOperator;
import IntegerBinaryOperator.IntegerBinaryOperator;
import java.util.HashMap;

public class OperatorSymbolToIntegerBinaryOperatorHashMap {

    private HashMap<Character, IntegerBinaryOperator> operatorHashMap;

    public OperatorSymbolToIntegerBinaryOperatorHashMap() {
        initializeHashMapWithOperatorValues();
    }

    private void initializeHashMapWithOperatorValues() {
        operatorHashMap = new HashMap<Character, IntegerBinaryOperator>();
        operatorHashMap.put('+', new AdditionOperator());
        operatorHashMap.put('-', new SubtractionOperator());
        operatorHashMap.put('*', new TimesOperator());
        operatorHashMap.put('/', new DivideOperator());
    }

    public IntegerBinaryOperator getBinaryOperatorFromOperatorSymbol(Character character) {
        if (isOperatorInHashMap(character)) {
            return operatorHashMap.get(character);
        }
        throw new IllegalArgumentException("No Operator in hashmap matches provided symbol");
    }

    private boolean isOperatorInHashMap(Character character) {
        return operatorHashMap.containsKey(character);
    }

}
