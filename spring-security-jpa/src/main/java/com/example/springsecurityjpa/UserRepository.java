package com.example.springsecurityjpa;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;




										//JpaRepository<User, Integer>
public interface UserRepository extends CrudRepository<User, Integer> {

	//Optional<User> findByUserName(String name);
	public User findByName(String name);
}
