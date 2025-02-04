package creational.Prototype;

public class Vehicle implements Cloneable {
	String type;
	Engine engine;

	public Vehicle(String type, Engine engine) {
		super();
		this.type = type;
		this.engine = engine;
	}

	// for shallow copy
	public Vehicle(Vehicle vehicle) {
		this.type = vehicle.type;
		this.engine = vehicle.engine;
	}

//	for shallow copy
//	public Vehicle clone() throws CloneNotSupportedException {
//		return (Vehicle) super.clone();
//	}

	public Vehicle clone() {
		return new Vehicle(this.type, this.engine.clone());
	}

	public void getDetails() {
		System.out.println(this.type + " : " + this.engine.capacity);
	}
}
