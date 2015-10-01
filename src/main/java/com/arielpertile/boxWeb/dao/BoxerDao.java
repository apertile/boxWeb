package com.arielpertile.boxWeb.dao;

import java.util.List;

import com.arielpertile.boxWeb.model.Boxer;

public interface BoxerDao {
	
	Boxer findById(int boxerId);
	
	List<Boxer> findAll();
	
	Boxer findBySurnameAndFirstName(String surname, String firstName);

}
