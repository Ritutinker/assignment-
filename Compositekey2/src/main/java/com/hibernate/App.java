package com.hibernate;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		
		boolean flag1 = true;
		while (flag1) {
			System.out.println("Hello world");
			System.out.println("press 1 to insert Student");
			System.out.println("press 2 to see Student details");
			System.out.println("press 3 to delete Student details");
			System.out.println("press 4 to update ");
			System.out.println("press 9 to Exit");

			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			boolean flag;

			switch (i) {
			case 1: {
				Student stud = new Student();

				System.out.println("Enter student name to add: ");
				String sname = sc.next();
				stud.setSname(sname);
				System.out.println("Enter student contact to add: ");
				String contact = sc.next();
				stud.setContact(contact);

				flag = StudentDAO.insertStudent(stud);
				if (flag) {
					System.out.println("Student info added successfully");
				} else {
					System.out.println("Problem occured during adding Student details");
				}
				break;
			}
			case 2: {
				Student stud2 = new Student();
				System.out.println("Enter student id to display the student details: ");
				int id = sc.nextInt();
				Student s = StudentDAO.seeStudentDetails(id);
				System.out.println(s);
				break;
			}
			case 3: {
				Student stud3 = new Student();
				System.out.println("Enter student id to delete the student details: ");
				int id = sc.nextInt();
				flag = StudentDAO.deleteStudent(stud3, id);
				if (flag) {
					System.out.println("Student deleted successfully");
				} else {
					System.out.println("problem occured in deleting the student details");
				}
				break;
			}
			case 4: {
				Student stud4=new Student();//
				System.out.println("Enter Student id on which we want student details updation: ");
				int id = sc.nextInt();
				System.out.println("Enter student name to update: ");
				String newName = sc.next();
				System.out.println("Enter Student contact to update: ");
				String newContact = sc.next();
				stud4.setId(id);
				stud4.setSname(newName);
				stud4.setContact(newContact);
				 flag = StudentDAO.updateStudentDetials(stud4,id,newName,newContact);
				//flag = StudentDAO.updateStudentDetials(id,newName,newContact);
				if (flag) {
					System.out.println("Student details updated");
				} else {
					System.out.println("Problem occured while updating the details");
				}
				break;
			}
			case 9: {
				System.out.println("Exit....!!");
				flag1 = false;
				break;
			}
			default:
				System.out.println("please enter a valid number...!!");

			}
		}
	}
}