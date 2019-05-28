package com.ktmon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HyeongGeun Kim
 * AD: goddlaek
 * Date: 28/05/2019
 * Time: 8:37 PM
 */
@RestController
@RequestMapping("/api")
public class Controller {
	@RequestMapping(method = RequestMethod.GET, value = "get")
	public String getData(@RequestParam String input){
		return input;
	}
}
