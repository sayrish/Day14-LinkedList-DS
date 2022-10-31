package com.linkedlised.ds;

public class LinkedList {
	Node head;
	class Node {
		
		Object data;
		Node next;

		Node(Object data) 
		{	
			this.data = data;
		}
	}

	public void CreatList(Object data) {
		Node newNode = new Node(data);
		System.out.print(newNode.data + " ");

	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Welcome to Linked List Problem");
		list.CreatList(80);
		list.CreatList(90);
		list.CreatList(100);
	}

	
}
