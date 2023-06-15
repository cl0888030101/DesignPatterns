package gof.proxy;

public class ImageTest {
    public static void main(String[] args) {
        Image image1 = new ImageProxy();
        Image image2 = new ImageProxy();
        image1.display();
        image2.display();
    }
}
