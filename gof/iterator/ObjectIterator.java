package gof.iterator;

import java.util.List;

public class ObjectIterator<T> implements Iterator{

    private final List<T> objects;
    private int currIndex;

    public ObjectIterator(List<T> objects) {
        this.objects = objects;
        currIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currIndex < objects.size() && objects.get(currIndex) != null;
    }

    @Override
    public T next() {
        T currObject = objects.get(currIndex);
        currIndex++;
        return currObject;
    }

    @Override
    public void remove() {
        if(currIndex <= 0) throw new UnsupportedOperationException("remove failed, no more object in container");
        int i = currIndex - 1;
        if(objects.get(i) == null) throw new NullPointerException("object is null");
        for(; i < objects.size() - 1; i++){
            objects.set(i,objects.get(i+1));
        }
        objects.set(objects.size()-1, null);
    }
}
