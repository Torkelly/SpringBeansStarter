package forest.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import forest.beans.Animal;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Animal animal() {
		Animal bean = new Animal("Nimbus", "Cat", 'F', 4.3);
		return bean;
	}

}

