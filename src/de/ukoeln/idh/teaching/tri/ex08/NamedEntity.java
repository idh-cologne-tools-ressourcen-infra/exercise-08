package de.ukoeln.idh.teaching.tri.ex08;

public class NamedEntity extends Annotation {

	String category = null;
	double confidence = -1;

	public NamedEntity(Document document, int begin, int end) {
		super(document, begin, end);
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the confidence
	 */
	public double getConfidence() {
		return confidence;
	}

	/**
	 * @param confidence the confidence to set
	 */
	public void setConfidence(double confidence) {
		this.confidence = confidence;
	}

}
