/*Create a method int sum(int[] values, int start,int end) that throws an IllegalArgumentException
when passed an array of length 0, a NullPointerException when passed a null, and
ArrayIndexOutOfBoundsException when start and end do not fall within the range of the given array.
 It should return the sum of the values in the array from start to end but must
throw Exception when sum is 0.
*@Manish yadav*/
package labassignments3;
import java.util.Scanner;
class Sums {
	
	int sum(int[] values, int start,int end)
	{
		int sum = 0; 
		try 
		{//loop iterating from start index to end index
			
			for(int a = start;a<end;a++) 
			{
				sum += values[a];
			}
			
			if(start==end) 
				throw new IllegalArgumentException();
			
			if(values==null) 
				throw new NullPointerException();
			
			if(start<0 || end>=values.length || start>end)
				throw new ArrayIndexOutOfBoundsException();
			
			if(sum==0) 
				throw new Exception();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("IllegalArgumentException");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(NullPointerException a)
		{
			System.out.println("NullPointerException");
		}
		catch(Exception e) 
		{
			System.out.println("sum is 0");
		}
		return sum;
	}

	public static void main(String[] args) {
		Sums s = new Sums();

		Scanner sc = new Scanner(System.in);
		int start,end,size;

		System.out.println("Enter Size of array : ");
		size = sc.nextInt();
		int arr[] =new int[size];
//		Accepting  values from user
		for(int i=0;i<size;i++)
		{
			System.out.println("enter value of ["+i+"] index");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter Start index of array : ");
		start = sc.nextInt();
		
		System.out.println("Enter End index of array : ");
		end = sc.nextInt();

		System.out.println("Sum of array elements is : "+s.sum(arr, start, end));
		sc.close();
	}
}
