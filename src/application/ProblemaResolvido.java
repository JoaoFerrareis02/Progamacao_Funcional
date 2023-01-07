package application;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class ProblemaResolvido {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.next();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Product> list = new ArrayList<>();

			String line = br.readLine();

			while (line != null) {
				String[] vect = line.split(",");
				String name = vect[0];
				double price = Double.parseDouble(vect[1]);
				list.add(new Product(name, price));
				line = br.readLine();
			}

			double avg = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x, y) -> x + y) / list.size();
			System.out.printf("Average price : %.2f%n",avg);
			
			Comparator<String> comp = (s1,s2)-> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> name = list.stream()
					.filter(x -> x.getPrice() < avg)
					.map(x -> x.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			
			name.forEach(System.out::println);
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
