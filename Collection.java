/*Author Ritu Tinker;
 * 
 * 2. Write a Java program to create a new tree set and add above ArrayLists in TreeSet.
    Get the number of elements in  tree set and print first and last element of treeset.


*/
package Collections.Anudip;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;



public class BookTree 
{
	public static void main(String[] args) 
	{
		List<Book>bt=new ArrayList<>();
		Book b1=new Book(100,"java","Ritu");
		Book b2=new Book(101,"Artificial intelligence","Ritu");
		Book b3=new Book(102,"Python","Ritu");
		bt.add(b1);
		bt.add(b2);
		bt.add(b3);
		System.out.println("First Line  \n");
		for(Book e:bt)
		{

			System.out.println(e);
		}

		List<Book>bt2=new ArrayList<>();
		Book bb1=new Book(250,"c++","Ritu...");
		Book bb2=new Book(350,"Data Structure2","Ritu...");
		Book bb3=new Book(1300,"Software Engineering","Ritu...");
		bt2.add(bb1);
		bt2.add(bb2);
		bt2.add(bb3);
		System.out.println("\n..........Second List..........\n");
		for(Book ee:bt2)
		{

			System.out.println(ee);
		}

		System.out.println("\n\n\n\n.......................TreeSet List........\n\n");

		TreeSet<Book> set = new TreeSet<Book>();

		set.addAll(bt);
		set.addAll(bt2);

		for(Book s:set)
		{

			System.out.println(s);
		}

		System.out.println("First Element : " +set.first());
		System.out.println("last Element : "+set.last());
	}


}
