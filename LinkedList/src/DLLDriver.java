//******************************************************
// Nathan Schnitzer
// DLLDriver.java
// 3/26/18
//******************************************************

public class DLLDriver 
{

	public static void main(String[] args) 
	{
		DoublyLinkedList1<String> list1 = new DoublyLinkedList1<String>();
		DoublyLinkedList1<Integer> list2 = new DoublyLinkedList1<Integer>();
		
		//List1
		list1.add("Namath");
		list1.add("Sawer");
		list1.add("Maynard");
		list1.add("Snell");
		list1.add("Boozer");
		list1.add("Atkinson");
		list1.add("Dockery");
		System.out.println(list1.toString());
		list1.printBackwards();
		System.out.println();
		
		//List2
		list2.add(new Integer(42));
		list2.add(new Integer(55));
		list2.add(new Integer(76));
		list2.add(new Integer(13));
		list2.add(new Integer(84));
		list2.add(new Integer(92));
		list2.add(new Integer(65));
		list2.add(new Integer(115));
		System.out.println(list2.toString());
		list2.printBackwards();

	}

}
