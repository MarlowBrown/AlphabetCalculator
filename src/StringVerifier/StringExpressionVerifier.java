package StringVerifier;

public class StringExpressionVerifier extends StringVerifier{

    private String correctCharacters = "ABCDEFGHIJPSTV";

    public StringExpressionVerifier() {}

    @Override
    public boolean isStringValid(String stringToVerify) {
        for (int i = 0; i < stringToVerify.length(); i++) {
            Character currentCharacterBeingExamined = stringToVerify.charAt(i);
            if (!isCharacterInStringOfCorrectCharacters(currentCharacterBeingExamined)) {
                return false;
            }
        }
        return true;
    }

    private boolean isCharacterInStringOfCorrectCharacters(Character characterToFind) {
        return correctCharacters.indexOf(characterToFind) != -1;
    }

}
