package com.sadp.datastructurs;

public class LinkedListImpl {
	public Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public LinkedListImpl(Node head) {
		super();
		this.head = head;
	}

	public int size() {
		Node node = head;
		int size = 1;
		if (head == null) {
			return 0;
		} else if (node.getNext() == null) {
			return 1;
		} else {
			Node node1 = head;
			while (node1.getNext() != null) {
				size++;
			}
		}

		return size;
	}

	public Node add(Node n) {
		return n;
	}

	public static void main(String[] args) {
		// Node linkedlist=new Node(1,new Node(0,null));
		// System.out.println(LinkedListImpl.size(linkedlist));
		Node head = new Node(1,null);
		LinkedListImpl ll = new LinkedListImpl(head);
		System.out.println(ll.size());

	}

}
