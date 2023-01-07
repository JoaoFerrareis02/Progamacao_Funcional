package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class ExerciseLambda {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.next();
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			
			while(line != null) {
				String[] x = line.split(",");
				list.add(new Employee(x[0],x[1], Double.parseDouble(x[2])));				
				line = br.readLine();
			}
			
			List<String> emails = list.stream()
					.filter(x -> x.getSalary() > salary)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x,y)-> x + y);
			
			System.out.printf("Email of people whose salary is more than %.2f:%n",salary);
			emails.forEach(System.out::println);
			System.out.printf("Sum of salary of people whose name starts with 'M': %.2f",sum);
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
