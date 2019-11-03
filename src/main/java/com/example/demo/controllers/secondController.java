package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.info;
import com.example.demo.model.jobModel;
import com.example.demo.services.IjobsService;

@Validated
@Controller
public class secondController {


    @Autowired
    IjobsService jobsService;
	
	@GetMapping("/")
	public String home(Model model) {
		
	    List<jobModel> jobs = (List<jobModel>) jobsService.findAll();

	   
	    
	    model.addAttribute("repo", jobs);
	    
		model.addAttribute("count", jobs.size());

		model.addAttribute("info", info.getInstance());
		
		return "home";
	}

}
