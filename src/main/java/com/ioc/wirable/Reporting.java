package com.ioc.wirable;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("reporting")
@Primary  //incase of conflicting implementation this implementation would be given preference
public class Reporting implements Activity {

	@Override
	public void perform() {
		// TODO Auto-generated method stub
           System.out.println("Reporting activity done");
	}

}
