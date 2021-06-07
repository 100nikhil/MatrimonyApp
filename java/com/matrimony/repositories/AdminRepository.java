package com.matrimony.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matrimony.models.AdminDetails;
@Repository
public interface AdminRepository extends JpaRepository<AdminDetails, Long> {
	
	
}
