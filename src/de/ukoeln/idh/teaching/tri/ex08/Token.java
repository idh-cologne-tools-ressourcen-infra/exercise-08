package de.ukoeln.idh.teaching.tri.ex08;

public class Token extends Annotation {
	String pos = null;
	String lemma = null;
	int relate = 0;
	String dp = null;

	public Token(Document document, int begin, int end, String pos, String lemma, int relate, String dp) {
		super(document, begin, end);
		this.pos = pos;
		this.lemma = lemma;
		this.relate = relate;
		this.dp = dp;
	}

	public Token getGovernor() {
		// TODO: Implement me (step 3)
		if (relate < 0) {
			return null;
		}
		return document.getTokens().get(relate);
	}

	public String getRelation() {
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
