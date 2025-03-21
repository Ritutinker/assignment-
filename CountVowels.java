package labassignments3;
/*In this program CountVowels we are creating a method named countVowels that takes a String as input and convert it into  an array of
characters  and returns the number of vowels in the array.
Furthermore, the method should throw a checked exception if the
array contains the letter 'x'.
*@Manish yadav*/
import java.util.Scanner;
public class CountVowels {
	 int countVowels(String str) {
		
		int c=0; 
//		we are converting string to uppercase
		str=str.toUpperCase();
//		we are storing String in Char array
		char newCharArray[] = str.toCharArray();
//		start loop for checking every index char is it vowel or not
		for(int i=0;i<newCharArray.length;i++)
		{
//			we are comparing every index value one by one if char is vowel counter will increment by 1 every time
			if( (newCharArray[i]=='A') || (newCharArray[i]=='E') || (newCharArray[i]=='I') || (newCharArray[i]=='O') ||  (newCharArray[i]=='U')   )
				c++;
//			if any index value is matched to x than Exception will be throw 
			if(newCharArray[i]=='X') {
				try {
					throw new Exception();
				}
				catch(Exception e) {
					System.out.println("x contain exception");
				}
			}
		}
		return c;
	 }
		
 public static void main(String[] args) {

	 CountVowels cv = new CountVowels();
 Scanner s = new Scanner(System.in);
		System.out.println("Enter a Sring : ");
		String str=s.next();
 int result = cv.countVowels(str);
//		Now we are printing the result of method
		System.out.println("Total Number of Vowels Are : "+result);
 s.close();
	}
}