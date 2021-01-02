/**
 * 
 */
package com.cjpark.controller.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjpark.service.example.ExampleService;

/**
 * @author 박창준
 *
 */
@RestController
@RequestMapping("/example/")
public class ExampleController {
	@Autowired
	private ExampleService examService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<String> list(@RequestParam(defaultValue = "0") Integer page) {
		// 서비스호출
		List<String> list = examService.getList(page);
		
		return list;
	}
}
