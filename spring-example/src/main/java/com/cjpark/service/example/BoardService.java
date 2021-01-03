package com.cjpark.service.example;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	
	public List<String> getList(Integer page) {
		logger.info("svc list call");
		
		List<String> list = new ArrayList<String>();
		
		list.add("가");
		list.add("나");
		list.add("다");
		
		return list;
	}

}
