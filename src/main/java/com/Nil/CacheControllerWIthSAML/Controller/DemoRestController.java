package com.Nil.CacheControllerWIthSAML.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Nil.CacheControllerWIthSAML.Service.CleanCache;

@RestController
public class DemoRestController {

	@Autowired
	private CleanCache cleanCache;

	@RequestMapping("/")
	public String index() {
		return "INDEX PAGE";
	}

	@RequestMapping("/clearCache")
	public void reportCurrentTime() {
		cleanCache.reportCurrentTime();
	}

}
