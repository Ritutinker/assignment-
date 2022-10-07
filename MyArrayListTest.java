	/*Student name=Ritu 
3.Create an ArrayList.Add few elements.
Write following test cases in a separate java file--
a.)Test for empty list.
b.)Test  for size of arrayList.*/
	
package LabTestJunit;

	import static org.junit.jupiter.api.Assertions.assertEquals;

	import org.junit.jupiter.api.Test;

	//test class
	public class MyArrayListTest {	
		
//a.)Test for empty list.
		@Test
		public void isEmpty()
		{
			assertEquals(false,MyArrayList.myArrayListMain().isEmpty());
		}
//b.)Test  for size of arrayList
		@Test
		public void sizeArrayListTest()
		{
			assertEquals(5,MyArrayList.myArrayListMain().size());
		}
		
	}

