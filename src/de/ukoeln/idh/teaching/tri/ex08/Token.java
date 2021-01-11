package de.ukoeln.idh.teaching.tri.ex08;

public class Token extends Annotation {
	String pos = null;
	String lemma = null;
	int dependency;

	public Token(Document document, int begin, int end, String pos, String lemma, int dependency) {
		super(document, begin, end);
		this.pos = pos;
		this.lemma = lemma;
		this.dependency = dependency;
	}

	public Token getGovernor() {
		// TODO: Implement me (step 3)
		// return the governor (head) of the phrase
		if(this.dependency < 0) {
			return null;
		}
		return document.getTokens().get(dependency);

	}

	public String getRelation() {
		// TODO: Implement me (step 3)
		// return PoS
		return getPos();
	}

	@Override
	public String toString() {
		return getDocument().getText().substring(getBegin(), getEnd());
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getLemma() {
		return lemma;
	}

	public void setLemma(String lemma) {
		this.lemma = lemma;
	}

}
