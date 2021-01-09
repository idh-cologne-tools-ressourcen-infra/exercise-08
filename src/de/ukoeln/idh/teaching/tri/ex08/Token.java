package de.ukoeln.idh.teaching.tri.ex08;

public class Token extends Annotation {





	String pos = null;
	String lemma = null;
	Token govenor = null;
	String relation = null;

	public Token(Document document, int begin, int end, String pos, String lemma) {
		super(document, begin, end);
		this.pos = pos;
		this.lemma = lemma;
	}

	public Token getGovernor() {
		return govenor;
	}

	public String getRelation() {
		return relation;
	}

	public void setGovernor(Token govenor) {
		this.govenor = govenor;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public Token setGovRel(Token govenor, String relation) {
		this.setGovernor(govenor);
		this.setRelation(relation);
		return this;
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

	@Override
	public boolean equals(Object e) {
		if(e.getClass()==this.getClass()) {
			if(((Token)e).getBegin()==this.begin && ((Token)e).getEnd()==this.end) {
				return true;
			}
		}
		return false;
	}

}