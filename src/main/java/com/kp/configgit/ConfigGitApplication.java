package com.kp.configgit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigGitApplication.class, args);
	}

}
