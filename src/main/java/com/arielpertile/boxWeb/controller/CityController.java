package com.arielpertile.boxWeb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.arielpertile.boxWeb.dto.CityStateCountry;
import com.arielpertile.boxWeb.model.City;
import com.arielpertile.boxWeb.repository.CityRepository;

@Controller
public class CityController {
	
	@Inject
	CityRepository cityRepo;
	
	@RequestMapping(value = "/cities", method = RequestMethod.GET)
	@Transactional
    public @ResponseBody List<CityStateCountry> getCitiesLike(
    		@RequestParam("like") String partialName){
		List<CityStateCountry> response = new ArrayList<CityStateCountry>();
		List<City> cities = cityRepo.findByNameLikeFetchStateCountry(partialName);
		for(City city : cities){
			CityStateCountry cityStateCountry = new CityStateCountry();
			cityStateCountry.setCity(city.getName());
			cityStateCountry.setState(city.getState().getName());
			cityStateCountry.setCountry(city.getState().getCountry().getName());
			response.add(cityStateCountry);
		}
        return response;
    }

}
