package com.hibernate;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */

public class App {
	
	public static void main(String[] args) {

		
		Session session = HibernateUtil.getSession();

		//Creating Employee values
		Employee e1 = new Employee();
		e1.setName("Ritu");
		e1.setDepartment("management");
		e1.setSalary(50000);

		Employee e2 = new Employee();
		e2.setName("Rudhra");
		e2.setDepartment("Head");
		e2.setSalary(55000);

		Employee e3 = new Employee();
		e3.setName("Ritika");
		e3.setDepartment("vice head");
		e3.setSalary(60000);

		//creating values of Emp_details
		Emp_Details ed1 = new Emp_Details();
		ed1.setEd_id(1);
		ed1.setGender("female");
		ed1.setBank_account("BOB");
		ed1.setAddress("jaipur");
		ed1.setEmp(e1);

		Emp_Details ed2 = new Emp_Details();
		ed2.setEd_id(2);
		ed2.setGender("male");
		ed2.setBank_account("Sbi");
		ed2.setAddress("Rewari");
		ed2.setEmp(e2);

		Emp_Details ed3 = new Emp_Details();
		ed3.setEd_id(3);
		ed3.setGender("female");
		ed3.setBank_account("BANK OF BARODA");
		ed3.setAddress("jaipur");
		ed3.setEmp(e3);

		Transaction t = session.beginTransaction();
		session.save(ed1);
		session.save(ed2);
		session.save(ed3);
		t.commit();

		Query query = session.createQuery("From Emp_Details");
		List<Emp_Details> ll = query.getResultList();
		for (Emp_Details s : ll) {
			System.out.println(s);
		}
		session.close();
	}

}
 