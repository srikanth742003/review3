package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ModelLogin;

import com.example.demo.repo.RepositoryLogin;


@Service
public class ServiceLogin {
	

		@Autowired
		private RepositoryLogin repository;
		
		public String checkLogin(String uname, String pwd) {
		    ModelLogin user = repository.findByuname(uname);
		    if (user == null) {
		      return "User Not Found";
		    }
		    else{
		    	if(user.getPwd().equals(pwd)) {	    		
		    		return"Login Succesfull"; 
		    	}
		    	else {
		    		return "Login Failed";
		    	}
		    }
		}
		public ModelLogin addUser(ModelLogin c) {
			return repository.save(c);
		}
		public List<ModelLogin> getUser()
		{
			return repository.findAll();
		}
	}

