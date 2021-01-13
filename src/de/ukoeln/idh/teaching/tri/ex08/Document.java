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

		List<Token> ts = document.getTokens();
		ts.get(0).setGovernor(ts.get(1)); // the
		ts.get(0).setRelation("det");
		ts.get(1).setGovernor(ts.get(3)); // dog
		ts.get(1).setRelation("nsubj");
		ts.get(2).setGovernor(ts.get(3)); // is
		ts.get(2).setRelation("cop");
		ts.get(3).setGovernor(null); // fed
		ts.get(3).setRelation(null);
		ts.get(4).setGovernor(ts.get(3)); // by
		ts.get(4).setRelation("prep");
		ts.get(5).setGovernor(ts.get(6)); // mr.
		ts.get(5).setRelation("nn");
		ts.get(6).setGovernor(ts.get(4)); // parker
		ts.get(6).setRelation("pobj");
		ts.get(7).setGovernor(ts.get(3)); // ,
		ts.get(7).setRelation("advmod");
		ts.get(8).setGovernor(ts.get(9)); // who
		ts.get(8).setRelation("nsubj");
		ts.get(9).setGovernor(ts.get(7)); // wears
		ts.get(9).setRelation("rcmod");
		ts.get(10).setGovernor(ts.get(12)); // a
		ts.get(10).setRelation("dep");
		ts.get(11).setGovernor(ts.get(12)); // yellow
		ts.get(11).setRelation("amod");
		ts.get(12).setGovernor(ts.get(9)); // hat
		ts.get(12).setRelation("dobj");
		ts.get(13).setGovernor(ts.get(3)); // .
		ts.get(13).setRelation("punct");

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
