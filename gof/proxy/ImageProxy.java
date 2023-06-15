package gof.proxy;

public class ImageProxy implements Image{
    private RealImage realImage;

    @Override
    public void display() {
        if (realImage == null) realImage = new RealImage();
        realImage.display();
    }
}
