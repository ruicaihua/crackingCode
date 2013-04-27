package com.chapter2;

public class Node {
	Node next = null;
	int data;
	public Node(int d) {
		data = d;
	}
	void appendToTail(int d) {
		Node endNode = new Node(d);
		Node n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = endNode;
	}
	Node deleteNode(Node head, int d) {
		Node n = head;
		if(n.data == d) {
			return head.next;
		}
		while(n.next != null) {
			if(n.next.data == d) {
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
	void printNode(Node head) {
		Node n = head;
		while(n != null) {
			System.out.print(n.data + "->");
			n = n.next;
		}
	}
}
