package de.ukoeln.idh.teaching.tri.ex08;

import java.util.ArrayList;
import java.util.List;

public class Document {
	String text = null;
	List<Token> tokens = new ArrayList<Token>();

	public static void main(String[] args) {
		Document document = new Document();
		NamedEntity nn = new NamedEntity();

		document.setText("The dog is fed by Mr. Parker, who wears a yellow hat.");
		document.getTokens().add(new Token(document, 0, 3, "dt", "the", 1));
		document.getTokens().add(new Token(document, 4, 7, "nn", "dog", 2));
		document.getTokens().add(new Token(document, 8, 10, "vbz", "be", -1));
		document.getTokens().add(new Token(document, 11, 14, "vbd", "feed", -1));
		document.getTokens().add(new Token(document, 15, 17, "in", "by", 3));
		document.getTokens().add(new Token(document, 18, 21, "nnp", "mister", 4));
		document.getTokens().add(new Token(document, 22, 28, "nnp", "parker",  4));
		document.getTokens().add(new Token(document, 28, 29, "punct", ",", -1));
		document.getTokens().add(new Token(document, 30, 33, "wp", "who", 9));
		document.getTokens().add(new Token(document, 34, 39, "vbz", "wear", -1));
		document.getTokens().add(new Token(document, 40, 41, "dt", "a", 9));
		document.getTokens().add(new Token(document, 42, 48, "jj", "yellow", 12));
		document.getTokens().add(new Token(document, 49, 52, "nn", "hat", 9));
		document.getTokens().add(new Token(document, 52, 53, "punct", ".", -1));

		System.out.println("The governor is: " + document.getTokens().get(1).getGovernor());

		for(Token token : document.getTokens()){
			if(token.getPos().equals("nnp")){
				nn.getTokens().add(new NEToken(token, "person"));
			}

		}

		System.out.println(nn.getTokens().get(0).getNeToken().toString());
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
