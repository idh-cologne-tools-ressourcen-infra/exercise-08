public class Token extends Annotation {
	String pos = null;
	String lemma = null;
	int dep = 0;

	public Token(Document document, int begin, int end, String pos, String lemma) {
		super(document, begin, end);
		this.pos = pos;
		this.lemma = lemma;
		this.dep = dep;
	}

	public Token getGovernor() {
		// TODO: Implement me (step 3)
		if (dep < 0) {
		return null;
	}

	return document.getTokens().get(dep);

	public String getRelation() {
		// TODO: Implement me (step 3)
		return getPos();
	}

