package com.example.rhp.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Interviewer")
public class Interviewer {
    @Id
    @Column(name = "Interviewer_ID")
   private String InterviewerID;
    @Column(name = "Interviewer_Name")
   private String InterviewerName;

    @ManyToOne()
    @JoinColumn(name = "CompanyID")
    private Company CompanyID;

    @OneToOne()
    @JoinColumn(name = "Offline_ID")
    private OfflineAssessment OfflineID;

    @OneToOne()
    @JoinColumn(
            name = "Online_Id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_Online_ID")
    )
    private OnlineAssessment OnlineId;

    @OneToMany(mappedBy = "interviewerD")
    private List<InterviewerDetails> interviewerDetail;

    @OneToOne()
    @JoinColumn(name = "Job_ID")
    private Job jobIN;

    @OneToOne()
    @JoinColumn(name = "user_id")
    private User userIDI;

}
