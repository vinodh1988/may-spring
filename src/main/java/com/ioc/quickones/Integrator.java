package com.ioc.quickones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.ioc.wirable.Activity;

public class Integrator {
    @Autowired
    @Qualifier("doc")
    Activity activity;
    
    @Autowired
    @Qualifier("code")
    Activity activity2;
    
    
    public void fun() {
    	System.out.println("Integrator running");
    	activity.perform();
        activity2.perform();
    }
}
