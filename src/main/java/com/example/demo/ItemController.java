package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

  @GetMapping("/items")
	public ArrayList<Item> items() {
    Item item1 = new Item(1, "Black Phone", "2004-10-19 10:23:54+02", 1, 1);
    Item item2 = new Item(2, "Green Three legged chair", "2005-10-19 10:23:54+02", 3, 1);
    Item item3 = new Item(3, "Yellow Jacket", "2006-10-19 10:23:54+02", 2, 5);
    Item item4 = new Item(4, "Purple Closet", "2019-10-19 10:23:54+02", 1, 100);

    ArrayList <Item> items =new ArrayList<Item>();
    items.add(item1);
    items.add(item2);
    items.add(item3);
    items.add(item4);

    return items;
	}
}
