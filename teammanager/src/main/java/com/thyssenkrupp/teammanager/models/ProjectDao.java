package com.thyssenkrupp.teammanager.models;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ProjectDao  extends CrudRepository<Project, Long>  {

	public List<Project> findAll();
}
