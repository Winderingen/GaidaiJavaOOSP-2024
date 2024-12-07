import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Event event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void createEvent(String name, String date) {
        Event event = new Event(name, date);
        notifyObservers(event);
    }
}
