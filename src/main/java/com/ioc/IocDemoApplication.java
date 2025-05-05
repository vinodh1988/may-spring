package com.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ioc.quickones.Task;

@SpringBootApplication
public class IocDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac=
				SpringApplication.run(IocDemoApplication.class, args);
		
	 Task t=	(Task)ac.getBean("paint");
	 t.doit();
	 
	 t=(Task)ac.getBean("clean");
	 t.doit();
	}

}
