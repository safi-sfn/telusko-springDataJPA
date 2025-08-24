package com.inxod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.inxod.dto.CustomerDto;
import com.inxod.service.CustomerServiceImpl;
import com.inxod.utils.CustomIDGenerator;

@SpringBootApplication
public class SpringMongoDbAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringMongoDbAppApplication.class, args);
		
		CustomerServiceImpl service = container.getBean(CustomerServiceImpl.class);
		
		String csId = CustomIDGenerator.generateId();
		CustomerDto csDto = new CustomerDto(csId, 101,"Rohan","Mumbai");
		String status = service.registerCustomer(csDto);
		System.out.println(status);
		
		System.out.println("*****************");
		
		service.findAllCustomer().forEach(c->System.out.println(c));
	}

}
