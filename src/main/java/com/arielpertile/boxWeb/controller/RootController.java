package com.arielpertile.boxWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RootController {
 
	/**
	 * @param id
	 * @return Returns the person with the given id.
	 */
	@RequestMapping("/id/{id}")
	@ResponseBody
	public String getPersonById(@PathVariable Integer id) {
		return "Your id is " + id;
	}
 
}