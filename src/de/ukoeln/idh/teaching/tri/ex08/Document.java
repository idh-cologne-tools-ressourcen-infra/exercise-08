package de.ukoeln.idh.teaching.tri.ex08;

import java.util.ArrayList;
import java.util.List;

public class Document {
	String text = null;
	List<Token> tokens = new ArrayList<>();

	public static void main(String[] args) {
		Document document = new Document();
		document.setText("The dog is fed by Mr. Parker, who wears a yellow hat.");
		document.getTokens().add(new Token(document, 0, 3, "dt", "the", 0));
		document.getTokens().add(new Token(document, 4, 7, "nn", "dog", 1));
		document.getTokens().add(new Token(document, 8, 10, "vbz", "be", 2));
		document.getTokens().add(new Token(document, 11, 14, "vbd", "feed", 3));
		document.getTokens().add(new Token(document, 15, 17, "in", "by", 4));
		document.getTokens().add(new Token(document, 18, 21, "nnp", "mister", 5));
		document.getTokens().add(new Token(document, 22, 28, "nnp", "parker", 6));
		document.getTokens().add(new Token(document, 28, 29, "punct", ",", 7));
		document.getTokens().add(new Token(document, 30, 33, "wp", "who", 8));
		document.getTokens().add(new Token(document, 34, 39, "vbz", "wear", 9));
		document.getTokens().add(new Token(document, 40, 41, "dt", "a", 10));
		document.getTokens().add(new Token(document, 42, 48, "jj", "yellow", 11));
		document.getTokens().add(new Token(document, 49, 52, "nn", "hat", 12));
		document.getTokens().add(new Token(document, 52, 53, "punct", ".", 13));


		for (int i = 0 ; i < document.getTokens().size() ; i++ ) {

			if (document.getTokens().get(i).getPos().equals("nnp")) {
				System.out.print("Eigenname gefunden: ");
				System.out.println(document.getTokens().get(i).getGovernor());
			}
			else System.out.println(document.getTokens().get(i).getGovernor()+" "+document.getTokens().get(i).getPos());
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


}
