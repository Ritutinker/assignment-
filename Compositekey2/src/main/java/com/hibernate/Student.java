package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_details")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="st_id",length=30,nullable=false,updatable=true)
	private int id;
	@Column(name="sname",length=50,nullable=false)
	private String sname;
	@Column(name="contact",length=10,nullable=false,unique=true)
	private String contact;

	public Student() {
		super();
	}
	public Student(int id, String sname, String contact) {
		super();
		this.id = id;
		this.sname = sname;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", contact=" + contact + "]";
	}





}