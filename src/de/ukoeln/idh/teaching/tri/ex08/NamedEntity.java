package de.ukoeln.idh.teaching.tri.ex08;

public class NamedEntity extends Annotation {

	String category = null;
	double confidence = 0;

	public NamedEntity(Document document, int begin, int end) {
		super(document, begin, end);
		// TODO Auto-generated constructor stub
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String cat) {
		this.category = cat;
	}

	public double getConfidence() {
		return confidence;
	}

	public void setConfidence(double con) {
		this.confidence = con;
	}

}
