package com.bridgelabz;

public class LinkedListMain {
	//main method
		public static void main(String[] args) {
			// creating reference variable of class linkedlist
			LinkedList list = new LinkedList() ;

			//adding data in nodes at first
			list.addAtFirst(56);

			//adding data in nodes at last
			list.appendAtLast(70);

			//adding data in node at a position 2
			list.insertAtPos(2,30);

			//adding the next value after 30 and before 70
			list.addAfterGivenValue(30, 40);


			System.out.println("before sorting");
			list.display();

			//sorting
			list.sort();
			System.out.println("after sorting");
			list.display();


		}

}
