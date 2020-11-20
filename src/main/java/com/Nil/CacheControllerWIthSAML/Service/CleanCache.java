package com.Nil.CacheControllerWIthSAML.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

@Component
public class CleanCache {

	@Autowired
	private CacheManager cacheManager;

	public void reportCurrentTime() {
		cacheManager.getCacheNames().parallelStream().forEach(name -> cacheManager.getCache(name).clear());
	}
}
