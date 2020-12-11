package com.mozart.restApiDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mozart.restApiDemo.document.Item;
import com.mozart.restApiDemo.repository.ItemRepository;

@RestController
public class ItemController {

	private ItemRepository itemRepository;
	
	
	
	public ItemController(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}



	@GetMapping("/rest/items")
	List<Item> getAllItems(){		
		return itemRepository.findAll();
	}
}
