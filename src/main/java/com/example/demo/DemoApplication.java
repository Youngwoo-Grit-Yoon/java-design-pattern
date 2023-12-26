package com.example.demo;

import com.example.demo.design.patterns.AbstractFactory.AbstractFactory;
import com.example.demo.design.patterns.ChainOfResponsibility.ChainOfResponsibility;
import com.example.demo.design.patterns.Command.CommandPattern;
import com.example.demo.design.patterns.DesignPattern;
import com.example.demo.design.patterns.FactoryMethod.FactoryMethod;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	// Design Patterns
	DesignPattern abstractFactory = new AbstractFactory();
	DesignPattern chainOfResponsibility = new ChainOfResponsibility();
	DesignPattern factoryMethod = new FactoryMethod();
	DesignPattern commandPattern = new CommandPattern();

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
