package com.linkedlised.ds;

import java.util.*;

public class LinkedList {
	Node head;
	class Node
	{
		Object data;
		Node next;
		Node(Object data )
		{
			this.data = data;
		}
	}
	public void addFirst(Object data)
		{
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
	public void addLast(Object data)
	{
		Node newNode = new Node(data);
		Node temp = head;
		if(head == null) {
			head = newNode;
		}
			
		else
		{
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	public void addPosition(Object data, int position)
	{
		int index =0;
		Node newNode = new Node(data);
		Node left = head;
		Node right = left.next;
		while(index < (position-1))
		{
			left = left.next;
			right = right.next;
			index++;
			
		}
		newNode.next = right;
		left.next = newNode;
		
		
	}
	public void display()
	{
		Node temp = head;
		while(temp!=null)
		{
			if(temp.next != null)
				System.out.print(temp.data+" > ");
			else
				System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public void deleteFirst()
	{
		head = head.next;
	}
	public void deletelast()
	{
		if(head == null)
			System.out.println("List is empty");
		else if(head.next == null)
			head = null;
		else
		{
			Node temp = head;
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			temp.next= null;
		}
	}
	

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Welcome to Linked List Problem");
		Scanner sc = new Scanner(System.in);
		System.out.println("Adding Nodes At First");
		list.addFirst(56);
		list.display();
		list.addLast(70);
		list.display();
		
		System.out.println("Enter Position Number To Add:- ");
		int position =sc.nextInt();
		list.addPosition(30, position);
		list.display();
		
		list.deletelast();
		list.display();
		list.deleteFirst();
		list.display();
		
	}


	
}
