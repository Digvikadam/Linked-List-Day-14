package com.bridgelabz;

public class LinkedList {
	Node head ,tail;
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

	// append at last method
	public void appendAtLast(int val) {
		Node node = new Node(val);
		node.setData(val);
		if(head == null) {
			head = node ;
			tail = node ;
		}
		else {
			tail=head;
			while(tail.getNext() != null) {
				tail=tail.getNext();
			}
			tail.setNext(node);
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

		//adding data in nodes at last
		list.appendAtLast(56);
		list.appendAtLast(30);
		list.appendAtLast(70);

		//displaying the added data in node
		list.display();
	}
}
