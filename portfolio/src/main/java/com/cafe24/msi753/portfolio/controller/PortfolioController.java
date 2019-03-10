package com.cafe24.msi753.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {
	
	@GetMapping("/index")
	public String index() {
		System.out.println("index화면 출력");
		return "index";
	}
}
