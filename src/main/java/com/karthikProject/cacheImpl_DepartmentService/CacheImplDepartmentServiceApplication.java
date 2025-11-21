package com.karthikProject.cacheImpl_DepartmentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CacheImplDepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheImplDepartmentServiceApplication.class, args);
	}

}
