package com.luv2codle.hibernate.practiceActivity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class RetrieveEmployee {

	public static void main(String[] args) {
	// create session factory
	
	SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Employee.class)					
			.buildSessionFactory();
	
	//create session
	Session session = factory.getCurrentSession();
	
	try {
		//start a transaction
		session.beginTransaction();
		
		//query student object
		System.out.println("querying the employee!!!");
		
		//query first letter need to be Uppercase
		List<Employee> theEmployees = session.createQuery("from Employee").list();
		
		displayEmployees(theEmployees);
		
		System.out.println("querying the employee from amazon!!!");
		theEmployees = session.createQuery("from Employee WHERE company ='amazon'").list();
		displayEmployees(theEmployees);
		//commit transaction
		session.getTransaction().commit();
		
		System.out.println("Done!!");
	}
	finally {
		factory.close();
	}
	
	
	}

	private static void displayEmployees(List<Employee> theEmployees) {
		for(Employee employeeTemp: theEmployees) {
			System.out.println(employeeTemp);
		}
	}
}


//public static void main(String[] args) {
//	SessionFactory factory = new Configuration()
//			.configure("hibernate.cfg.xml")
//			.addAnnotatedClass(Employee.class)					
//			.buildSessionFactory();
//	
//	//create session
//	Session session = factory.getCurrentSession();
//	
//	try {
//		//start a transaction
//		session.beginTransaction();
//		
//		//query employee
//		//hibernate 5.7 用 list()
//		List<Employee> theEmployees= session.createQuery("from EMPLOYEE").list();
//		
//		//display the student
//		displayEmployees(theEmployees);
//		
////		// query employee: id=27
////		theEmployees = session.createQuery("from employee e where id = 27").list();
////		
////		
////		//display superstars
////		System.out.println("\n employee who have id=27");
////		displayEmployees(theEmployees);
////		
////		// query superstars: lastname='jimmy' or firstname='fallon'
////		theEmployees = session.createQuery("FROM employee e WHERE e.company = 'google'").list();
////		
////		//display superstars
////		System.out.println("\n\nSuperStars who have last name of jimmy OR s.firstName='Allen'");
////		displayEmployees(theEmployees);
//		
//		//commit the transaction
//		session.getTransaction().commit();
//		
//		System.out.println("Done!!");
//	}
//	finally {
//		factory.close();
//	}
//}
//
//private static void displayEmployees(List<Employee> theEmployees) {
//	for(Employee tempEmployee: theEmployees) {
//		System.out.println(tempEmployee);
//	}
//}