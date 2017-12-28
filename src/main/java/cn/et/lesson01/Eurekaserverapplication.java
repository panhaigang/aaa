package cn.et.lesson01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eurekaserverapplication {

	public static void main(String[] args) {
		SpringApplication sa=new SpringApplication(Eurekaserverapplication.class);  
        sa.run(args);  

	}

}
