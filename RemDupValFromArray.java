/**This program RemDupValFromArray removes duplicate value from array
 * @author Manish yadav */
//2.Write a program to remove duplicate elements in an array,
package lab2assignment;

public class RemDupValFromArray
{
		public static int removeDuplicates(int array[], int n)
		{
		if(n==0 || n==1){
		return n;
		}
		int j = 0;// it is for the second element
		for (int i=0; i < n-1; i++){
		if (array[i] != array[i+1]){
		array[j++] = array[i];
		}
		}
		array[j++] = array[n-1];
		return j;
		}
		
		public static void main (String[] args) 
		{
		int array[] = {5,7,90,20,20,13,13,13,89,89,29,122};
		int length = array.length;
		length = removeDuplicates(array, length);
		
		System.out.println("The array elements are after removing the duplicate elements");
		for(int i=0; i<length; i++)
		System.out.print(array[i]+" ");
		}
}
