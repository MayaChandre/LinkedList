package com.bridgelabz;

public class LinkedList {

	Node head;
	
	 class Node {
		 int data;
		 Node next;
		 
		 public Node(int data)
		 {
			 this.data = data;
			 this.next = null;
		 }
	 }
	 // appending data
	public Node insert (int data)
	{
			
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
			} else {
				Node temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				temp.next = newNode;
			}
			return newNode;
		}

       //method to push
		public void push(int data) {
			 Node newNode = new Node(data);
			 newNode.next = head;
			 head = newNode;
		 }

		// method to display inserted data
		public void print() {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
			System.out.println();
		}

		// method to insert after a node
		public void insertAfter(Node prevNode, int value) {

			if (prevNode == null) {
			System.out.println("Prev Node should not be null");
			return;
			}
			
			Node newNode = new Node(value);
			newNode.next = prevNode.next;
			prevNode.next = newNode;

			
			}
}
