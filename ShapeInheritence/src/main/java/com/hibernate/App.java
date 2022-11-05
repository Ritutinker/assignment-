package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
/**
* Hello world!
*
*/
public class App
{
	
	public static void main( String[] args )
	{
	Session session=HiberUtil.getSession();
	//rectangle value passed
	Rectangle r=new Rectangle();
	r.setLength(20);
	r.setBreadth(40);
	//circle value passed
	Circle c=new Circle();
	c.setRadius(9);
	Transaction t=session.beginTransaction();
	//session.save(s);
	session.save(r);
	session.save(c);
	t.commit();
	session.close();
	}
	}
	
