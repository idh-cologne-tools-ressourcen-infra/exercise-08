package de.ukoeln.idh.teaching.tri.ex08;

public class Token extends Annotation {
	String pos = null;
	String lemma = null;
	Integer head = null;

	public Token(Document document, int begin, int end, String pos, String lemma, Integer head) {
		super(document, begin, end);
		this.pos = pos;
		this.lemma = lemma;
		this.head = head;



		//System.out.println("Anfangsposition des Wortes: "+begin+" Endposition des Wortes: "+end+" Wortart: "+pos+" Lemma:"+lemma+ " Head: "+head+" Tail: ");
	}

	public Token getGovernor() {
		// TODO: Implement me (step 3)
		if (this.head < 0) {
			return null;
		}
		return document.getTokens().get(head);


	}

	public String getRelation() {
		// TODO: Implement me (step 3)
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
