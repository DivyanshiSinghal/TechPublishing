package com.michaelcgood.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com/example/demo/model/Admin.java;

@Repository
public interface SystemRepository extends CrudRepository<SystemExample,Long> {
	

}
