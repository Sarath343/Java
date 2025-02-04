package behavioral.observer;


//design used when there is a one to many dependency between objects
//When automatic notification is needed - mobile notification from apps
//for event driven programming- like chat app

public class ObserverMain {

	public static void main(String[] args) {
		Subscriber sub1 = new Subscriber("Anil");
		Subscriber sub2 = new Subscriber("Thomas");
		Subscriber sub3 = new Subscriber("Revathy");

		NewsChannel channel = new NewsChannel();
		channel.attachObserver(sub2);
		channel.attachObserver(sub1);
		channel.attachObserver(sub3);
		channel.setMessage("Starting broadcast");
	}

}
