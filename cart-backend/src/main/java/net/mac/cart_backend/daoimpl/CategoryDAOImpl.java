package net.mac.cart_backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.mac.cart_backend.dao.CategoryDAO;
import net.mac.cart_backend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		 
		Category category = new Category();
		//adding first category
		category.setId(1);
		category.setName("Televison");
		category.setDescription("This is first Description of Television");
		category.setImageURL("A1.png");
		
		categories.add(category);
		
		category = new Category();
		//adding second category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is first Description of Mobile");
		category.setImageURL("A2.png");
		
		categories.add(category);
		

		category = new Category();
		//adding third category
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is first Description of Laptop");
		category.setImageURL("A3.png");
		
		categories.add(category);
	}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {
		
		// enhanced for loop
		for(Category category : categories) {
			
			if (category.getId()==id) return category;
		}
		
		return null;
		
	}

}
