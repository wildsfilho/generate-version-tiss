package com.tiss.generator.tiss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackageClasses = {TissApplication.class}, basePackages = "br.com.tiss.generator")
@ComponentScan({"br.com.tiss.generator"})
@SpringBootApplication
public class TissApplication {

	public static void main(String[] args) {
		SpringApplication.run(TissApplication.class, args);
	}

}
