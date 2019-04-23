package myMVC.demo.service.impl;

import myMVC.demo.service.IDemoService;
import myMVC.mvcframework.annotation.GPService;

/**
 * 核心业务逻辑
 */
@GPService
public class DemoService implements IDemoService {

	public String get(String name) {
		return "My name is " + name;
	}

}
