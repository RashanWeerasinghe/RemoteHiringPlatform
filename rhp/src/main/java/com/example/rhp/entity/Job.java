package com.example.rhp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name="Job")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    @Id
    @Column(name="Job_ID")
    private String JobID;
    @Column(name="Position")
    private String Position;
    @Column(name = "Qualifications")
    private String Qualifications;
    @Column(name = "Experience")
    private String Experience;
    @Column(name = "Reporting_to")
    private String Reporting_to;

  @ManyToOne()
  @JoinColumn(
          name = "Company_ID"
  )
  private Company company;

    @OneToOne(mappedBy ="JobID")
    private OfflineAssessment offlineAssessment;

    @OneToOne(mappedBy = "JobID")
    private OnlineAssessment onlineAssessment;

    @ManyToMany(mappedBy = "jobCV",cascade = CascadeType.ALL)
    private List<Candidate>candidate;

    @OneToOne(mappedBy = "jobIN")
    private Interviewer interviewerIN;
}
