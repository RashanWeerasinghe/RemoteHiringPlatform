package com.example.rhp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name="Interviewer_Candidate")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InterviewerDetails {
    @Id
    @Column(name = "ID")
    private String InterviewerDetailsID;

    @ManyToOne()
    @JoinColumn(name = "Interviewer_ID")
    private Interviewer interviewerD;

    @ManyToOne()
    @JoinColumn(name = "Candidate_ID")
    private Candidate candidateD;
}
