package de.ukoeln.idh.teaching.tri.ex08;

public class Token extends Annotation {
	String pos = null;
	String lemma = null;
	Token gov = null;
	String rel = null;
	
	public Token(Document document, int begin, int end, String pos, String lemma) {
        super(document, begin, end);
        this.pos = pos;
        this.lemma = lemma;
    }

	public Token getGovernor() {
		// TODO: Implement me (step 3)	
		return gov;
	}

	public String getRelation() {
		// TODO: Implement me (step 3)
		return rel;
	}

	public void setGov(Token gov, String rel) {
		this.gov = gov;
		this.rel = rel;
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
