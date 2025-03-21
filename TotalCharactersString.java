/** The TotalCharacterString program implements an application to display total number of 
     characters present in the String to the standard output
     * @ author  Manish yadav*/
package assignment1thursday;

public class TotalCharactersString 
{
 public static void main(String args[])
 {
	 String str="hey buddy how are you";
	  int count=0;
	  
	  for(int i=0;i<str.length();i++)
	  {
		  if(str.charAt(i) !=' ')
		  {
			  count++;
		  }
	  }
	  System.out.println("Total number of characters in the string are "+count);
 }
}
