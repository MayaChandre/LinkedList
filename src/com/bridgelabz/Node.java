package com.bridgelabz;

public class Node {

	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		linkedList.insert(56);
		linkedList.insert(30);
		linkedList.insert(70);
		linkedList.print();
		
		 int pop = linkedList.pop();
		 System.out.println(pop);
		
		linkedList.print();	
		}
}