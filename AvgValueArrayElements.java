/**The AvgValueArrayElements program implements an application that simply display display the
    average value of array elements.
   * @ author  Manish yadav*/
package assignment1thursday;

public class AvgValueArrayElements {
  
	public static void main(String args[])
	{
		int[] totalnumbers=new int[] {10,5,8,10,12,14,16};
		
		double sum=0,avg;
		//traversing the total elements present in the list
		for(int i=0;i<totalnumbers.length;i++)
		{
			sum=sum+totalnumbers[i];
		}
		//calculating the the average of the total array elements 
	     avg=sum/totalnumbers.length;
	     System.out.println("the average value of array elements is "+avg);
	}
}
