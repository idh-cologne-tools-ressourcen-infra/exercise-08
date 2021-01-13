package de.ukoeln.idh.teaching.tri.ex08;

import java.util.List;

public class NamedEntity {
	private long confidence;
	private List<Token> tokens;
	private String type;

	NamedEntity(List<Token> tokens,String type,long confidence){
		setTokens(tokens);
		setType(type);
		setConfidence(confidence);
	}

	public long getConfidence() {
		return confidence;
	}

	public void setConfidence(long confidence) {
		this.confidence = confidence;
	}

	public List<Token> getTokens() {
		return tokens;
	}

	public void setTokens(List<Token> tokens) {
		this.tokens = tokens;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
