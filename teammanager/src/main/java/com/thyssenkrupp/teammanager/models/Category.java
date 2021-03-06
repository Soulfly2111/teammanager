package com.thyssenkrupp.teammanager.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "category")
@Getter @Setter
public class Category {
	 
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)	  
	  private long id;
	  
	  
	  // The category name
	  @NotNull	  
	  private String name;
	  
	  @OneToMany
	  @OrderBy("id")
	  @JoinTable(name="category_project")	    	    
	  List<Project> projects;
	  
	  
	  
}
