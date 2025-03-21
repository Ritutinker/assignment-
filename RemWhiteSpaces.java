/**This program RemWhiteSpaces simply remove all the white spaces from a string
 * @ author Manish yadav */
package lab2assignment;

public class RemWhiteSpaces 
{
	void display()
	{
		String str="Hiee how are you all. Welcome to the anudip foundation course";
		str=str.replaceAll(" ", "");// or " "="/s"
		
		System.out.println(str);
	}
	public static void main(String args[])
	{
		RemWhiteSpaces rws=new RemWhiteSpaces();
		rws.display();
	}
}
