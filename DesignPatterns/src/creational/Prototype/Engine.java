package creational.Prototype;


public class Engine implements Cloneable{
	int capacity ;
	
	public Engine(int cap) {
		this.capacity= cap;
	}
	
	
	//for deep copy
	public Engine clone() {
		return new Engine(this.capacity);
	}
	
	 
	
}
