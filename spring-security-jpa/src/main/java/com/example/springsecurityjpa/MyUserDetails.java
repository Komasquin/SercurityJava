package com.example.springsecurityjpa;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



public class MyUserDetails implements UserDetails{
	private String name;
	private String password;
	private String email;
	//private List<GrantedAuthority> auth;
	
	public MyUserDetails() {
	}//end of constructor for 'MyUserDetails() class'
	
	public MyUserDetails(String name) {
		this.name = name;
	}//end of constructor for 'MyUserDetails(String) class'
	
	public MyUserDetails(User user) {
		this.name = user.getName();
		this.password = user.getPassword();
		this.email = user.getEmail();
		//this.auth = Arrays.stream(user.getRoles().split(","))
				//.map(SimpleGrantedAuthority::new)
				//.collect(Collectors.toList());
	}//end of constructor for 'MyUserDetails(User) class'

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		//return auth;
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
