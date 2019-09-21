package com.webserviceproject.webserviceproducer.repo;

import org.springframework.data.repository.CrudRepository;

import com.webserviceproject.webserviceproducer.model.College;

public interface CrudRepo extends CrudRepository<College, Integer>{

	
}
