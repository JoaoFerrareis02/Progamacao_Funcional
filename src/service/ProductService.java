package service;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {

	public double filteredSum(List<Product> item, Predicate<Product> criteria) {

		double sum = 0.0;

		for (Product p : item) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}

		return sum;

	}

}
