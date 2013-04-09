package com.ayush.linkedlist.impl;


public class LinkedListImpl implements ILinkedList {

	private Node headNode = null;

	@Override
	public void addData(final int pObj) {

		final Node endNode = new Node(pObj);
		if(this.headNode == null){
			this.headNode = endNode;
		}else{
			Node headNode = this.headNode;
			while (headNode.getNextNode() != null){
				headNode = headNode.getNextNode();
			}
			headNode.setNextNode(endNode);
		}
	}

	@Override
	public void deleteData(final Integer data) {

		if(data == null){
			return;
		}
		Node headNode = this.headNode;
		if(null == headNode.getNextNode()){
			System.out.println("There is no element in the linked list.");
		}else{
			while(null != headNode.getNextNode() && data != headNode.getNextNode().getData()){
				headNode = headNode.getNextNode();
				System.out.println("Head node is chnaged to "+ headNode);
			}

			if( headNode.getNextNode() == null){
				System.out.println("The entered no does not exist in the list");
			}else{
				System.out.println("headNode.setNextNode to "+ headNode.getNextNode().getNextNode());
				headNode.setNextNode(headNode.getNextNode().getNextNode());
			}
		}
	}

	@Override
	public int getSize() {
		int size = 0;
		Node head = this.headNode;
		while(head != null){
			head = head.getNextNode();
			size++;
		}
		System.out.println("The linked list size is "+ size);
		return size;
	}

	@Override
	public void displayLinkedList() {
		Node printNode = this.headNode;
		System.out.println("Displaying the linked list nodes values :");
		while (printNode != null) {
			System.out.println( printNode.getData());
			printNode = printNode.getNextNode();
		}
	}

}
