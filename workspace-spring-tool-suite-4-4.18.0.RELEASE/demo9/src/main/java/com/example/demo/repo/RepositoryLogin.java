package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.*;


public interface RepositoryLogin extends JpaRepository<ModelLogin, Integer> {

	ModelLogin findByuname(String uname);
}