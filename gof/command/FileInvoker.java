package gof.command;

public class FileInvoker {
    private FileCommand fileCommand;

    public FileInvoker(FileCommand fileCommand) {
        this.fileCommand = fileCommand;
    }

    public void execute(){
        fileCommand.execute();
    }
}
