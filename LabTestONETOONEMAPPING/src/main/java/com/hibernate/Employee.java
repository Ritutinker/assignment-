/*EMPLOYEE
 
    EMP_ID INT NOT NULL AUTO_INCREMENT,
    NAME VARCHAR(252),
    DEPARTMENT VARCHAR(128),
    SALARY long,
     PRIMARY KEY (EMP_ID)

 */
package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Hibernate2")
//Entity class Employee
public class Employee {
	//data members
	@Id
	@GeneratedValue
	@Column(nullable = false)
	public int emp_id;
	@Column(name = "name", length = 252, nullable = true)
	private String name;
	@Column(name = "department", length = 128, nullable = true)
	private String department;
	private long salary;

	//no-arg constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	//fields constructor
	public Employee(int emp_id, String name, String department, long salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	//getter and setter methods
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	//toString method
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ "]";
	}

}