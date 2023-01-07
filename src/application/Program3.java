package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

public class Program3 {

	public static void main(String[] args) {

		// Interface Funcional

		// É uma interface que possui um único método abstrato. Suas implementações
		// serão tratadas como expressões lambda.

		// Predicate
		
		/*
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.removeIf(x -> x.getPrice() >= 100.00);
		//list.removeIf(new ProductPredicate());
		//list.removeIf(Product::staticProductPredicate);
		//list.removeIf(Product::nonStaticProductPredicate);

		for (Product p : list) {
			System.out.println(p);
		}
		
		*/
		
		//Consumer
		
		/*
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double factor = 1.1;
		list.forEach(x -> x.setPrice(x.getPrice()*factor));
		//list.forEach(new ProductConsumer());
		//list.forEach(Product::staticAccept);
		//list.forEach(Product::nonStaticAccept);
		
		for (Product p : list) {
			System.out.println(p);
		}
		*/
		
		//Function
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//List<String> name = list.stream().map(new ProductFunction()).collect(Collectors.toList());
		//List<String> name = list.stream().map(Product::staticApply).collect(Collectors.toList());
		//List<String> name = list.stream().map(Product::nonStaticApply).collect(Collectors.toList());
		List<String> name = list.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList());
		
		name.forEach(System.out::println);

	}

}
