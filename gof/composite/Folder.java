package gof.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Folder extends FileSystemComponent{
    private List<FileSystemComponent> components;
    private String name;

    public Folder(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    @Override
    public void addComponent(FileSystemComponent fileSystemComponent) {
        if(!components.contains(fileSystemComponent)){
            components.add(fileSystemComponent);
        }
    }

    @Override
    public void removeComponent(FileSystemComponent fileSystemComponent) {
        components.remove(fileSystemComponent);
    }

    @Override
    public void showInfo() {
        System.out.println("Folder: " + this.name);
        Iterator<FileSystemComponent> iter = components.iterator();
        while (iter.hasNext()){
            iter.next().showInfo();
        }
    }
}
