package com.matrimony.services;

import com.matrimony.models.UserDetails;
import com.matrimony.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matrimony.repositories.AdminRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;


	public UserDetails getById(long id) {
		Optional<UserDetails> user =  userRepository.findById(id);
		if(user.isPresent()){
			return user.get();
		}
		return null;
	}

	public List<Long> findByMultipleFields(Date dob, String occupation, double annual_income,
										   String qualification, String cast_preference, String languages,
										   int weight, int height, String habits, String complexion,
										   String religion, String marital_status, String gender) {
		List<Long> list = userRepository.findByMultipleCriteria(dob,occupation,annual_income,qualification,cast_preference,
				languages,weight,height,habits,complexion,religion,marital_status,gender);

		return list;
	}
}
