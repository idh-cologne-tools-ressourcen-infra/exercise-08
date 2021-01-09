  
package de.ukoeln.idh.teaching.tri.ex08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Document {
	String text = null;
	List<Token> tokens = new ArrayList<Token>();
	List<NamedEntity> namedEntities = new ArrayList<>();

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
		
		List<Token> tokensTemp = new ArrayList<Token>();
		tokensTemp = document.getTokens();
		
		tokensTemp.set(0, tokensTemp.get(0).setGovRel(tokensTemp.get(1), "det"));
		tokensTemp.set(1, tokensTemp.get(1).setGovRel(tokensTemp.get(2), "subj"));
		tokensTemp.set(2, tokensTemp.get(2).setGovRel(null, "root"));
		tokensTemp.set(3, tokensTemp.get(3).setGovRel(tokensTemp.get(2), "pred"));
		tokensTemp.set(4, tokensTemp.get(4).setGovRel(tokensTemp.get(3), "prep"));
		tokensTemp.set(5, tokensTemp.get(5).setGovRel(tokensTemp.get(6), "comp"));
		tokensTemp.set(6, tokensTemp.get(6).setGovRel(tokensTemp.get(4), "obj"));
		tokensTemp.set(8, tokensTemp.get(8).setGovRel(tokensTemp.get(6), "appos"));
		tokensTemp.set(9, tokensTemp.get(9).setGovRel(tokensTemp.get(8), "pred"));
		tokensTemp.set(10, tokensTemp.get(10).setGovRel(tokensTemp.get(12), "det"));
		tokensTemp.set(11, tokensTemp.get(11).setGovRel(tokensTemp.get(12), "det"));
		tokensTemp.set(12, tokensTemp.get(12).setGovRel(tokensTemp.get(9), "obj"));
		document.setTokens(tokensTemp);
		
		document.getNamedEntities().add(new NamedEntity(Arrays.asList(document.getTokens().get(5),document.getTokens().get(6)),"person",1));
		
		document.printTree();
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
	
	public void setNamedEntities(List<NamedEntity> namedEntities) {
		this.namedEntities = namedEntities;
	}
	
	public List<NamedEntity> getNamedEntities(){
		return namedEntities;
	}
	
	public List<Token> getChildren(Token parent){
		List<Token> tokensTemp = new ArrayList<Token>();
		for(Token token : this.getTokens()) {
			if(token.getGovernor()!=null) {
				if(token.getGovernor().equals(parent)) {
					tokensTemp.add(token);
				}
			}
		}
		return tokensTemp;
	}