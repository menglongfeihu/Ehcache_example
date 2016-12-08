/**
 * Copyright (c) 2012 Sohu. All Rights Reserved
 */
package com.sohu.tv.ehcache;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sohu.tv.ehcache.service.EhCacheTestService;


//指定bean注入的配置文件
@ContextConfiguration(locations = { "classpath:application.xml" })
//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner
@RunWith(SpringJUnit4ClassRunner.class)
public class TestService extends AbstractJUnit4SpringContextTests {

    @Resource
    private EhCacheTestService ehCacheTestService;

    @Test
    public void getTimestampTest() throws InterruptedException{
        System.out.println("第一次调用：" + ehCacheTestService.getTimestamp("param"));
        Thread.sleep(2000);
        System.out.println("2秒之后调用：" + ehCacheTestService.getTimestamp("param"));
        Thread.sleep(11000);
        System.out.println("再过11秒之后调用：" + ehCacheTestService.getTimestamp("param"));
    }
}
