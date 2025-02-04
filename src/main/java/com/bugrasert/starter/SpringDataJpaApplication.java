package com.bugrasert.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.bugrasert.configuration.GlobalProperties;

@SpringBootApplication
@EntityScan(basePackages = {"com.bugrasert"})
@ComponentScan(basePackages = {"com.bugrasert"})
@EnableJpaRepositories(basePackages = {"com.bugrasert"})
@EnableConfigurationProperties(value = GlobalProperties.class)
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
