package com.fstg.restaurant.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.fstg.restaurant.model.Category;
import com.fstg.restaurant.model.Order;

@Configuration
public class DataRestApiConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		// TODO Auto-generated method stub
		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
		
		HttpMethod[] preventMethod = {HttpMethod.GET, HttpMethod.POST, HttpMethod.PUT, HttpMethod.DELETE};
		
		config.getExposureConfiguration()
			.forDomainType(Category.class)
			.withItemExposure((metadata, httpMethods) -> httpMethods.disable(preventMethod))
			.withCollectionExposure((metada, httpMethods) -> httpMethods.disable(preventMethod));
		
		config.getExposureConfiguration()
			.forDomainType(Order.class)
			.withItemExposure((metadata, httpMethods) -> httpMethods.disable(preventMethod))
			.withCollectionExposure((metada, httpMethods) -> httpMethods.disable(preventMethod));
	}
	
	
}
