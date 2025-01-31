package e.exercises;

public class Product {
	public Product(String name, double d) {
		super();
		this.name = name;
		this.price = d;
	}
	 String name;
	double  price;
	 String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}
