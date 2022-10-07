/*Student name=Ritu Tinker.
 * Project name : LabTestOnJunit
* 2.Write a program for to check a palindrome string.
Write test cases for 4 different parameters (use @parametrizedTest annotaion).
 */
package LabTestJunit;

public class Palindrome {

	public static boolean isPalindrome(String str)
	{
		String rev="";
	
	for(int i=str.length()-1;i>=0;i--)
		{
		 rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
			return true;
		else 
			return false;
	}
}
