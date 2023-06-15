package gof.observer;

public interface Producer {
    void registerObserver(Observer observer) throws Exception;
    void unregisterObserver(Observer observer) throws Exception;

    void broadcastNews(String message);
}
