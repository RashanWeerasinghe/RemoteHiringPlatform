package com.example.rhp.entity;

import javax.persistence.*;

@Entity(name = "Offline_Assessment")
public class OfflineAssessment {
    @Id
    @Column(name = "Offline_ID")
    private String OfflineID;
    private int Mark;

    @OneToOne()
    @JoinColumn(name = "Job_ID",nullable = false)
    private Job JobID;

    @OneToOne(mappedBy = "OfflineID")
    private  Interviewer interviewer;
}
