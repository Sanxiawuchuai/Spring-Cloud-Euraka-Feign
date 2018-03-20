package com.drzk.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 云平台启动类
 * @author jun
 * 2018年3月7日
 */

@EnableDiscoveryClient
//@EnableFeignClients
@SpringBootApplication
@MapperScan("com.drzk.platform.mapper")
public class CloudPlatformApplication extends SpringBootServletInitializer 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(CloudPlatformApplication.class, args);
	}

}
