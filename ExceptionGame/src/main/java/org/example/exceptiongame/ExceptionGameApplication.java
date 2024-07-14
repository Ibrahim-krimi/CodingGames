package org.example.exceptiongame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExceptionGameApplication {


	public static void main(String[] args) throws Exception {
		Connection connection = new Connection();
		Service service = new Service();
		A a = new A();
		a.a(service,connection);
		SpringApplication.run(ExceptionGameApplication.class, args);
	}

}
