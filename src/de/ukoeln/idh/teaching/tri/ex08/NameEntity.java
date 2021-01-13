package de.ukoeln.idh.teaching.tri.ex08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameEntity {
	private List<Token> nameEntityTokens = new ArrayList<Token>();
	private Map<String, List<Token>> nameEntities = new HashMap<String, List<Token>>();
	
	public void saveNameEntityTokens(Token token) {
		nameEntityTokens.add(token);
	}
	public Map<String, List<Token>> getNameEntities() {
		return nameEntities;
	}
	public void saveNameEntity() {
		nameEntities.put("person", nameEntityTokens);
	
	}
}