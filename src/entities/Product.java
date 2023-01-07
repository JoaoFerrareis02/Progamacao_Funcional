package entities;

public class Product implements Comparable<Product> {

	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

	// Predicate

	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100;
	}

	public boolean nonStaticProductPredicate() {
		return price >= 100;
	}

	// Consumer

	public static void staticAccept(Product t) {
		t.setPrice(t.getPrice() * 1.1);
	}

	public void nonStaticAccept() {
		price = price * 1.1;
	}

	// Function

	public static String staticApply(Product t) {
		return t.getName().toUpperCase();
	}

	public String nonStaticApply() {
		return name.toUpperCase();
	}

	@Override
	public int compareTo(Product o) {
		return name.toUpperCase().compareTo(o.getName().toUpperCase());
	}

}
