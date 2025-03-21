/**The MainClass program implements an application that simply calls the method of 'Shape' and
    'Rectangle' class by the object of 'Square' class 
    * @ author  Manish yadav*/
package assignment1thursday;

class Shape
{
   void shapeMethod()
   {
	   System.out.println("This is This is shape");
   }
}
//Rectangle class is subclass of Shape class
class Rectangle extends Shape
{
	void rectangleMethod()
	{
		System.out.println("This is rectangular shape");
	}
}
//Circle class is sub class of Shape class
class Circle extends Shape
{
	void circleMethod()
	{
		System.out.println("Square is a rectangle");
	}
}
//Square class is subclass of Rectangle class
class Square extends Rectangle
{
	void squareMethod()
	{
		System.out.println("Square is a rectangle");
	}	
}
//Main Class
public class MainClass
{
	public static void main(String args[])
	{
		Square sqr=new Square();
		sqr.shapeMethod();
		sqr.rectangleMethod();
	}
}