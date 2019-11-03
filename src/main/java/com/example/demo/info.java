package com.example.demo;

import lombok.Getter;

@Getter
public
class info 
{ 
    // static variable single_instance of type Singleton 
    private static info single_instance = null; 
  
    // variable of type String 
    public String title; 
    public String pageTitle; 
  
    // private constructor restricted to this class itself 
    private info() 
    { 
        title = "Hello I am a little project which read data from single table in postgresql database"
        		+ " for gain experience in java spring."; 
        pageTitle = "Read data from single table to repository";
    } 
  
    // static method to create instance of Singleton class 
    public static info getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new info(); 
  
        return single_instance; 
    } 
} 