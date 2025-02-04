package structural.decorator;

import java.util.function.Function;

public class CoffeDecorator {

	static Function<Coffee, Coffee> addSugar = coffee -> new Coffee() {
		public String getDescription() {
			return coffee.getDescription() + " with sugar";
		}

		@Override
		public int getPrice() {
			return coffee.getPrice() + 5;
		}
	};
	static Function<Coffee, Coffee> addMilk = coffee -> new Coffee() {

		@Override
		public String getDescription() {
			return coffee.getDescription() + " with milk";
		}

		@Override
		public int getPrice() {
			return coffee.getPrice() + 8;
		}

	};
}
