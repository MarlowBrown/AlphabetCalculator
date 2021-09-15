package CharacterVerifier;

public class OperatorVerifier extends CharacterVerifier{

    private String validCharacters = "+-*/";

    public OperatorVerifier() {}

    @Override
    public boolean isValid(Character characterToVerify) {
        return validCharacters.indexOf(characterToVerify) != -1;
    }

}
