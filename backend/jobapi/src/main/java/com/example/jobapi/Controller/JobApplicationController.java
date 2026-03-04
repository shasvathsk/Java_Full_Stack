package com.example.jobapi.Controller;

import com.example.jobapi.Model.JobApplication;
import com.example.jobapi.Repository.JobApplicationRepository;
import com.example.jobapi.Service.JobApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class JobApplicationController {
        private final JobApplicationService jobappservice;
        public JobApplicationController(JobApplicationService jobappservice) {
            this.jobappservice = jobappservice;
        }

        @PostMapping
        public JobApplication applyforjob(@RequestParam Long userid,
                           @RequestParam Long jobid){
            return jobappservice.Applyforjob(userid,jobid);
        }

        @GetMapping("/show/{userid}")
        public List<JobApplication> getuserapplication(@PathVariable Long userid){
            return jobappservice.GetApplicationByUser(userid);
        }

}
