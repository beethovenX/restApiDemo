package com.mozart.restApiDemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mozart.restApiDemo.document.Item;

public interface ItemRepository extends MongoRepository<Item, String>{
}