//******************************************************
// Nathan Schnitzer
// ListNode.java
// 9/12/17
// This will represent a node in a linked list data structure
//******************************************************

public class ListNode2<Type>
{
	private Type value;
	ListNode2<Type> next;
	ListNode2<Type> previous;
	
	//Constructs a ListNode object
	public ListNode2(Type initObj, ListNode2<Type> initPrev, ListNode2<Type> initNext)
	{
		value = initObj;
		previous = initPrev;
		next = initNext;
	}
	
	//Returns value
	public Type getValue()
	{
		return value;
	}
	
	//Returns previous node
	public ListNode2<Type> getPrev()
	{
		return previous;
	}
	
	//Returns next
	public ListNode2<Type> getNext()
	{
		return next;
	}
	
	//Sets Value to a new value
	public void setValue(Type newValue)
	{
		value = newValue;
	}
	
	//Sets Next to a new value
	public void setNext(ListNode2<Type> newNext)
	{
		next = newNext;
	}
	
	//Sets Previous to a new value
	public void setPrev(ListNode2<Type> newPrev)
	{
		previous = newPrev;
	}
	

}
