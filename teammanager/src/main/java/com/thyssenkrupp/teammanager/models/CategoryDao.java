package com.thyssenkrupp.teammanager.models;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface CategoryDao  extends CrudRepository<Category, Long>  {

	
	public List<Category> findAll();
}
