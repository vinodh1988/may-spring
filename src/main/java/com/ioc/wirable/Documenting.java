package com.ioc.wirable;

import org.springframework.stereotype.Service;

@Service
public class Documenting implements Activity {

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Documenting activity done");
	}

}
