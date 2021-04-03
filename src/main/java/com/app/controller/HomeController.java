package com.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")  
public class HomeController {

	@GetMapping("/")
	public String getHome() {
		return "[{\r\n"
				+ "    \"name\":\"Pav Bhaji\",\r\n"
				+ "    \"price\":\"120\"\r\n"
				+ "    },{\r\n"
				+ "    \"name\":\"Noodles\",\r\n"
				+ "    \"price\":\"180\"\r\n"
				+ "    },{\r\n"
				+ "    \"name\":\"Bhaji Rice\",\r\n"
				+ "    \"price\":\"80\"\r\n"
				+ "    },{\r\n"
				+ "    \"name\":\"Aloo gobi\",\r\n"
				+ "    \"price\":\"120\"\r\n"
				+ "    },{\r\n"
				+ "    \"name\":\"abcdeh\",\r\n"
				+ "    \"price\":\"520\"\r\n"
				+ "}]";
	}
}
