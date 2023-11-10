package com.dockerdemo.DockerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.jdbc.lock.DefaultLockRepository;
import org.springframework.integration.jdbc.lock.JdbcLockRegistry;
import org.springframework.integration.jdbc.lock.LockRepository;

import javax.sql.DataSource;

@SpringBootApplication
public class DockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

	@Bean
	DefaultLockRepository defaultLockRepository(DataSource dataSource) {
		return new DefaultLockRepository(dataSource);
	}

	@Bean
	JdbcLockRegistry jdbcLockRegistry(LockRepository lockRepository) {
		return new JdbcLockRegistry(lockRepository);
	}
}
