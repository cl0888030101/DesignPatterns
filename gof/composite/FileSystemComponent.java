package gof.composite;

/*
* Composite pattern: create graph structure for different classes
* */
public abstract class FileSystemComponent {
    public void addComponent(FileSystemComponent fileSystemComponent){
        throw new UnsupportedOperationException("fileSystemComponent cannot be added");
    }

    public void removeComponent(FileSystemComponent fileSystemComponent){
        throw new UnsupportedOperationException("fileSystemComponent cannot be removed");
    }

    public abstract void showInfo();
}
