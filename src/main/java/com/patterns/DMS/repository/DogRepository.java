package com.patterns.DMS.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.patterns.DMS.Models.Dog;

/*
 * @Sarvani Pera
 */
public interface DogRepository extends CrudRepository<Dog, Integer>{

	List<Dog> findByName(String name);

	

}

