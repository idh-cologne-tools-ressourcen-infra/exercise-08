package de.ukoeln.idh.teaching.tri.ex08;

public class Token extends Annotation {
	String pos = null;
	String lemma = null;
	String relation = null;
	Token governor = null;

	public Token(Document document, int begin, int end, String pos, String lemma) {
		super(document, begin, end);
		this.pos = pos;
		this.lemma = lemma;
	}

	public Token getGovernor() {
		return governor;
	}

	public String getRelation() {
		return relation;
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

	/**
	 * @param relation the relation to set
	 */
	public void setRelation(String relation) {
		this.relation = relation;
	}

	/**
	 * @param governor the governor to set
	 */
	public void setGovernor(Token governor) {
		this.governor = governor;
	}

}
