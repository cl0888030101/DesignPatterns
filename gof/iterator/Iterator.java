package gof.iterator;

public interface Iterator {
    boolean hasNext();
    Object next();
    void remove();
}
