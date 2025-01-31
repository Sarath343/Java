package e.exercises;
//Scenario:

//An online store wants to apply a 10% discount to all products that cost more 
//than $1000 and return the updated product prices.

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//input:
//List<Product> products = List.of(
//	    new Product("Laptop", 1500),
//	    new Product("Phone", 800),
//	    new Product("Monitor", 1200),
//	    new Product("Mouse", 50)
//	);

//Output:
//[Laptop: 1350.0, Monitor: 1080.0]

public class ProductDiscount {

	public static void main(String[] args) {
		List<Product> products = List.of(new Product("Laptop", 1500), new Product("Phone", 800),
				new Product("Monitor", 1200), new Product("Mouse", 50));
		getDiscountedMap(products);
	}

	private static void getDiscountedMap(List<Product> products) {
		Map<String, Double> map = products.stream().filter(prod -> prod.getPrice() > 1000)
				.collect(Collectors.toMap(Product::getName, p -> p.getPrice() * 0.9));
		System.out.println(map);

		List<Product> lst = products.stream().map(p -> new Product(p.getName(), p.getPrice() * 3))
				.collect(Collectors.toList());
		System.out.println(lst);

	}

}
