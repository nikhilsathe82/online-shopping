package net.ns.shoppingbackend.dao;

import java.util.List;

import net.ns.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
