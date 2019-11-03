package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.jobModel;
import com.example.demo.repos.jobsRepository;

@Service
public class jobsService implements IjobsService {

    @Autowired
    private jobsRepository repository;

    @Override
    public List<jobModel> findAll() {

        List<jobModel> jobs = (List<jobModel>) repository.findAll();
        return jobs;
    }
    
    
    
    
    
    
    
}