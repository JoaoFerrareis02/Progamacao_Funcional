package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import service.ProductService;

public class Program4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		double sum = ps.filteredSum(list, x -> x.getName().charAt(0) == 'T');
		
		
		System.out.printf("Sum = %.2f%n",sum);
		
		
	}

}
