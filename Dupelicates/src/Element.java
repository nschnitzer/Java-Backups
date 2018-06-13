//********************************
// Nathan Schnitzer
// 4/15/18
// Element.java
// Support Class for Duplicates4
//********************************

public class Element implements Comparable
    {
        private char letter;
        private int count;
   
        //Constructor
        public Element(char letter)
        {
            this.letter = letter;
            count = 1;
        }
       
        //Increments the count variable
        public void addCount()
        {
        	count++;
        }
       
        //Returns the count variable
        public int getCount()
        {
        	return count;
        }
       
        //Returns the letter as a char
        public char getLetter()
        {
        	return letter;
        }
       
        //Decrements the count while checking if 0
        public boolean removeCount()
        {
            count--;
            if (count <= 0)
            {
                return false;
            }
            else
            {
            	return true;
            }
        }
       
        //Compares 2 Elements
        public int compareTo(Object Element)
        {
            char ElementLetter = ((Element)Element).getLetter();
            if (letter > ElementLetter)
            {
            	return 1;
            }
            else
            if (letter == ElementLetter )
            {
            	return 0;
            }
            else
            {
            	return -1;
            }
        }
       
        public String toString()
        {
            String str = "" + letter;
        return str;}
    }