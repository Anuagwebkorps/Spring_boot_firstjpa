package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entites.User;
                                   //     kis type ka data ,id type
public interface UserRepository extends CrudRepository<User, Integer> {
     public List<User> findByName(String name);
     
     @Query("select u from User u") //this is JPQl(Java Persistence query language ) from which we give our own query
     public List<User> getAllUser();
     
     @Query("select u from User u where u.name=:n")
     public List<User> getUserByName(@Param("n") String name);
     
     @Query(value="select * from user",nativeQuery = true)
     public List<User> getUserss();
}
 