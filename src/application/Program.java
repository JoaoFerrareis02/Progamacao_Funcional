package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		//Collections.sort(list);(1º Modo)
		
		//list.sort(new MyComparator()); (2º Modo)
		
		/*Comparator<Product> comp = new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
			}
		}; 
		list.sort(comp);  (3º Modo)*/
		
		/*Comparator<Product> comp = (p1,p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		list.sort(comp); (4º Modo - Progamacação funcional)*/
		
		/*Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		list.sort(comp); (5º Modo)*/
		
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product p: list) {
			System.out.println(p);
		}
		
	}

}
