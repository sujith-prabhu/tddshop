package com.tddshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
	private static Map<String, Double> prices;
	static{
		prices = new HashMap<String, Double>();
		prices.put("Apple", 0.6);
		prices.put("Orange", 0.25);
	}
	List<String> cartItems = new ArrayList<String>();
	
	public int getItemsCount() {
		return cartItems.size();
	}

	public void addProduct(String item) {
		cartItems.add(item);	
	}

	public double getTotalCost() {
		double totalPrice = 0.0;
		if(cartItems.size()>0){
			for (String item : cartItems) {
				totalPrice += prices.get(item);
			}
		}
		return totalPrice;
	}


}
