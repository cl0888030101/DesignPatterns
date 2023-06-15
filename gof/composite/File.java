package gof.composite;

public class File extends FileSystemComponent{
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("File name:" + name);
    }
}
