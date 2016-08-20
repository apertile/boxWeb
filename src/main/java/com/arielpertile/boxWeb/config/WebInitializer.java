package com.arielpertile.boxWeb.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
    protected Class<?>[] getRootConfigClasses() {
        log.debug("Loading.. RootConfigClasses");
        return new Class[] { ApplicationConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        log.debug("Loading.. ServletConfigClasses");
        return new Class[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        log.debug("Loading.. ServletMappings");
        return new String[] { "/" };
    }
}