package com.example.rhp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Company")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @Column(name = "Company_ID")
    private String CompanyID;
    @Column(name = "Name")
    private String Name;
    @Column(name = "Email")
    private String email;
    @Column(name = "Password")
    private String password;
    @Column(name="Address")
    private String address;

    @OneToMany(mappedBy = "company",cascade = CascadeType.ALL)
    private List<Job> job;

    @OneToMany(mappedBy = "CompanyID",cascade = CascadeType.ALL)
    private List<Interviewer> interviewer;

    @OneToMany(mappedBy = "company",cascade = CascadeType.ALL)
    private List<Candidate>candidate;

    @OneToOne()
    @JoinColumn(name = "user_id")
    private User userID;
}
