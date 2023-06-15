package gof.command;

public class UnixFileController implements FileSystemController{
    @Override
    public void openFile() {
        System.out.println("open file in unix");
    }

    @Override
    public void closeFile() {
        System.out.println("close file in unix");
    }

    @Override
    public void readFile() {
        System.out.println("read file in unix");
    }

    @Override
    public void writeFile() {
        System.out.println("write file in unix");
    }
}
