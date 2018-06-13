//***********************************
// Nathan Schnitzer
// Duplicates4.java
// 4/15/18
// Contest #4
//***********************************

import java.util.*;
import java.io.*;

//Note to self: All Methods should be static here and not in Element class

public class Duplicates4
{
    private static ArrayList<Element> letters = new ArrayList<Element>();
    private static ArrayList<String> history = new ArrayList<String>();
   
    public static void main(String[] args) throws IOException
    {
    	//Make new Scanner object and set delimeters
        Scanner scan = new Scanner(new File("src/inputs.txt"));
        scan.useDelimiter("\r\n");
       
        for (int i = 0; i < 26; i++)
        {
            history.add("");
        }
       
        String input;
        String command;
        String toPrint = new String("");
        String inputString;
        StringTokenizer inputToken;
        
        int countReport = 0;
       
        while (scan.hasNext())
        {
            input = scan.next();
            inputToken = new StringTokenizer(input, " ");
            command = inputToken.nextToken();
            inputString = "";
            while (inputToken.hasMoreTokens())
            {
            	inputString += inputToken.nextToken();
            }
           
            if (command.equalsIgnoreCase("ADD")) //Calls Add Command
            {
                String toAdd = inputString;
                add(toAdd);
            }
           
            if (command.equalsIgnoreCase("DELETE")) //Calls Delete Command
            {
                String toDelete = inputString;
                delete(toDelete);
            }
           
            if (command.equalsIgnoreCase("RESET")) //Calls Reset Command
            {
                String toReset = inputString;
                reset(toReset);
            }
           
            if (command.equalsIgnoreCase("REPORT")) //Calls Report Method
            {
                int toReport = Integer.parseInt(inputString);
                countReport++;
                toPrint = report(toReport);
                System.out.println(countReport + ": " + toPrint);
            }
           
           
        }
    }
   
    public static void add(String str)
    {
        str = removeSpaces(str);
   
        for (int i = 0; i < str.length(); i++)
        {
           
           int contain = contains(str.charAt(i));
           if (contain == -1)
           {
               Element newElement = new Element(str.charAt(i));
               letters.add(newElement);
           }
           else
               letters.get(contain).addCount();
           
           Collections.sort(letters);
           
           helper();
        }
    }
   
    public static void delete(String str)
    {
       for (int i = 0; i < str.length(); i++)
       { 
    	   int contain = contains(str.charAt(i));
    	   if (contain >= 0)
    	   {
    		   boolean flag = letters.get(contain).removeCount();
    		   if (!flag)
    			   letters.remove(contain);
    	   }
    	   helper();
       }
       }
              
    
    //Reset Command: Resets history and letters... Erasess all Elements
    public static void reset(String str)
    {
        letters.clear();
        for (int i = 0; i < history.size(); i++) //clears history
        	history.set(i, "");
        add(str);
    }
   
    //Returns the history of the index element
    public static String report (int index)
    {
        return history.get(index-1);
    }
   
    //The dirty work
    public static void helper () 
    {
    	for (int j = 0; j < letters.size(); j++)
        {
            if (history.get(j).length() == 0)
                history.set(j, history.get(j) + letters.get(j).getLetter());
            else if (history.get(j).charAt(history.get(j).length()-1) != letters.get(j).getLetter())
            history.set(j, history.get(j) + letters.get(j).getLetter());
            
        }
    }
   
    
    public static String removeSpaces (String str)
    {
        StringTokenizer token = new StringTokenizer(str.toUpperCase(), " ,.;'/\\[](){}!@#$%^&*~`'':<>=+-_1234567890");
        String newStr = "";
           
       while (token.hasMoreTokens())
             newStr += token.nextToken();
       
        return newStr;
    }
   
   
    public static int contains(char ch)
    {
        int returnVal = -1;
   
        for (int i = 0; i < letters.size(); i++)
            if (letters.get(i).getLetter() == Character.toUpperCase(ch))
                returnVal = i;
        return returnVal;
    }
    
 
}