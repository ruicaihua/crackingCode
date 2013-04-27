package com.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class LastNTail {

	/**
	 * 2.2 Implement an algorithm to find the nth to last element of a singly linked list
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Node head = new Node(7);
		Random ran = new Random();
		for(int i=0;i<10;i++) {
			head.appendToTail(ran.nextInt(10)+1);
		}
		System.out.println("List......");
		head.printNode(head);
		System.out.println();
		System.out.println("Input your N......");
		InputStreamReader iStreamReader = new InputStreamReader(System.in);
		BufferedReader brBufferedReader = new BufferedReader(iStreamReader);
		String string = null;
		int n=-1;
		while(n<1 || !string.equals("quit")) {
			try {
				string = brBufferedReader.readLine();
				n = Integer.valueOf(string);
				Node retNode = lastNElement(head, n);
				System.out.println("the nth to last element of head......");
				System.out.println(retNode.data);
				System.out.println();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Please input an integer(>0).......");
				System.out.println("please input 'quit' to quit!");
			}
		}
	}

	private static Node lastNElement(Node head, int n) {
		if(head == null || n<0) {
			return null;
		}
		Node fast = head, slow = head;
		while(n>1 && fast != null) {
			fast = fast.next;
			n--;
		}
		if(n>1) {
			return null;
		}
		while(fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
	}
}
