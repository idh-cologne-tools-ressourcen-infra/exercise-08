package de.ukoeln.idh.teaching.tri.ex08;

import java.util.ArrayList;
import java.util.List;

public class Document {
	String text = null;
	List<Token> tokens = new ArrayList<Token>();
	List<NamedEntity> namedEntities = new ArrayList<NamedEntity>();

	public static void main(String[] args) {
		Document document = new Document();
		document.setText("The dog is fed by Mr. Parker, who wears a yellow hat.");
		document.getTokens().add(new Token(document, 0, 3, "dt", "the", "det"));
		document.getTokens().add(new Token(document, 4, 7, "nn", "dog", "nsubj"));
		document.getTokens().add(new Token(document, 8, 10, "vbz", "be", null));
		document.getTokens().add(new Token(document, 11, 14, "vbd", "feed", "pred"));
		document.getTokens().add(new Token(document, 15, 17, "in", "by", "comp"));
		document.getTokens().add(new Token(document, 18, 21, "nnp", "mister", "obj"));
		document.getTokens().add(new Token(document, 22, 28, "nnp", "parker", "obj"));
		document.getTokens().add(new Token(document, 28, 29, "punct", ",", ""));
		document.getTokens().add(new Token(document, 30, 33, "wp", "who", "appos"));
		document.getTokens().add(new Token(document, 34, 39, "vbz", "wear", "pred"));
		document.getTokens().add(new Token(document, 40, 41, "dt", "a", "det"));
		document.getTokens().add(new Token(document, 42, 48, "jj", "yellow", "det"));
		document.getTokens().add(new Token(document, 49, 52, "nn", "hat", "obj"));
		document.getTokens().add(new Token(document, 52, 53, "punct", ".", ""));
		
		for(Token result: document.getTokens()) {
			if(result.getBegin()==18 && result.getBegin()==22) {
				document.getNamedEntities().add(new NamedEntity(result, "person", 1));
			}
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
	
	public List<NamedEntity> getNamedEntities(){
		return namedEntities;
	}

	public void setTokens(List<Token> tokens) {
		this.tokens = tokens;
	}
	
	public void setNamedEntities(List<NamedEntity> ne) {
		this.namedEntities = ne;
	}

}
