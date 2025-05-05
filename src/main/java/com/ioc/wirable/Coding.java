package com.ioc.wirable;

import org.springframework.stereotype.Service;

@Service("code")
public class Coding implements Activity {

	@Override
	public void perform() {
		// TODO Auto-generated method stub
        System.out.println("Coding activity done");
	}

}
