package com.apjsfa.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ExamOperations {

	public static void main(String[] args) {

	       StandardServiceRegistry ssRegistry=new StandardServiceRegistryBuilder().configure("config.xml").build();

	       Metadata metadata=new MetadataSources(ssRegistry).getMetadataBuilder().build();
	       SessionFactory sFactory=metadata.buildSessionFactory();
	       Session session=sFactory.openSession();

	 	  Transaction transaction=session.beginTransaction();
	 	 
		//  Exam exam1=new Exam(1240,"PA5",300);
		 // Exam exam2=new Exam(1241,"SA3",600);

		//  Exam exam3=new Exam(12,"P5",200);
		//  Exam exam4=new Exam(13,"S3",300);
		  int examIdToUpdate = 12; // The ID of the exam you want to update
	        Exam examToUpdate = session.get(Exam.class, examIdToUpdate); // Fetch the entity
	        if (examToUpdate != null) {
	            // Modify the entity as needed
	            examToUpdate.setExamName("maths"); // Assuming setName method exists in Exam class
	            examToUpdate.setTotalscore(34); // Assuming setMarks method exists in Exam class

	            // Update the entity
	            session.update(examToUpdate);

	//	  session.save(exam3);
		//  session.save(exam4);

		  transaction.commit();
		  
		  session.close();
		  sFactory.close();
		  
		  
	 	  
	}

	}
}
