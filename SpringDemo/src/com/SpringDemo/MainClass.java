package com.SpringDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String args[])
	{
	/*BeanFactory fac= new XmlBeanFactory(new FileSystemResource("spring.xml"));*/
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		SessionFactory fac = (SessionFactory)context.getBean("sessionFactory");
		
		Session session= fac.openSession();
		Customer cust = new Customer();
		cust.setCustId(100);		
		cust.setCustName("New  Customer");
		cust.setGender("Male");
		session.beginTransaction();
		session.save(cust);
		session.getTransaction().commit();
		System.out.println("Data Saved");
	
	
		
	
}
}
