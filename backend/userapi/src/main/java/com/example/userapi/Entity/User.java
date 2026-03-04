package com.example.userapi.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Entity
@Getter
@Setter
@Table(name="users")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name ;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="passport_id")
    private Passport passport;

    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name="name")
    private AADHAR aadhar;
}
