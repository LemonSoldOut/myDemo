package helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

	//SpringBoot 基础启动器
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}
