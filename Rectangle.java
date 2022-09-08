import java.util.Scanner;

public class Rectangle extends Square
{
	Square s=new Square();
	int width;

	public void area()
	{
		super.area();

		Scanner sc=new Scanner(System.in);
		System.out.println(".............................................");
		System.out.println("\n\nEnter Length of rectangle : ");
		length=sc.nextInt();
		System.out.println("Enter Width of rectangle : ");
		width=sc.nextInt();
		int area1=length*width;
		System.out.println("Area of Rectangle : "+area1);

	}


}