package io.github.leandrocezar.productsjavaapi;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
public class ProductsJavaApiApplication {

    public static void main(String[] args) {
	SpringApplication.run(ProductsJavaApiApplication.class, args);
	log.info("ProdutcsJavaAPI started successfully at {}", LocalDateTime.now());
    }

}
