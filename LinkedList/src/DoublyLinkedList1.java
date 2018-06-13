//**************************************************************
// Nathan Schnitzer
// DoublyLinkedList1.java
// 2/22/18
// Doubly Linked List
//**************************************************************

import java.util.*;

public class DoublyLinkedList1<Type>
{
	private ListNode2<Type> first = null, last = null;
	private int size = 0;
	
	//Adds a node to the first position
	private Type addFirst(Type obj)
	{
		ListNode2<Type> newNode = new ListNode2(obj, null, first);
		first = newNode;
		if (size() == 0)
		{
			last = first;
		}
		size++;
		return obj;
	}
	
	//Adds a node to the end of the list
	public Type add(Type obj)
	{
		if (size() == 0)
		{
			return addFirst(obj);
		}
		ListNode2<Type> newNode = new ListNode2(obj, last, null);
		last.setNext(newNode);
		last = newNode;
		size++;
		return obj;
	}
	
	//Returns the size of the linkedlist
	public int size()
	{
		return size;
	}
	
	public void printBackwards()
	{
		ListNode2<Type> current = last;
		System.out.println(current.getValue());
		while (current.getPrev() != null)
		{
			current = current.getPrev();
			System.out.println(current.getValue());
		}
	}
	
	//Returns the list as a String
	public String toString()
	{
		String str = "";
		ListNode2<Type> current = first;
		str += current.getValue() + "\n";
		while(current.getNext() != null)
		{
			current = current.getNext();
			str += current.getValue() + "\n";
		}
		return str;
	}
	
	

}
