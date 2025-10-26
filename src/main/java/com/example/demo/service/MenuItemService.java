package com.example.demo.service;


import java.util.List;

import com.example.demo.datamodel.MenuItem;

public interface MenuItemService {
	MenuItem add(MenuItem m);
	List<MenuItem> get();
	String delete(int id);

}
