package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.MenuItem;
import com.app.repository.MenuRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")  
public class HomeController {

	@Autowired
	MenuRepository menuRepository;
	
	@GetMapping("/")
	public List<MenuItem> getHome() {
		return menuRepository.findAll();
	}
}
