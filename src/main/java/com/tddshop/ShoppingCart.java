package com.tddshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static com.tddshop.Constants.APPLE;
import static com.tddshop.Constants.ORANGE;

public class ShoppingCart {
	
	private static Map<String, Double> prices;

	static{
		prices = new HashMap<String, Double>();
		prices.put(APPLE, 0.6);
		prices.put(ORANGE, 0.25);
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
		StringBuilder sb = new StringBuilder("[ ");
		if(cartItems.size()>0){
			Map<String, Integer> productQuantity = new HashMap<String, Integer>();
			for (String item : cartItems) {
				sb.append(item).append(" ");
				int qty = productQuantity.containsKey(item) ? productQuantity.get(item): 0;
				productQuantity.put(item, qty+1);
			}
			if(productQuantity.size()>0){
				if(productQuantity.containsKey(APPLE)){
					int qty = productQuantity.get(APPLE);
					Double itemTotal =   (((int)qty /2) + (qty % 2)) * prices.get(APPLE);
					totalPrice += itemTotal;
				}
				if(productQuantity.containsKey(ORANGE)){
					int qty = productQuantity.get(ORANGE);
					Double itemTotal =   ((((int)qty /3)*2) + (qty % 3)) * prices.get(ORANGE);
					totalPrice += itemTotal;
				}
			}
		}
		sb.append("]");
		sb.append(" => " + totalPrice);
		System.out.println(sb);
		return totalPrice;
	}
	
	public static void main(String a[]){
		ShoppingCart cart = new ShoppingCart();
		cart.addProduct(APPLE);
		cart.addProduct(ORANGE);
		cart.getTotalCost();
	}


}
