package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MenuRepository;
import com.example.demo.datamodel.MenuItem;

@Service
public class MenuImplements implements MenuItemService {
	
	@Autowired
	MenuRepository repo;

	@Override
	public MenuItem add(MenuItem m) {
		// TODO Auto-generated method stub
		return repo.save(m);
	}

	@Override
	public List<MenuItem> get() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
		 return"menu deleted sucessfullyy";
	}

}
