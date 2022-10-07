/*Student name=Ritu 
3.Create an ArrayList.Add few elements.
Write following test cases in a separate java file--
a.)Test for empty list.
b.)Test  for size of arrayList.*/

package LabTestJunit;
	import java.util.ArrayList;
	import java.util.List;
	

public class MyArrayList {
		
		public static ArrayList<Integer> myArrayListMain() {
			//creating the object al for ArrayList
			ArrayList<Integer> al=new ArrayList<Integer>();
			al.add(10);
			al.add(20);
			al.add(30);
			al.add(40);
			al.add(50);
			return al;	
		}
	}
