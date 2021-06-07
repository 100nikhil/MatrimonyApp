package com.matrimony.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String gender;
    private Date dob;
    private String image;

    public String getName() {
        return name;
    }

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    private UserProfiles userProfiles;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    private UserPreferences userPreferences;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    private UserAddress userAddress;
}
