import java.util.Scanner;

public class Square implements Shape
{
	int length;
	@Override
	public void area() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Square : ");
		length=sc.nextInt();

		int area1=length*length;
		System.out.println("Area of Square : "+area1);
	}

}