package com.gnbr.library.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.gnbr.library.book.model")
@EnableJpaRepositories(basePackages = "com.gnbr.library.book.persistence")
@SpringBootApplication(scanBasePackages = {
        "com.gnbr.library.book"
})
public class DemoBiblioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBiblioApplication.class, args);
	}

}
