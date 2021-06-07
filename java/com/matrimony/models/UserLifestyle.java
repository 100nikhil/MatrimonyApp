package com.matrimony.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class UserLifestyle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int height;
    private int weight;
    private String habits;
    private String languagesKnown;
    private String complexion;
    private String maritalStatus;
    private String religion;
    private String caste;
}
