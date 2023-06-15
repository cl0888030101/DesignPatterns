package gof.command;

import com.sun.jdi.InvalidTypeException;

public class FileTest {
    public static void main(String[] args) {
        try {
            FileSystemController unixController = FileControllerFactory.create("unix");
            FileCommand readCommand = new ReadCommand(unixController);
            FileCommand writeCommand = new WriteCommand(unixController);
            FileInvoker readFileInvoker = new FileInvoker(readCommand);
            FileInvoker writeFileInvoker = new FileInvoker(writeCommand);
            readFileInvoker.execute();
            writeFileInvoker.execute();
        }catch (InvalidTypeException e){
            e.printStackTrace();
        }
    }
}
