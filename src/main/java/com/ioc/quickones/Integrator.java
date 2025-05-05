package com.ioc.quickones;

import org.springframework.beans.factory.annotation.Autowired;

import com.ioc.wirable.Activity;

public class Integrator {
    @Autowired
    Activity activity;
    
    public void fun() {
    	System.out.println("Integrator running");
    	activity.perform();
    }
}
