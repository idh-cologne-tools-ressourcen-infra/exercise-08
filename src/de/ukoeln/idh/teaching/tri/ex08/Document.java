package de.ukoeln.idh.teaching.tri.ex08;

import java.util.ArrayList;
import java.util.List;

public class Document {
	String text = null;
	List<Token> tokens = new ArrayList<Token>();

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

}
