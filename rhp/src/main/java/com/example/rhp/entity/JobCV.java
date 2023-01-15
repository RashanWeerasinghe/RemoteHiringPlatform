package com.example.rhp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "JobCV")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobCV {
    @Id
    @Column(name = "Job_Details_ID")
    private String JobDetailsID;

    @ManyToOne()
    @JoinColumn(name = "Job_ID")
    private Job jobCV;

    @ManyToOne()
    @JoinColumn(name = "Candidate_ID")
    private Candidate JobCandidate;
}
