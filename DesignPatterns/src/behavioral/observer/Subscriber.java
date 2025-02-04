package behavioral.observer;

public class Subscriber implements Observer {
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	String name;

	@Override
	public void update(String message) {
		System.out.println(name+" received message: "+message);
	}

}
