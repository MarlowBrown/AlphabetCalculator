package ImportantHashMaps;

import java.util.HashMap;

public class OperandSymbolHashMap {

    private HashMap<Character, Character> operandSymbolHashMap;

    public OperandSymbolHashMap() {
        initializeOperandSymbolHashMap();
    }

    private void initializeOperandSymbolHashMap() {
        operandSymbolHashMap = new HashMap<>();
        operandSymbolHashMap.put('A', '0');
        operandSymbolHashMap.put('B', '1');
        operandSymbolHashMap.put('C', '2');
        operandSymbolHashMap.put('D', '3');
        operandSymbolHashMap.put('E', '4');
        operandSymbolHashMap.put('F', '5');
        operandSymbolHashMap.put('G', '6');
        operandSymbolHashMap.put('H', '7');
        operandSymbolHashMap.put('I', '8');
        operandSymbolHashMap.put('J', '9');
    }

    public Character getOperandSymbolFromCharacterSymbol(Character character) {
        if (isOperandInHashMap(character)) {
            return operandSymbolHashMap.get(character);
        }
        throw new IllegalArgumentException("Symbol representing operand is not in hashmap");
    }

    private boolean isOperandInHashMap(Character character) {
        return operandSymbolHashMap.containsKey(character);
    }

}
