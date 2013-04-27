package com.chapter2;

import java.util.Random;

public class RemoveDupList {

	/**
	 * 2.1 Write code to remove duplicates from an usorted linked list.
	 * FOLLOW UP
	 * How would you solve this problem if a temporary buffer is not allowed?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(7);
		Random ran = new Random();
		for(int i=0;i<10;i++) {
			head.appendToTail(ran.nextInt(10)+1);
		}
		System.out.println("Before......");
		head.printNode(head);
		removeDuplicates(head);
		System.out.println();
		System.out.println("After......");
		head.printNode(head);
	}
	
	private static void removeDuplicates(Node head) {
		Node ret = head, preNode=head,curNode=head.next;
		int count = 1;
		while(curNode != null) {
			int i=0;
			boolean flag = true;
			ret = head;
			while(i<count && curNode!=null) {
				if(ret.data == curNode.data) {
					preNode.next = curNode.next;
					curNode = preNode.next;
					flag = false;
				}
				ret = ret.next;
				i++;
			}
			if(flag) {
				count++;
				preNode = curNode;
				curNode = curNode.next;
			}
		}
	}

}
