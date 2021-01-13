package de.ukoeln.idh.teaching.tri.ex08;

public class Token extends Annotation {
	String pos = null;
	String lemma = null;
	String rel = null;

	public Token(Document document, int begin, int end, String pos, String lemma, String rel) {
		super(document, begin, end);
		this.pos = pos;
		this.lemma = lemma;
		this.rel = rel;
	}

	public Token getGovernor() {
		if(begin <= 0) {
			Token empty = null;
			return empty;
		} else {
			for(Token result: document.getTokens()) {
				if(result.getEnd()==begin-1) {
					return result;
				}
			}
		}
		return null;
	}

	public String getRelation() {
		return rel;
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
