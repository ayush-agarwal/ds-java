package com.ayush.linkedlist.impl;

public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		final ILinkedList linkedList = new LinkedListImpl();
		linkedList.addData(0);
		linkedList.addData(48);
		linkedList.addData(434);

		linkedList.addData(3243);
		linkedList.addData(93837);

		linkedList.displayLinkedList();
		linkedList.getSize();

		linkedList.deleteData(93837);

		linkedList.displayLinkedList();
		linkedList.getSize();

		linkedList.deleteData(55555);

		linkedList.displayLinkedList();
		linkedList.getSize();

		linkedList.deleteData(null);

		linkedList.displayLinkedList();
		linkedList.getSize();
	}

}
