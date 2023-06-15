package gof.observer;

public class NewsTest {
    public static void main(String[] args) {
        Producer newsProducer = new NewsProducer();
        for(int i = 0; i < 100; i++){
            try {
                Observer observer = new NewsSubscriber("name" + i);
                newsProducer.registerObserver(observer);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        newsProducer.broadcastNews("hello world");
    }
}
