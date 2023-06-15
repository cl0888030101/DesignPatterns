package gof.observer;

import javax.management.InstanceAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

public class NewsProducer implements Producer{
    private List<Observer> observers;

    public NewsProducer() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) throws Exception{
        if(observer == null) throw new NullPointerException("observer is null");
        if(observers.contains(observer)) throw new Exception("observer is already existed");
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) throws Exception {
        if(observer == null) throw new NullPointerException("observer is null");
        if(observers.isEmpty() || !observers.contains(observer)) throw new Exception("observer is not existed");
        observers.remove(observer);
    }

    @Override
    public void broadcastNews(String message) {
        System.out.println("broadcasting news: " + message);
        for(Observer observer : observers){
            observer.onNewsReceived(message);
        }
    }
}
