package ImportantHashMaps;

import java.util.HashMap;

public class OperatorSymbolHashMap {

    private HashMap<Character, Character> operatorSymbolHashMap;

    public OperatorSymbolHashMap() {
        initializeOperatorSymbolHashMap();
    }

    private void initializeOperatorSymbolHashMap() {
        operatorSymbolHashMap = new HashMap<>();
        operatorSymbolHashMap.put('P', '+');
        operatorSymbolHashMap.put('S', '-');
        operatorSymbolHashMap.put('T', '*');
        operatorSymbolHashMap.put('V', '/');
    }

    public Character getOperatorSymbolFromCharacterSymbol(Character character) {
        if (isOperatorInHashMap(character)) {
            return operatorSymbolHashMap.get(character);
        }
        throw new IllegalArgumentException("Symbol representing operand is not in hashmap");
    }

    private boolean isOperatorInHashMap(Character character) {
        return operatorSymbolHashMap.containsKey(character);
    }

}
