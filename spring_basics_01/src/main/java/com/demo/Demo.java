package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.AppletInitializer;

//DIP vs DI vs IOC
public class Demo {

//	@Autowired
//	private Car car;

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("demo.xml");
		Car car = ctx.getBean("c", Car.class); //Typecasting

		car.drive();

//		Tyre tyre=new MrfTyre();
//		Engine engine=new TurboEngine();
//
//		//i hv used setter
//		Car car =new Car();
//		car.setEngine(engine);
//		car.setTyre(tyre);
//
//		car.drive();
	}
}
