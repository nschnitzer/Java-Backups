//**********************************************************
// Nathan Schnitzer
// LinkedList1.java
// 9/12/17
// This will represent a linked list
//**********************************************************

import java.util.*;

public class LinkedList1<Type> //extends Comparable 
{
	private ListNode<Type> first;
	private int size;
	
	
	//Constructs a LinkedList1 object
	public LinkedList1()
	{
		size = 0;
	}
	
	//Deletes duplicates from the list
	public static <Type> void removeDupes(LinkedList1<Type> list)
	{
		ListNode<Type> node = list.getNode(0);
		int count = 0;
		ListNode<Type> compNode = new ListNode<Type>(null, null);
		node = list.getNode(count);
		while(node.getNext().getNext() != null)
		{
			compNode = node.getNext();
			Type compValueTo = node.getValue();
			for (int i = count+1; i < list.size(); i++)
			{
				if (compNode.getValue() == null)
					continue;
				Type compValue = compNode.getValue();
				if (compValueTo.equals(compNode.getValue()))
				{
					System.out.println("Execute");
					list.remove(i);
				}
				else
					System.out.println("Failure");
			}
			count++;
		}
	}
	
	//Add a node to the list
	public void add(Type obj)
	{
		ListNode<Type> current;
		ListNode<Type> newNode = new ListNode<Type>(obj, null);
		if (first == null)
			first = newNode;
		else
		{
			current = first;
			while (current.getNext() != null)
				current = current.getNext();
			current.setNext(newNode);
		}
		size++;
	}
	
	//Add a node to be the first
	public void addFirst(Type obj)
	{
		ListNode<Type> current;
		ListNode<Type> newNode = new ListNode<Type>(obj, null);
		current = first;
		newNode.setNext(current);
		first = newNode;
		size++;
	}
	
	//Deletes the object specified
	public void remove(Type e)
	{
		ListNode<Type> current;
		current = first;
		ListNode<Type> after = current.getNext();
		if ((current.getValue().equals(e)))
		{
			first = after;
			size--;
		}
		
		ListNode<Type> before = current;
		current = current.getNext();
		after = current.getNext();		
		int i = 1;
		while (i < size()-1)
		{
			if (current.getValue().equals(e))
			{
				before.setNext(after);
			}
			before = current;
			current = current.getNext();
			after = current.getNext();
			i++;
		}
		return;
		//throw new NoSuchElementException();
	}
	
	//Removes first occurance of the object
	public boolean removeFirstOccurace(Type e)
	{
		ListNode<Type> current;
		current = first;
		ListNode<Type> after = current.getNext();
		if ((current.getValue().equals(e)))
		{
			first = after;
			size--;
			return true;
		}
		
		ListNode<Type> before = current;
		current = current.getNext();
		after = current.getNext();		
		int i = 1;
		while (i < size()-1)
		{
			if (current.getValue().equals(e))
			{
				before.setNext(after);
				return true;
			}
			before = current;
			current = current.getNext();
			after = current.getNext();
			i++;
		}
		return false;
	}
	
	//Remove the first node
	public void delFirst()
	{
		ListNode<Type> current;
		if (size() == 0)
		{
			throw new NullPointerException();
		}
		current = first;
		first = current.getNext();
		current.setNext(null);
		size--;
	}
	
	//Changes a nodes value
	public Type set(int index, Type obj)
	{
		Type replaced;
		if (index < 0 || index >= size())
		{
			throw new IndexOutOfBoundsException();
		}
		ListNode<Type> current = first;
		
		if (index == 0)
		{
			replaced = current.getValue();
			current.setValue(obj);
		}
		else
		{
			for (int i = 0; i < index -1; i++)
			{
				current = current.getNext();
			}
		
			replaced = current.getValue();
			current.setValue(obj);
		}
		return replaced;
	}
	
	//Returns the first node of the list
	public ListNode<Type> element()
	{
		return first;
	}
	

		
		//Insert a node into any position
	public void add(int position, Type obj) throws NullPointerException
				{
					ListNode<Type> current;
					
					if (position < 0 || position > size())
					{
						throw new NullPointerException();
					}
					if (position == 0)
					{
						addFirst(obj);
						return;
					}
					if(position == size())
					{
						add(obj);
						return;
					}
					ListNode<Type> newNode = new ListNode<Type>(obj, null);
					ListNode<Type> afterNode;
					current = first;
					
					int i = 1;
					while (i < position)
					{
						current = current.getNext();
						i++;
					}
					
					afterNode = current.getNext();
					current.setNext(newNode);
					current = current.getNext();
					current.setNext(afterNode);
					size++;
				}
	
