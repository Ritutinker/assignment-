package com.hibernate;

import org.hibernate.Session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HiberUtil
{
public static Session getSession() {
Configuration cfg=new Configuration();
cfg.configure();
SessionFactory factory=cfg.buildSessionFactory();
Session session=factory.openSession();
return session;
}
}
