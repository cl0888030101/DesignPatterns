package gof.command;

public class WindowsFileController implements FileSystemController{
    @Override
    public void openFile() {
        System.out.println("open file in windows");
    }

    @Override
    public void closeFile() {
        System.out.println("close file in windows");
    }

    @Override
    public void readFile() {
        System.out.println("read file in windows");
    }

    @Override
    public void writeFile() {
        System.out.println("write file in windows");
    }
}
