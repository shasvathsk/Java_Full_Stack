package com.example.jobapi.Service;

import com.example.jobapi.Model.ApplicationStatus;
import com.example.jobapi.Model.Job;
import com.example.jobapi.Model.JobApplication;
import com.example.jobapi.Model.Users;
import com.example.jobapi.Repository.JobApplicationRepository;
import com.example.jobapi.Repository.JobRepository;
import com.example.jobapi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationService {
    private final JobApplicationRepository jobapplicationrepo;
    private final UserRepository userrepo;
    private final JobRepository jobrepo;

    public JobApplicationService(JobApplicationRepository jobapplicationrepo,
                                 UserRepository userrepo,
                                 JobRepository jobrepo){
        this.jobapplicationrepo=jobapplicationrepo;
        this.userrepo=userrepo;
        this.jobrepo=jobrepo;
    }

    public JobApplication Applyforjob(Long userid, Long jobid){

        Users user = userrepo.findById(userid).orElseThrow(()->new RuntimeException("Invalid user"));

        Job job= jobrepo.findById(jobid).orElseThrow(()->new RuntimeException("Invalid job"));

        JobApplication jobApplication= new JobApplication();
        jobApplication.setUser(user);
        jobApplication.setJob(job);
        jobApplication.setStatus(ApplicationStatus.APPLIED);


        return jobapplicationrepo.save(jobApplication);
    }
    public List<JobApplication> GetApplicationByUser(Long userid){
        return jobapplicationrepo.findByUser(userid);
    }

}
