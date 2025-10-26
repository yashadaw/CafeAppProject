package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.datamodel.MenuItem;
import com.example.demo.service.MenuImplements;

@RestController
public class MenuItemController {
	@Autowired
	MenuImplements ser;
	
	@PostMapping("/addmenu")
	public MenuItem add(@RequestBody MenuItem m) {
		return ser.add(m);
		
	}
	
	@GetMapping("/get")
	public List<MenuItem> get() {
		return ser.get();
		
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return ser.delete(id);
		
	}
}
