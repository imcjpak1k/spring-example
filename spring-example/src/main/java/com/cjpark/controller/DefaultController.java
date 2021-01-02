/**
 * 
 */
package com.cjpark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 박창준
 *
 */
@Controller
@RequestMapping(value = "/")
public class DefaultController {

	@RequestMapping(name = "")
	public String index() {
		return "index";
	}
}
