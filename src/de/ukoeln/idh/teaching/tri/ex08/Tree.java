package de.ukoeln.idh.teaching.tri.ex08;

public class Tree {
	Object payload;
	Tree parent;
	Tree[] children;

	public Tree(Object payload) {

	}

	public Object getPayload() {
		return payload;
	}

	public void setPayload(Object payload) {
		this.payload = payload;
	}

	public Tree getParent() {
		return parent;
	}

	public void setParent(Tree parent) {
		this.parent = parent;
	}

	public Tree[] getChildren() {
		return children;
	}

	public void setChildren(Tree[] children) {
		this.children = children;
	}

}