	//Deletes a node from a specific position
	public Type remove(int position) throws NullPointerException, IllegalStateException
	{
		ListNode<Type> current;
		if (position < 0)
		{
			throw new IllegalStateException();
		}
		
		else if (position >= size())
		{
			throw new NullPointerException();
		}
		
		if (position == 0)
		{
			current = first;
			first = current.getNext();
			size--;
			return current.getValue();
		}
		ListNode<Type> removed;
		ListNode<Type> before = null;
		ListNode<Type> after;
		current = first;
		current = current.getNext();
		int i = 1;
		while (i < position)
		{
			before = current;
			current = current.getNext();
			i++;
		}
		removed = current;
		current = current.getNext();
		after = current;
		
		before.setNext(after);
		size--;
		
		return removed.getValue();
		}
	
	//Returns the object in the x list node with an offset of 0
	public Type get(int index)
	{
		ListNode<Type> current;
		//Create a new Exception
		if (index < 0 || index >= size())
		{
			throw new NoSuchElementException("index " + index);
		}
		current = first;
		for (int i = 0; i < index; i++)
			current = current.getNext();
		
		return current.getValue();
	}
	
	//Returns the node of the list
	public ListNode<Type> getNode(int index)
	{
		ListNode<Type> current = first;
		
		if (index == 0)
			return first;
		
		for (int i = 0; i < index; i++)
			current = current.getNext();
		
		return current;
	}

	//Calculates the length of the list
	public int getLength()
	{
		int length;
		ListNode<Type> current;
		length = 1;
		
		current = first;
		while (current.getNext() != null)
		{
			length = length + 1;
			current = current.getNext();
		}
		return length;
	}
	
	//Returns size
	public int size()
	{
		return size;
	}
	
	//Print out the list
	public void printList()
	{
		ListNode<Type> current;
		System.out.println("Printing...");
		System.out.println();
		
		current = first;
		System.out.println(current.getValue());
		while (current.getNext() != null)
		{
			current = current.getNext();
			System.out.println(current.getValue());
			
		}
		System.out.println();
		System.out.println("Done");
	}
	
	//Prints out the reversed linked list with recursion
	public void printBackwards()
	{
		printBackwardsHelper(first);
	}
	
	private void printBackwardsHelper(ListNode<Type> cur)
	{
		if (cur.getNext() != null)
		{
			printBackwardsHelper(cur.getNext());
			
		}
		System.out.println(cur.getValue());
	}
	
	//Prints out the reversed linked list without recursion
	
	public String toStringAddress()
	{
		ListNode<Type> current;
		String str = "";
		current = first;
		str += current + " ";
		while(current.getNext()!=null)
		{
			current = current.getNext();
			str += current + " ";
		}
		
		return str;
	}
	
	//poll() - removes and returns first element
	public Type poll()
	{
		ListNode<Type> current;
		if (size() == 0)
		{
			throw new NullPointerException();
		}
		Type value = first.getValue();
		current = first;
		first = current.getNext();
		current.setNext(null);
		size--;
		return value;
	}
	
	//
	
	//Same thing as poll()
	public Type pollFirst()
	{
		return poll();
	}
	
	//polls the last
	public Type pollLast()
	{
		ListNode<Type> current;
		current = first;
		for (int i = 0; i < size(); i++)
		{
			current = current.getNext();
		}
		
		return current.getValue();
	}

	public void reverseList()
	{
		ListNode<Type> current;
		ListNode<Type> other = first;
		current = first;
		int j = size()-1;
		for (int i = 0; i < size()/2; i++)
		{
			int k = 1;
			while (k < j && other.getNext() != null)
			{
				other = other.getNext();
				k++;
			}
			Type temp = other.getValue();
			j--;
			
			other.setValue(current.getValue());;
			current.setValue(temp);;
		}
	}
	
	private ListNode<Type> getLast()
	{
		ListNode<Type> current;
		current = first;
		for (int i = 0; i < size(); i++)
		{
			current = current.getNext();
		}
		
		return current;
	}
	
	//Returns a String with the value of LinkedList1
	public String toString()
	{
		ListNode<Type> current;
		String result = "";
		
		result += "Printing... " + "\n";
		
		//Add first node to result
		current = first;
		result = result + current.getValue() + "\n";
		
		//Add the rest of nodes to result
		while (current.getNext() != null)
		{
			current = current.getNext();
			result = result + current.getValue() + "\n";
		}
		result = result + "\n" + "Done.";
		
		return result;
	}

}
