package com.ioc.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class CentralConfig {
//local block
	{
		System.out.println("Central Config is instantiated");
	}
}
