package com.example.demo;

import com.example.demo.design.patterns.AbstractFactory.AbstractFactory;
import com.example.demo.design.patterns.Adapter.Adapter;
import com.example.demo.design.patterns.Bridge.Bridge;
import com.example.demo.design.patterns.ChainOfResponsibility.ChainOfResponsibility;
import com.example.demo.design.patterns.DesignPattern;
import com.example.demo.design.patterns.FactoryMethod.FactoryMethod;
import com.example.demo.design.patterns.JavaInterfaceExample.JavaInterfaceExample;
import com.example.demo.design.patterns.Strategy.Strategy;
import com.example.demo.design.patterns.TemplateMethod.TemplateMethod;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	// Design Patterns
	DesignPattern abstractFactory = new AbstractFactory();
	DesignPattern chainOfResponsibility = new ChainOfResponsibility();
	DesignPattern factoryMethod = new FactoryMethod();
	DesignPattern adapter = new Adapter();
	DesignPattern bridge = new Bridge();
	DesignPattern strategy = new Strategy();
	DesignPattern templateMethod = new TemplateMethod();
	DesignPattern javaInterfaceExample = new JavaInterfaceExample();

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
