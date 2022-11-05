package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
//StudentDAO class
public class StudentDAO {
	//insertStudent
	public static boolean insertStudent(Student stud) {
		try {
			Session session = HibernateUtil.getSession();
			Transaction t = session.beginTransaction();
			session.save(stud);
			t.commit();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	//seeStudentDetails 
	public static Student seeStudentDetails(int id) {
		try {
			Session session = HibernateUtil.getSession();
			Transaction t = session.beginTransaction();
			Student st = session.get(Student.class, id);
			session.getTransaction().commit();
			return st;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	//deleteStudent
	public static boolean deleteStudent(Student stud3,int id)
	{
		try
		{
			Session session=HibernateUtil.getSession();
			session.beginTransaction();
			Student st=session.get(Student.class,id);
			session.delete(st);
			session.getTransaction().commit();
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
	//updateStudentDetails
	public static boolean updateStudentDetials(Student stud4,int id,String newName,String newContact)
	{
		try
		{
			Session session=HibernateUtil.getSession();
			Transaction t=session.beginTransaction();
			Student st=session.get(Student.class, id);
			st.setId(id);
			st.setSname(newName);
     		st.setContact(newContact);
			session.update(stud4);
			//session.update(st);
			t.commit();
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
}