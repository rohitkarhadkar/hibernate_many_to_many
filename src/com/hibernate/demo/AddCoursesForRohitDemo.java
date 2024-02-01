package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Review;
import com.hibernate.demo.entity.Student;

public class AddCoursesForRohitDemo {

	public static void main(String[] args) {
		//create session Factory
		SessionFactory factory = new Configuration()
									 .configure("hibernate.cfg.xml")
									 .addAnnotatedClass(Instructor.class)
									 .addAnnotatedClass(InstructorDetail.class)
									 .addAnnotatedClass(Course.class)
									 .addAnnotatedClass(Review.class)
									 .addAnnotatedClass(Student.class)
									 .buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		//now use this session to save/retrieve objects
		try
		{
			
			
			//begin transaction
			session.beginTransaction();
			
			//get Rohit(student) from db using pk
			int pk = 1;
			Student tempStudent = session.get(Student.class, pk);
			System.out.println("Student Rohit: "+tempStudent);
			System.out.println("Course signed up by Rohit: "+tempStudent.getCourses());
			
			//create new courses
			Course tempCourse1 = new Course("M3");
			Course tempCourse2 = new Course("Computer Graphics");
			
			//add Rohit to those courses
			tempCourse1.addStudent(tempStudent);
			tempCourse2.addStudent(tempStudent);
			
			//save courses to db
			System.out.println("saving the Courses: ");
			session.save(tempCourse1);
			session.save(tempCourse2);
			System.out.println("The courses are saved!!");
			
			//commit
			session.getTransaction().commit();
			
			System.out.println("Done");
		}
		finally
		{
			//to avoid leakage
			session.close();
			factory.close();
		}

	}

}
