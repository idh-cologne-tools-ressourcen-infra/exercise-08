package de.ukoeln.idh.teaching.tri.ex08;

import java.util.ArrayList;
import java.util.List;

public class Document {
	String text = null;
	List<Token> tokens = new ArrayList<Token>();
	List<NamedEntity> entities = new ArrayList<NamedEntity>();


	public static void main(String[] args) {
        Document document = new Document();
        document.setText("The dog is fed by Mr. Parker, who wears a yellow hat.");
        document.getTokens().add(new Token(document, 0, 3, "dt", "the"));
        document.getTokens().add(new Token(document, 4, 7, "nn", "dog"));
        document.getTokens().add(new Token(document, 8, 10, "vbz", "be"));
        document.getTokens().add(new Token(document, 11, 14, "vbd", "feed"));
        document.getTokens().add(new Token(document, 15, 17, "in", "by"));
        document.getTokens().add(new Token(document, 18, 21, "nnp", "mister"));
        document.getTokens().add(new Token(document, 22, 28, "nnp", "parker"));
        document.getTokens().add(new Token(document, 28, 29, "punct", ","));
        document.getTokens().add(new Token(document, 30, 33, "wp", "who"));
        document.getTokens().add(new Token(document, 34, 39, "vbz", "wear"));
        document.getTokens().add(new Token(document, 40, 41, "dt", "a"));
        document.getTokens().add(new Token(document, 42, 48, "jj", "yellow"));
        document.getTokens().add(new Token(document, 49, 52, "nn", "hat"));
        document.getTokens().add(new Token(document, 52, 53, "punct", "."));
        
        document.getTokens().get(0).setGov(document.getTokens().get(1),"det");
        document.getTokens().get(1).setGov(document.getTokens().get(3),"nsubj");
        document.getTokens().get(2).setGov(document.getTokens().get(3),"auxpass");
        document.getTokens().get(3).setGov(null, null);
        document.getTokens().get(4).setGov(document.getTokens().get(3),"prep");
        document.getTokens().get(5).setGov(document.getTokens().get(6),"compound");
        document.getTokens().get(6).setGov(document.getTokens().get(3),"obl");
        document.getTokens().get(7).setGov(document.getTokens().get(6),"punct");
        document.getTokens().get(8).setGov(document.getTokens().get(9),"nusbj");
        document.getTokens().get(9).setGov(document.getTokens().get(6),"acl");
        document.getTokens().get(10).setGov(document.getTokens().get(12),"det");
        document.getTokens().get(11).setGov(document.getTokens().get(12),"amod");
        document.getTokens().get(12).setGov(document.getTokens().get(9),"obj"); 
        document.getTokens().get(13).setGov(document.getTokens().get(3),"punct");
        
    	document.getEntities().add(new NamedEntity(document.getTokens().get(6), "person", 0.9f));

    	
    	
    for (int i = 0; i < 14; i++) {
    	System.out.print(document.getTokens().get(i)+":  ");
    	System.out.print(document.getTokens().get(i).getGovernor()+ " - ");
    	System.out.println(document.getTokens().get(i).getRelation());
    }
    
    
    }

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<Token> getTokens() {
		return tokens;
	}

	public void setTokens(List<Token> tokens) {
		this.tokens = tokens;
	}
	
	public List<NamedEntity> getEntities(){
		return entities;
	}

}
