package com.tddshop;

import org.junit.Test;

import junit.framework.Assert;


/**
 * Unit test for simple App.
 */
public class TDDShopTest 
{
	@Test
	public void testCreateAnEmptyCart(){
		ShoppingCart cart = new ShoppingCart();
		Assert.assertEquals(0, cart.getItemsCount());
	}
	
}
