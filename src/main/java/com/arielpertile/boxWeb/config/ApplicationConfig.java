package com.arielpertile.boxWeb.config;

import javax.inject.Named;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.arielpertile.boxWeb.BasePackage;

@Configuration
@ComponentScan(basePackageClasses = BasePackage.class, useDefaultFilters = false, includeFilters = {
		@Filter(Service.class), @Filter(Repository.class), @Filter(Named.class) })
@Import({ PropertyConfig.class, JsonConfig.class, MongoConfig.class, MySqlConfig.class })
class ApplicationConfig {

}
