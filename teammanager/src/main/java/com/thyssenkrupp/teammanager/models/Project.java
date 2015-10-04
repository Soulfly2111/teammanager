package com.thyssenkrupp.teammanager.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "project")
@Getter @Setter
public class Project {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)	  
	  private long id;
	  
	  
	  // The category name
	  @NotNull	  
	  private String name;

}
