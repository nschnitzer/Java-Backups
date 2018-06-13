//******************************************************
// Nathan Schnitzer
// ListNode.java
// 9/12/17
// This will represent a node in a linked list data structure
//******************************************************

public class ListNode<Type>
{
	private Type value;
	ListNode<Type> next;
	
	//Constructs a ListNode object
	public ListNode(Type initObj, ListNode<Type> initNext)
	{
		value = initObj;
		next = initNext;
	}
	
	//Returns value
	public Type getValue()
	{
		return value;
	}
	
	//Returns next
	public ListNode<Type> getNext()
	{
		return next;
	}
	
	//Sets Value to a new value
	public void setValue(Type newValue)
	{
		value = newValue;
	}
	
	//Sets Next to a new value
	public void setNext(ListNode<Type> newNext)
	{
		next = newNext;
	}
	

}
