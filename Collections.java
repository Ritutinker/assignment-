
package Collections.Anudip;

public class Book implements Comparable<Book>
{
	private int bid;
	private String subject;
	private String author;
	
	public Book() 
	{
		super();
	}

	public Book(int bid, String subject, String author) {
		super();
		this.bid = bid;
		this.subject = subject;
		this.author = author;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", subject=" + subject + ", author=" + author + "]";
	}

	@Override
	public int compareTo(Book o) {
		return this.subject.compareTo(o.getSubject());
		//return 0;
		
	}
	
	
}

.................................................................................................................................................................
  /*   Author ritu Tinker;
1.WAP to create 2 ArrayLists list1 and list2 and add 3 objects of Book in each list
 and print elements of both ArrayLists one on one line.


*/
package Collections.Anudip;
import java.util.List;
import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) 
	{
		List<Book>bl=new ArrayList<>();
		Book b1=new Book(101,"Python","Ritu");
		Book b2=new Book(102,"Data Structure","Ritu");
		Book b3=new Book(103,"Java","Ritu");
		bl.add(b1);
		bl.add(b2);
		bl.add(b3);
		System.out.println("First List\n");
		for(Book e:bl)
		{

			System.out.println(e);
		}

		List<Book>bl2=new ArrayList<>();
		Book b4=new Book(104,"Hindi","Ritu...");
		Book b5=new Book(105,"Data Structure","Ritu...");
		Book b6=new Book(106,"Software Engineering","Ritu...");
		bl2.add(b4);
		bl2.add(b5);
		bl2.add(b6);
		System.out.println("\n..........Second List..........\n");
		for(Book ee:bl2)
		{

			System.out.println(ee);
		}


	}

}


