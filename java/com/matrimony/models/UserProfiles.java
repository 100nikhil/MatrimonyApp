package com.matrimony.models;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class UserProfiles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    private UserFamily userFamily;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    private UserLifestyle userLifestyle;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    private UserEducation userEducation;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    private UserPhotos userPhotos;
}
