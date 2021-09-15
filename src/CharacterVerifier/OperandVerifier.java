package CharacterVerifier;

public class OperandVerifier extends CharacterVerifier{

    private String validCharacters = "ABCDEFGHIJ";

    public OperandVerifier() {}

    @Override
    public boolean isValid(Character characterToVerify) {
        return validCharacters.indexOf(characterToVerify) != -1;
    }

}
