package com.matrimony.models;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class UserFamily {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long familyId;
    private String motherName;
    private String fatherName;
    private String familyType;
    private double familyIncome;
    private String permanentAddress;
}
