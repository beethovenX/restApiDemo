package com.mozart.restApiDemo.config;

import com.mozart.restApiDemo.repository.ItemRepository;
import com.mozart.restApiDemo.document.Item;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = ItemRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(ItemRepository itemRepository) {
        return strings -> {
            itemRepository.save(new Item(null, "REST Airpods Max", 549.00));
            itemRepository.save(new Item(null, "REST MacBook Pro", 3100.00));
            itemRepository.save(new Item(null, "REST Ipad pro Max", 699.00));
            itemRepository.save(new Item(null, "REST iphone pro Max", 1200.00));
            
        };
    }
}
