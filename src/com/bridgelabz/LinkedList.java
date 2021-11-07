package com.bridgelabz;

public class LinkedList {
	public static void main(String[] args) {

		Node firstNode = new Node(56);
		Node secondNode = new Node(70);
		Node thirdNode = new Node(30);


		Node head = firstNode;
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode); 
		Node tail = thirdNode;

		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
}
