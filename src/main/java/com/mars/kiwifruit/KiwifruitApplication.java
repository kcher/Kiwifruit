package com.mars.kiwifruit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

@SpringBootApplication
public class KiwifruitApplication {

	public static void main(String[] args) {
		SpringApplication.run(KiwifruitApplication.class, args);
	}


	@Bean
	@ConditionalOnMissingBean(FileSystem.class)
	public FileSystem fileSystem() {
		return FileSystems.getDefault();
	}


}
