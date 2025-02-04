package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Subject {

	String latestNews;
	List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void notifyUsers() {
		for (Observer obs : observers) {
			obs.update(latestNews);
		}
	}

	@Override
	public void attachObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detachObserver(Observer observer) {
		observers.remove(observer);
	}

	void setMessage(String message) {
		this.latestNews = message;
		System.out.println("news channel broadcasted "+latestNews);
		notifyUsers();
	}
}
