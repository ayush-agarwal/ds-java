package com.ayush.linkedlist.impl;

public class Node {

	private Node nextNode = null;
	private Integer data;

	public Node(final int pData){
		setData(pData);
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(final Node nextNode) {
		this.nextNode = nextNode;
	}

	public int getData() {
		return data;
	}

	public void setData(final int data) {
		this.data = data;
	}

}
