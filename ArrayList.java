/*Student name=Ritu Tinker.
 * Project name : LabTestOnJunit
 3.Create an ArrayList.Add few elements.
Write following test cases in a separate java file--
a.)Test for empty list.
b.)Test  for size of arrayList.*/
package LabTestJunit;


	import static org.junit.jupiter.api.Assertions.assertEquals;

	import org.junit.jupiter.api.Test;

	//test class
	public class ArrayList {
		//method-1 to check whether the arraylist is empty or not
		@Test
		public void isEmpty()
		{
			assertEquals(false,ArrayList.ArrayListMain().isEmpty());
		}
		//method-2 to check the size of the 
		@Test
		public void sizeArrayListTest()
		{
			assertEquals(5,ArrayList.ArrayListMain().size());
		}

	}

