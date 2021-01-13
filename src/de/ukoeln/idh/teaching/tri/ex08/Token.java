package de.ukoeln.idh.teaching.tri.ex08;

public class Token extends Annotation {
	String pos = null;
	String lemma = null;
	int dep=0;

	public Token(Document document, int begin, int end, String pos, String lemma, int gov) {
		super(document, begin, end);
		this.pos = pos;
		this.lemma = lemma;
	}

	public Token getGovernor() {
		
		if (dep < 0) {
			return null;
			}
			return document.getTokens().get(dep);
		
		}
	public String getRelation() {
		return getPos();				//POS gibt relations an
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
