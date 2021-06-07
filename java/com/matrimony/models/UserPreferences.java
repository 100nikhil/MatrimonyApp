package com.matrimony.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class UserPreferences {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long age;
    private long height;
    private String maritalStatus;
    private String religion;
    private String qualification;
    private String occupation;
    private long annualIncome;
    private boolean castePreference;

}
