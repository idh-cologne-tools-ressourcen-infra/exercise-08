package de.ukoeln.idh.teaching.tri.ex08;

public class NEToken {
    private Token neToken;
    private String type;

    public NEToken(Token neToken, String type) {
        this.neToken = neToken;
        this.type = type;
    }

    public Token getNeToken() {
        return neToken;
    }

    public String getType() {
        return type;
    }
}
