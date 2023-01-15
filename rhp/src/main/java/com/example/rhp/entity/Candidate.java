package com.example.rhp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Candidate")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {
    @Id
    @Column(name = "Candidate_ID")
    private String CandidateID;
    @Column(name = "Candidate_Name")
    private String CandidateName;
    @Column(name = "CategoryType")
    private String CategoryType;

    @OneToMany(mappedBy ="CandidateID",cascade = CascadeType.ALL)
    private List<JobHistory> jobHistory;

    @ManyToOne()
    @JoinColumn(name = "Company_ID")
    private Company company;

    @OneToMany(mappedBy = "JobCandidate",cascade = CascadeType.ALL)
    private List<JobCV>jobCV;

    @OneToMany(mappedBy = "candidateD")
    private List<InterviewerDetails> interviewerDetail;

    @OneToOne()
    @JoinColumn(name = "user_id")
    private User userIDC;
}
