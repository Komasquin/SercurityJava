package com.example.springsecurityjpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDeatilsService implements UserDetailsService{

	@Autowired
	UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		//Optional<User> user = userRepo.findByUserName(name);
		User user = userRepo.findByName(name);
		//user.orElseThrow(() -> new UsernameNotFoundException("username is not found!"));
		//return user.map(MyUserDetails::new).get();
		return new MyUserDetails(user);
	}//end of method 'loadUserByUserName(s)'
}
