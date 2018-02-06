package com.asher.dubbo.imp;

import com.alibaba.dubbo.config.annotation.Service;
import com.asher.dubbo.HelloService;
@Service
public class HelloServiceImp implements HelloService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello," + name;
	}

}
