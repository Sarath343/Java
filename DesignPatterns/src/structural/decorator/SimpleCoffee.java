package structural.decorator;

public class SimpleCoffee implements Coffee {

	public String getDescription() {
		return "Simple coffee ";
	}

	public int getPrice() {
		return 10;
	}
}
