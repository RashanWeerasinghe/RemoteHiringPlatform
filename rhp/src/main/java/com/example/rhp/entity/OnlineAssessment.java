package com.example.rhp.entity;

import javax.persistence.*;

@Entity(name = "Online_Assessment")
public class OnlineAssessment {
    @Id
    @Column(name = "Online_Id")
    private String OnlineId;
    @Column(name = "Mark")
    private int Mark;

    @OneToOne()
    @JoinColumn(name = "JobID")
    private Job JobID;

    @OneToOne(mappedBy = "OnlineId")
    private Interviewer interviewer;
}
