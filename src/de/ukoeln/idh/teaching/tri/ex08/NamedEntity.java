package de.ukoeln.idh.teaching.tri.ex08;


import java.util.ArrayList;
import java.util.List;

public class NamedEntity {
    private List<NEToken> tokens;

    public NamedEntity() {
        this.tokens = new ArrayList<>();
    }

    public List<NEToken> getTokens() {
        return tokens;
    }
}
