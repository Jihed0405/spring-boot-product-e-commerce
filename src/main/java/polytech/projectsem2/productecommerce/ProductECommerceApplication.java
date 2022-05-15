package polytech.projectsem2.productecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication

@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class ProductECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductECommerceApplication.class, args);
	}

}
