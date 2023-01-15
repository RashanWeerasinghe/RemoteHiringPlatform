package com.example.rhp.entity;

import javax.persistence.*;

@Entity(name = "Job_History")
public class JobHistory {
    @Id
    @Column(name = "JobHistory_ID")
    private String JobHistoryID;
    @Column(name = "Position")
    private String Position;
    @Column(name = "Workplace")
    private String Workplace;
    @Column(name = "Start")
    private String Start;
    @Column(name = "End")
    private String End;

    @ManyToOne
    @JoinColumn(name = "Candidate_ID")
    private Candidate CandidateID;
}
