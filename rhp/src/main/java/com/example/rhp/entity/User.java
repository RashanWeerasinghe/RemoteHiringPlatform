package com.example.rhp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity(name = "User")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "User_Id")
    private String userId;
    @Column(name = "contact_number")
    private String contactNumber;
    @Column(name = "first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "is_account_non_expired")
    private boolean isAccountNonExpired;
    @Column(name = "is_account_non_locked")
    private boolean isAccountNonLocked;
    @Column(name = "is_credentials_non_expired")
    private boolean isCredentialsNonExpired;
    @Column(name = "is_enabled")
    private boolean isEnabled;
    @Column(name = "prefix", unique = true)
    private String prefix;

    @ManyToOne
    @JoinColumn(name="role_id")
    private UserRole userRole;

    @OneToOne(mappedBy = "userIDC")
    private Candidate candidate;

    @OneToOne(mappedBy = "userID")
    private  Company company;


    @OneToOne(mappedBy = "userIDI")
    private  Interviewer interviewer;
}
