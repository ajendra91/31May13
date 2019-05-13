package com.example.Cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


//http://localhost:9090/emp-default.json
//http://localhost:9090/emp-prod.yml
//http://localhost:9090/emp/default
//http://localhost:9090/emp/zz
//http://localhost:9090/emp-prod.properties

//http://localhost:9090/ajay/default
