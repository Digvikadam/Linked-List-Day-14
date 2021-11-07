package com.bridgelabz;

public class LinkedList {
	Node head;
	int size ;

	// adding method at initial
	public void addAtFirst(int val) {
		Node node = new Node(val);
		node.setData(val);
		if(head==null) {
			head=node;	
		}
		else
		{
			node.setNext(head);
			head=node;
		}
		size++;
	}

	// display method
	public void display() {
		Node temp;
		temp=head;
		for(int i=0 ; i<size ; i++)
		{
			System.out.println(temp.getData()) ;
			temp = temp.getNext();
		}
	}

	//main method
	public static void main(String[] args) {
		// creating reference variable of class linkedlist
		LinkedList list = new LinkedList() ;
		//adding data in nodes
		list.addAtFirst(70);
		list.addAtFirst(30);
		list.addAtFirst(56);
		//displaying the added data in node
		list.display();
	}

}
