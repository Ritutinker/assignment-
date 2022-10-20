/*user=ritu
 * We will develop below simple basic features in our User Management application:

1.Create a User
2.Update password
3.Delete a User
4.Retrieve a User
5.List of all User
6.Exit
Create Table users : column name ---uname (primary key) , 
password (not null and minimum length should be 6 and should not contain space)

Apply following conditions:

1.While creating user if uname already exists give msg to end user 
that "user alreday exist.Create a unique user name."(create at least five users)

2.While updating ask  user name whose password to be updated.(Uname can't be updated) .

3. in 4th case display uname and password for a perticular user.
  
 */
package firstjdbcConnectionProvider;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


//class UsersDAO
public class UsersDAO {

	// creating
	public static boolean createUser(String uname,String password)
	{
		try
		{
			Connection con=ConnectionProvider.createConnection();
			PreparedStatement pstmt=con.prepareStatement("insert into users (uname,password) values(?,?)");
			pstmt.setString(1, uname);
			pstmt.setString(2, password);
			pstmt.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
			System.out.println("User already exist. Create a unique user name.");
		}
		return false;
	}
	//update
	public static boolean updatePassword(String uname,String newPassword)
	{
		try
		{
			Connection con=ConnectionProvider.createConnection();
			PreparedStatement pstmt=con.prepareStatement("update users set password=(?) where uname=(?)");
			pstmt.setString(1,newPassword);
			pstmt.setString(2,uname);
			pstmt.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
	// deleting 
	public static boolean deletionUser(String uname)
	{
		try
		{
			Connection con=ConnectionProvider.createConnection();
			PreparedStatement pstmt=con.prepareStatement("delete from users where uname=(?)");
			pstmt.setString(1, uname);
			pstmt.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
	//retrieving 
	public static boolean retrievalUser(String uname)
	{
		try
		{
			Connection con=ConnectionProvider.createConnection();
			PreparedStatement pstmt=con.prepareStatement("select uname,password from users where uname=(?)");
			pstmt.setString(1, uname);
			ResultSet rs=pstmt.executeQuery();
			rs.next();
			System.out.println("The user is : "+rs.getString(1)+" and the password is : "+rs.getString(2));
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
	//displaying 
	public static boolean displayingListOfAllTheUsers()
	{
		try
		{
			Connection con=ConnectionProvider.createConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select uname from users");
			while(rs.next())
			{
				System.out.println(" uname : "+rs.getString(1));
				System.out.println("*****************************");
			}
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
}
