package com.thyssenkrupp.teammanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thyssenkrupp.teammanager.models.Category;
import com.thyssenkrupp.teammanager.models.CategoryDao;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryDao categoryDao;
	
	  @RequestMapping("/createCategory")
	  @ResponseBody
	  public String create(String name) {
	    Category category = null;
	    try {
	    	category = new Category();
	    	category.setName(name);
	      
	    	categoryDao.save(category);
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "User succesfully created! (id = " + category.getId() + ")";
	  }
	  
	  @RequestMapping("/getCategory")
	    public @ResponseBody Category getCategory(
	    		@RequestParam(value="id", required=true) String id) {
	        return categoryDao.findOne(Long.valueOf(id));	        			        		
	    }
}
