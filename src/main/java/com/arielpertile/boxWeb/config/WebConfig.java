package com.arielpertile.boxWeb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.arielpertile.boxWeb.BasePackage;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = BasePackage.class, useDefaultFilters = false, includeFilters = @Filter(Controller.class))
class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**")
				.addResourceLocations("/resources/")
				.setCachePeriod(31556926);
		registry.addResourceHandler("/**")
        		.addResourceLocations("/")
        		.setCachePeriod(0);
	}
	
	
	
}
