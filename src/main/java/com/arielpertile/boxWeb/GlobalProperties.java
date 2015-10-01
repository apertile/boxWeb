package com.arielpertile.boxWeb;

import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Value;

/**
 * <p>
 * A general set of properties which configure the application with string
 * values.
 * 
 * <p>
 * This class consists of three types of properties:
 * <ul>
 * <li>required properties (must be defined by the property source)
 * <li>optional properties (<i>may</i> be defined by the property source but
 * will default to the number following the colon)
 * <li>non-configurable properties (whose value is hard-coded onto this class)
 * </ul>
 * 
 * <p>
 * Required properties include environment-specific properties (e.g., URLs,
 * connection strings, credentials). Optional properties are also environment
 * specific, but their value has a sensible default (e.g., port numbers,
 * quality-of-service parameters). Non-configurable properties are not different
 * between environments but are kept here to avoid hard-coding strings across
 * the application (e.g., queue names, routing keys).
 * 
 */
@Named
@Getter
@Setter
public class GlobalProperties {
	
	/*
	 * MySQL properties.
	 * The following fields MUST be provided externally
	 */
	@Value("${mysql.dataSource.url}")
	private String dataSourceUrl;

	/*
	 * Mongo properties
	 */
	@Value("${mongo.hosts}")
	private String[] mongoHosts;
	@Value("${mongo.port}")
	private String mongoPort;
	@Value("${mongo.db}")
	private String mongoDB;
	@Value("${mongo.user}")
	private String mongoUser;
	@Value("${mongo.password}")
	private String mongoPassword;
	
}
