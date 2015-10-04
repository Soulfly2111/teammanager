package com.thyssenkrupp.teammanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thyssenkrupp.teammanager.models.CategoryDao;

@Controller
public class HomeController {
	
	@Autowired
	private CategoryDao categoryDao;

	@RequestMapping("/")
	  public String index(Model model) {
		model.addAttribute("name", "Heiner");
		model.addAttribute("categories", categoryDao.findAll()); 
		
	    return "index";
	  }
	
	@RequestMapping("/admin")
	  public String admin(Model model) {
		model.addAttribute("name", "Heiner");
		model.addAttribute("categories", categoryDao.findAll()); 
		
	    return "admin";
	  }
}
