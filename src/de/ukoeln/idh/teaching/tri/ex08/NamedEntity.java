package de.ukoeln.idh.teaching.tri.ex08;

public class NamedEntity {
	Token token;
	String type;
	float prob;
	
	public NamedEntity(Token token, String type, float prob){
		this.token = token;
		this.type = type;
		this.prob = prob;
	}
	
	@Override
	public String toString() {
	return type;
	}
	
}
