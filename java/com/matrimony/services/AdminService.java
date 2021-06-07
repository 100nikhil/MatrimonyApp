package com.matrimony.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matrimony.models.AdminDetails;
import com.matrimony.repositories.AdminRepository;

import java.util.List;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;

	public boolean login(AdminDetails adminDetail) {
		List<AdminDetails> l=adminRepository.findAll();
		for(AdminDetails ad:l) {
			System.out.println(ad.getId()+" "+ad.getPassword());
			
			if(adminDetail.getId()==ad.getId() && adminDetail.getPassword().equals(ad.getPassword())) {
				return true;
			}
		}
		return false;
	}
	
	
}
