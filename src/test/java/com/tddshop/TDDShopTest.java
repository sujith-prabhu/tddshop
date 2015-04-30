package com.tddshop;

import static org.junit.Assert.*;

import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class TDDShopTest 
{
	private static final double DELTA = 1e-15;

	@Test
	public void testCreateAnEmptyCart(){
		ShoppingCart cart = new ShoppingCart();
		assertEquals(0, cart.getItemsCount());
	}
	
	@Test
	public void testAddOneProduct(){
		ShoppingCart cart = new ShoppingCart();
		cart.addProduct("Apple");
		assertEquals(1, cart.getItemsCount());
		assertEquals(0.6, cart.getTotalCost(),DELTA);
	}

	@Test
	public void testAddAnotherProduct(){
		ShoppingCart cart = new ShoppingCart();
		cart.addProduct("Orange");
		assertEquals(1, cart.getItemsCount());
		assertEquals(0.25, cart.getTotalCost(),DELTA);
	}

	@Test
	public void testAddDifferentProducts(){
		ShoppingCart cart = new ShoppingCart();
		cart.addProduct("Orange");
		cart.addProduct("Apple");
		assertEquals(2, cart.getItemsCount());
		assertEquals(0.85, cart.getTotalCost(),DELTA);
	}
	
}
