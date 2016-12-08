/**
 * Copyright (c) 2012 Sohu. All Rights Reserved
 */
package com.sohu.tv.ehcache.service.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sohu.tv.ehcache.service.EhCacheTestService;

@Service("ehCacheTestService")
public class EhCacheTestServiceImpl implements EhCacheTestService {

    @Override
    @Cacheable(value="cacheTest",key="#param")
    public String getTimestamp(String param) {
        Long timestamp = System.currentTimeMillis();
        return timestamp.toString();
    }

}
