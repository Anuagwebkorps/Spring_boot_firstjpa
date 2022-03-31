package com.jpa.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entites.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		  UserRepository ur=context.getBean(UserRepository.class);
		  User user=new User();
		  user.setName("Abhi");
		  user.setCity("Indore");
		  user.setStatus("I am Hr");
		  
		  User user1=new User();
		  user1.setName("Raj");
		  user1.setCity("Indore");
		  user1.setStatus("I am Developer");
		  //Save single entity...
		  //User user1= ur.save(user);
		  //System.out.println(user1);
		  
		  //Save multiple entity...
	        /* ArrayList<User> al=new ArrayList<User>(); al.add(user); al.add(user1);
			 * Iterable<User> result= ur.saveAll(al); result.forEach(al1->{
			 * System.out.println(al1); System.out.println("done..."); });
			 * 
			 */
			// Show all user
			// Iterable<User> itr=ur.findAll();
			//  itr.forEach(Alluser->{System.out.println(Alluser);});
		  
		  //Customize query
		  //List<User> users=ur.findByName("Abhi");
		  //users.forEach(uu->System.out.println(uu));
		  
		  //Our own query by JPQL
		  //List<User> uu=ur.getAllUser();
		  //uu.forEach(e->{
		//	  System.out.println(e);x]
		 // });
		  
		  //Our own query1 by JPQL
		 // List<User> al=ur.getUserByName("Abhi");
		 // al.forEach(w->{
		//	  System.out.println(w);
		 // });
		  
		//Native  query..
		  List<User> al=ur.getUserss();
		  al.forEach(w->{
			  System.out.println(w);
		  });
		  
		  

			  
		  
		       
		}

}
