package com.luv2codle.hibernate.practiceActivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertEmployees {

	public static void main(String[] args) {

		// create session factory
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)					
				.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			// use the session object to save java object
			// creanumte a superstars object
			System.out.println("creating new Employee object....");
			Employee employee = new Employee("jiashen","huang","amazon");
			Employee employee2 = new Employee("jiashen","huang","github");
			Employee employee3 = new Employee("jiashen","huang","Tesla");
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("Saving the employee!!!");
			session.save(employee);
			session.save(employee2);
			session.save(employee3);
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!!");
		} catch(Exception e) {
			System.out.println("what!?");
		}
		finally {
			factory.close();
		}

	}//main

}
