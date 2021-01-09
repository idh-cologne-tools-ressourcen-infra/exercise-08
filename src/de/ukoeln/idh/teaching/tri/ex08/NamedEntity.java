public class NamedEntity {
	private Map<String, List<Token>> namedEntities = new HashMap<String, List<Token>>();
	private List<Token> nameEntityTokens = new ArrayList<Token>();

	public void saveNamedEntityTokens(Token token) {
		nameEntityTokens.add(token);
	}

	public void saveNamedEntity() {
		namedEntities.put("person", nameEntityTokens);
	}

	public Map<String, List<Token>> getNamedEntities() {
		return namedEntities;
	}