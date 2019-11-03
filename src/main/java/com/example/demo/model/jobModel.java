package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter 
@NoArgsConstructor
@Entity
@Table(name = "jobs")
public class jobModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="jobId", nullable = false, updatable = false)
	private Long jobId;
	
	 @Column(name="company", nullable = false, updatable = false)
	 private String Company;

	 @Column(name="title", nullable = false, updatable = false)
	 private String Title;

	 @Column(name="category", nullable = false, updatable = false)
	 private String Category;

	 @Column(name="location", nullable = false, updatable = false)
	 private String Location;
	 
	 @Column(name="responsibilities", nullable = false, updatable = false)
	 private String Responsibilities;
	 
	 @Column(name="minimum_qualifications", nullable = false, updatable = false)
	 private String minimumQualifications;
	 
	 @Column(name="preferred_qualifications", nullable = false, updatable = false)
	 private String preferredQualifications;
}
