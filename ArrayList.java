/*Student name=Ritu Tinker.
 * Project name : LabTestOnJunit
 3.Create an ArrayList.Add few elements.
Write following test cases in a separate java file--
a.)Test for empty list.
b.)Test  for size of arrayList.*/

package LabTestJunit;

import java.util.List;
//main class
public class ArrayList {
	//method myArrayListMain()
	public static ArrayList<Integer> ArrayListMain() {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);//returning the values of arraylist
		al.add(40);
		al.add(50);
		
		return al;	
	}
}
