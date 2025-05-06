package com.ioc.quickones;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.ioc.wirable.Activity;

import jakarta.annotation.PostConstruct;

public class Integrator implements InitializingBean {
    @Autowired
    @Qualifier("doc")
    Activity activity;
    
    @Autowired
    @Qualifier("code")
    Activity activity2;
    
    
    @Autowired
    Activity activity3;
   
    {
    	System.out.println("Integrator instance initializer block called");
		System.out.println("activity: " + activity);
		System.out.println("activity2: " + activity2);
		System.out.println("activity3: " + activity3);
    }
    
    public Integrator() {
		System.out.println("Integrator constructor called");
		if(activity == null  || activity2 == null || activity3 == null) {
			System.out.println("Some of the activity beans are not injected");
		}
	}
    
    public void fun() {
    	System.out.println("Integrator running");
    	activity.perform();
        activity2.perform();
        activity3.perform();
    }


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Integrator bean is created");
		if(activity == null  || activity2 == null || activity3 == null) {
			System.out.println("Some of the activity beans are not injected");
		}
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Integrator bean is initialized");
		if(activity == null  || activity2 == null || activity3 == null) {
			System.out.println("Some of the activity beans are not injected");
		}
	}
}
