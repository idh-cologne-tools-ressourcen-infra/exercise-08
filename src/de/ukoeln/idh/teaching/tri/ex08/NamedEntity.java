package de.ukoeln.idh.teaching.tri.ex08;

public class NamedEntity {

	private String type;
	private Token token;
	private Float prob;
	
	public NamedEntity (String type, Token token, float prob) {
		this.type = type;
		this.token = token;
		this.prob = prob;
	}
	
	@Override
	public String toString() {
		return type;
	}
}
