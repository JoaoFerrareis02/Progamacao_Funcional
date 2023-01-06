package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
	}

}
