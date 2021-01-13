package de.ukoeln.idh.teaching.tri.ex08;

import java.util.List;

public class NamedEntity {
	private long confidence;
	private Token token;
	private String type;
	
	NamedEntity(Token token,String type,int confidence){
		setToken(token);
		setType(type);
		setConfidence(confidence);
	}

	public long getConfidence() {
		return confidence;
	}

	public void setConfidence(int confidence) {
		this.confidence = confidence;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}