package com.arielpertile.boxWeb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.arielpertile.boxWeb.model.City;

public interface CityRepository extends CrudRepository<City, Long> {

	List<City> findByNameLike(String name);
	
	@Query("SELECT c FROM City c JOIN FETCH c.state WHERE c.name LIKE CONCAT('%', :name, '%')")
	List<City> findByNameLikeFetchStateCountry(@Param("name") String name);
}
