//*********************************************
// Nathan Schnitzer
// myArrayList.java
// 11/6/17
// This will contain the methods of myArrayList objects
//*********************************************

import java.util.ArrayList;


public class myArrayList <E>
{
	private E[] theData;
	private int size = 0;
	private int capacity = 0;
	private static final int INIT_CAPACITY = 10;
	
	//Constructs an object
	public myArrayList(int INIT_CAPACITY)
	{
		theData = (E[]) new Object[INIT_CAPACITY];
		capacity = INIT_CAPACITY;
	}
	
	//Constructs an object
	public myArrayList()
	{
		theData = (E[]) new Object[INIT_CAPACITY];
		capacity = INIT_CAPACITY;
	}
	
	//Adds an element to the end
	public boolean add(E e)
	{
		if (e == null)
		{
			throw new NullPointerException();
		}
		if (size == capacity)
			reallocate();
		
		theData[size] = e;
		size++;
		return true;
	}
	
	//Adds an element to a specific position in the ArrayList
	public void add(int index, E e)
	{
		//Throw index out of bounds exception
		if ((index < 0) || (index > size()))
			{
				throw new IndexOutOfBoundsException("Index: " + index + "   Size: " + size);
			}
		//Throw null pointer exception
		if (e == null)
		{
			throw new NullPointerException();
		}
		
		if (size() == capacity)
		{
			reallocate();
		}
		
		for (int i = size(); i > index; i--)
		{
			theData[i] = theData[i-1];
		}
		theData[index] = e;
		size++;
	}
	
	//Adds all the elements of the array to the list
	public boolean addAll(E[] newData)
	{
		for (int i = 0; i < newData.length; i++)
		{
			add(newData[i]);
		}
		return true;
	}
	
	//Sets a certain element to e
	public E set(int index, E e)
	{
		theData[index] = e;
		return e;
	}
	
	//Returns a list of elements from a specified range of indexes
	public myArrayList<E> subList(int from, int to)
	{
		myArrayList<E> newArrayList = new myArrayList<E>();
		for (int i = from; i < to; i++)
		{
			newArrayList.add(theData[i]);
		}
		
		return newArrayList;
	}
	
	//Returns if the arraylist contains an object
	public boolean contains(E e)
	{
		boolean isThere = false;
		for (int i = 0; i < size(); i++)
		{
			if (theData[i].equals(e))
			{
				isThere = true;
				i += size();
			}
		}
		
		return isThere;
	}
	
	//Returns the index of the first occurance of e
	public int indexOf(E e)
	{
		int foundAt = -1;
		for (int i = 0; i < size(); i++)
		{
			if (theData[i].equals(e))
			{
				foundAt = i;
				i += size();
			}
		}
		
		return foundAt;  
	}
	
	//Returns the last index that e occured
	public int lastIndexOf(E e)
	{
		int foundAt = -1;
		for (int i = 0; i < size(); i++)
		{
			if (theData[i].equals(e))
			{
				foundAt = i;
			}
		}
		
		return foundAt;
	}
	//Returns whether the arraylist is empty or not
	public boolean isEmpty()
	{
		if (size() == 0)
		{
			return true;
		}
		else
			return false;
	}
	
	//Removes the last element
	public void remove()
	{
		theData[size()-1] = null;
		size--;
	}
	
	//Removes the first occurrence of e
	public boolean removeFirstIndex(E e)
	{
			if (indexOf(e) != -1)
			{
				remove(indexOf(e));
				return true;
			}
			else
				return false;
	}
	//Removes all elements e from myArrayList
	public boolean remove(E e)
	{
		for (int i = 0; i < size(); i++)
		{
			if (indexOf(e) != -1)
			{
				remove(indexOf(e));
			}
		}
		return true;
	}
	
	//Removes element at index x from the list
	public void remove(int index)
	{
		int numMoved = size-index-1;
		
		if (numMoved > 0)
			System.arraycopy(theData, index+1, theData, index, numMoved);
		theData[--size] = null;
	}
	
	//Removes elements from x to y inclusive
	public void removeRange(int from, int to)
	{
		for (int i = from; i <= to; i++)
		{
			remove(i);
		}
	}

	//Returns element in x index
	public E get(int x)
	{
		return theData[x];
	}
	
	//Clears all elements in the arraylist
	public void clear()
	{
		for (int i = 0; i < size(); i++)
		{
			theData[i] = null;
		}
		size = 0;
	}
	
	//Reallocates the size
	public void reallocate()
	{
		System.out.println("Calling Reallocate...");
		capacity = capacity * 2;
		E[] newArrayList = (E[]) new Object[capacity];
		
		for (int i = 0; i < size(); i++)
		{
			newArrayList[i] = theData[i];
		}
		
		theData = newArrayList;
	}
	
	//Converts the myArrayList to an array
	public Object[] toArray()
	{
		Object[] arr = new Object[size()];
		for (int i = 0; i < size(); i++)
		{
			arr[i] = theData[i];
		}
		
		return arr;
	}
	
	//Prints the Array List
	public void print()
	{
		for (int i = 0; i < this.size(); i++)
		{
			//System.out.println("Index " + i + " Elements " + theData[i]);
			System.out.print(theData[i] + " ");
		}
		System.out.println();
	}
	
	public int size()
	{
		return size;
	}

}
