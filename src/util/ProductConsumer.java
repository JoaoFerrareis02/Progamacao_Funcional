package util;

import java.util.function.Consumer;

import entities.Product;

public class ProductConsumer implements Consumer<Product>{

	public static final double TAX = 1.1;
	
	@Override
	public void accept(Product t) {
		t.setPrice(t.getPrice()*TAX);
	}

}
