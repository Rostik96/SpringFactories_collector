package dev.rost.ezaop;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.io.support.SpringFactoriesLoader;

public class EzAopApplication {

	public static void main(String[] args) {
		var autoConfigurations = SpringFactoriesLoader.loadFactoryNames(EnableAutoConfiguration.class, EzAopApplication.class.getClassLoader());

		autoConfigurations.stream()
				.filter(autoConfigClassName -> autoConfigClassName.contains("org.camunda"))
				.forEach(System.out::println);
	}
}
