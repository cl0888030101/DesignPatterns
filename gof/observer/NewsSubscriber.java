package gof.observer;

public class NewsSubscriber implements Observer{

    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void onNewsReceived(String message) {
        System.out.println("NewsSubscriber" + name + ", received news: " + message);
    }
}
