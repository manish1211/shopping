package net.mac.cart_backend.dao;

import java.util.List;

import net.mac.cart_backend.dto.Category;

public interface CategoryDAO {

	
	List<Category> list();
	Category get(int id);
}
