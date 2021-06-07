package com.matrimony.repositories;

import com.matrimony.models.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long> {
    @Query("select det.id from UserEducation ed inner join UserLifestyle lif on ed.educationId=lif.id " +
            "inner join UserDetails det on ed.educationId=det.id "+
            "where det.dob>=?1 and (ed.occupation=?2 or ed.annualIncome=?3 or ed.qualification=?4 "+
            "or lif.caste=?5 or lif.languagesKnown=?6 or lif.weight<=?7 "+
            "or lif.height>=?8 or lif.habits=?9 or lif.complexion=?10 or lif.religion=?11 "+
            "or lif.maritalStatus=?12) and det.gender=?13")
    List<Long> findByMultipleCriteria(Date dob, String occupation, double annual_income,
                                      String qualification, String cast_preference, String languages,
                                      int weight, int height, String habits, String complexion,
                                      String religion, String marital_status, String gender);
}
