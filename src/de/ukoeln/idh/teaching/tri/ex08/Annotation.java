package de.ukoeln.idh.teaching.tri.ex08;

public abstract class Annotation {
	int begin = -1, end = -1;
	Document document = null;

	/**
	 * @return the begin
	 */
	public int getBegin() {
		return begin;
	}

	/**
	 * @param begin the begin to set
	 */
	public void setBegin(int begin) {
		this.begin = begin;
	}

	/**
	 * @return the end
	 */
	public int getEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(int end) {
		this.end = end;
	}

	/**
	 * @return the document
	 */
	public Document getDocument() {
		return document;
	}

	/**
	 * @param document the document to set
	 */
	public void setDocument(Document document) {
		this.document = document;
	}

	public Annotation(Document document, int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
		this.document = document;
	}

}
