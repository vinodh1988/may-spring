package com.ioc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ioc.quickones.Cleaning;
import com.ioc.quickones.Integrator;
import com.ioc.quickones.Painting;
import com.ioc.quickones.Task;

@Configuration
public class CentralConfig {
//local block
	{
		System.out.println("Central Config is instantiated");
	}
	
	@Bean("paint")
	public Task getPainting() {
		return new Painting();
	}
	
	@Bean("clean")
	public Task getCleaning() {
		return new Cleaning();
	}
	
	
	@Bean("central")
	//@Scope("prototype")
	public Integrator getObject() {
		return new Integrator();
	}
	
	
}
