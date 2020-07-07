package com.pharma5.service;



import org.springframework.security.core.userdetails.UserDetailsService;

import com.pharma5.model.User;
import com.pharma5.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}