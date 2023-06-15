package gof.proxy;

public class RealImage implements Image{
    @Override
    public void display() {
        System.out.println("displaying real image");
    }
}
