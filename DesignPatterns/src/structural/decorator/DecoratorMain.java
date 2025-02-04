package structural.decorator;
//When dynamically/in run time changes to class is needed
//it will avoid subclass explosion for extending property
//directly updates the methods other than updating stats

//Functional interface Function<T,R> is used to transform input of type T to R
//fun interfacr.function.apply() is the format 


public class DecoratorMain {

	public static void main(String[] args) {
		Coffee coffee = new SimpleCoffee();
		coffee = CoffeDecorator.addMilk.apply(coffee);
		coffee= CoffeDecorator.addSugar.apply(coffee);
		System.out.println(coffee.getDescription()+" : "+coffee.getPrice());
	}
}
