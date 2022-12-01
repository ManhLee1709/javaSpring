package com.tutorial.database;

import com.tutorial.models.Product;
import com.tutorial.repositories.ProductRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Database {
    //longger
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
     CommandLineRunner initDatabase(ProductRepository productRepository){

        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                Product productA = new Product("Macbook Pro",2020,2500.0,"");
                Product productB = new Product("iPad Pro",2021,259.0,"");
                logger.info("insert data: "+ productRepository.save(productA));
                logger.info("insert data: "+ productRepository.save(productB));
            }
        };
    }
}
