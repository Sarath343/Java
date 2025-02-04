package behavioral.observer;

public interface Subject {
	void notifyUsers();
	void attachObserver(Observer observer);
	void detachObserver(Observer observer);
}
