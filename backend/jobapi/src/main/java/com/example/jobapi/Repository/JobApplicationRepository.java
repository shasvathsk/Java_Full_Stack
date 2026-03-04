package com.example.jobapi.Repository;

import com.example.jobapi.Model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobApplicationRepository extends JpaRepository<JobApplication,Long> {
        List<JobApplication> findByUser(Long user);
}
