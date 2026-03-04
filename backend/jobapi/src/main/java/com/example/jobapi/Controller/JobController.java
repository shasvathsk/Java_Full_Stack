package com.example.jobapi.Controller;

import com.example.jobapi.Model.Job;
import com.example.jobapi.Repository.JobApplicationRepository;
import com.example.jobapi.Repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
public class JobController {
    private final JobRepository jobrepo;

    public JobController(JobRepository jobrepo){
        this.jobrepo=jobrepo;
    }

    @PostMapping
    public Job addjob(@RequestBody  Job job){
        return jobrepo.save(job);
    }
}
