package com.example.springboot;

import com.example.springboot.DesignPatterns.FactoryMethod.Application;
import com.example.springboot.DesignPatterns.FactoryMethod.ApplicationConfig;
import com.example.springboot.DesignPatterns.FactoryMethod.Bar;
import com.example.springboot.DesignPatterns.FactoryMethod.Foo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		Foo foo = context.getBean(Foo.class);
		Bar bar = context.getBean(Bar.class, "className");

		System.out.println("foo -> " + foo);
		System.out.println("Bar's name " + bar.getName());


//		SpringApplication.run(SpringbootApplication.class, args);
	}
}
