/*4.App 

  Menu---1. Add Student   
         2. See Student detail  
         3. Delete a student
         4. Update student details
         9. Exit

  
*/
import org.hibernate.Transaction;

import com.Student_Mgt.Student;

public class App {

	public static void main(String[] args) {
		Students s=new Students();

	     
		    s.setSt_id(100);
	        s.setSname("Ritu Tinker");
	        s.setContact("9817229673");


			StudentDAO.insertStudents(s);
			StudentDAO.getStudents(s);
			StudentDAO.updateStudents(s);
			StudentDAO.deleteStudents(s);
	}

}
