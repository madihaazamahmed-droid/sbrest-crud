package com.google.sbrest_crud.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admins")

public class AdminController {
	    @PostMapping
	    public void insertData() {
	        System.out.println("data inserted");
	    }

	    @DeleteMapping("/id")
	    public void deleteById() {
	        System.out.println("data deleted");
	    }

	    @DeleteMapping
	    public void deleteAll() {
	        System.out.println("data deleted");
	    }

	    @GetMapping
	    public void fetchById() {
	        System.out.println("data deleted");
	    }

	    @PutMapping
	    public void updateData() {
	        System.out.println("data deleted");
	    }
	}

