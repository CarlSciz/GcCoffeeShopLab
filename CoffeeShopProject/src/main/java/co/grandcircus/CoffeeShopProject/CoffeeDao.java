package co.grandcircus.CoffeeShopProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class CoffeeDao {

	
	private List<Coffee> list = new ArrayList<>();
	
	public CoffeeDao() {
//		list.add(new Coffee(""));
//		list.add(new Coffee(""));
//		list.add(new Coffee(""));
		
	}
	
	public List<Coffee>getAllCoffee(){
		return list;
		
	}
	
	
	public List<Coffee> getCoffeeInCategory(String category) {
		List<Coffee> matches = new ArrayList<>();
		for(Coffee coffee : list) {
			if (coffee.getCategory().equalsIgnoreCase(category)) {
				matches.add(coffee);
			}
		}
		return matches;
	}
	
	public Set<String> getCategories() {
		Set<String> categories = new TreeSet<>();
		for(Coffee coffee : list) {
			categories.add(coffee.getCategory());
		}
		return categories;
	}
	
	public void addCoffee(Coffee coffee) {
		list.add(coffee);
	}
}
