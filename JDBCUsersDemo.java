/*user Ritu
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

import java.util.Scanner;

public class JDBCUsersDemo {
	
	public static void main(String[] args) {
		
		while(true)
		{
			//below are the given options or choices to the user to execute the queries
			
			System.out.println("press 1 to Create an user");
			System.out.println("press 2 to Update user password");
			System.out.println("press 3 to Delete an user");
			System.out.println("press 4 to Retrieve an user");
			System.out.println("press 5 to Display list of all the users");
			System.out.println("press 6 to exit");
			//Scanner class
			Scanner sc=new Scanner(System.in);
			
			int i=sc.nextInt();
			boolean flag;
			
			switch(i)
			{
			//creating a user and password
			case 1:{
							System.out.println("Enter name to create user: ");
							String uname=sc.next();
							System.out.println("Enter password to the user: ");

							if(true)
							{
								String password=sc.next();
								//checking the password which limit6
								if(password.length()>6 && !password.contains(" "))
								{
									flag=UsersDAO.createUser(uname,password);
									if(flag)
										System.out.println("successfully create a user");
								}
								else
								{
									System.out.println("please enter a valid password");
								}
							}
							break;
			            }
			//  updating the new password
			case 2:{
							System.out.println("Enter that name which first password is updated:");
							String uname=sc.next();
							System.out.println("Enter new password to update: ");
							String newPassword=sc.next();
							flag=UsersDAO.updatePassword(uname,newPassword);
							if(flag)
								System.out.println("Successfully password is updated");
							else
								System.out.println("something went wrong  updated a password");

							break;
			            }
			//case 3 for deleting the user from the table
			case 3:{
							System.out.println("Enter user name to delete the user");
							String uname=sc.next();
							flag=UsersDAO.deletionUser(uname);
							if(flag)
								System.out.println("User deleted successfully");
							else
								System.out.println("something went wrong deleting the user");

							break;
			            }
			//case 4 for retieving the username and password from the table users
			case 4:{
							System.out.println("Enter name to Retrive a user");
							String uname=sc.next();
							flag=UsersDAO.retrievalUser(uname);
							if(flag)
								System.out.println("User retrival and password is successful ");
							else
								System.out.println("Something went wrong");

							break;
			           }
			//case 5 for displaying all the elements from users table
			case 5:{
							System.out.println("displaying the list of all the users");
							flag=UsersDAO.displayingListOfAllTheUsers();
							if(flag)
								System.out.println("displaying list successfull");
							else
								System.out.println("problem occured during displaying the list");

							break;
			            }
			//case 6 exit
			case 6:{
							System.out.println("Exit the table");
							flag=false;
			            }

							break;
			
			default: {
							System.out.println("Please enter a valid no.");
						 }
			}
		}

	}
}