package creational.Prototype;


//prototype design to use when creation of an object is 
//expensive(complex object structure , too many objects to construct etc)

//it will help to create object from the existing ones easily

//clone() method in the cloneable interface helps to create shallow copy(copies reference also)
//to create entirely independednt object have to create deep copy
//means have to clone the objects inside it also 

public class ProtoTypeMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		Vehicle bike = new Vehicle("Bike", new Engine(350));
		Vehicle bike2 = bike.clone();
		bike.engine.capacity = 100;
		bike.getDetails();
		bike2.getDetails();

	}
}
