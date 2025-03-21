/**This program factorial takes a number as input from the user and displays the factorial
 * @author Manish yadav*/
package lab2assignment;
import java.util.Scanner;

public class Factorial 
{
	void display()
	{
	int fact=1;
	System.out.println("Enter the number to find the factorial: ");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	
	for(int i=1;i<=number;i++)
	{
		fact=fact*i;
	}
	System.out.println("Factorial of  "+number+" is: "+fact);
	}
	public static void main(String args[])
	{
		Factorial f=new Factorial();
		f.display();
	}
}



