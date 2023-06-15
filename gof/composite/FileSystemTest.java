package gof.composite;

public class FileSystemTest {
    public static void main(String[] args) {
        FileSystemComponent folder1 = new Folder("folder1");
        FileSystemComponent folder2 = new Folder("folder2");
        FileSystemComponent folder3 = new Folder("folder3");
        FileSystemComponent file1 = new File("file1");
        FileSystemComponent file2 = new File("file2");
        FileSystemComponent file3 = new File("file3");

        folder1.addComponent(file1);
        folder1.addComponent(folder2);
        folder2.addComponent(file2);
        folder2.addComponent(folder3);
        folder3.addComponent(file3);

        folder1.showInfo();
    }
}
