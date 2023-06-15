package gof.command;

public class ReadCommand implements FileCommand{
    private FileSystemController fileSystemController;

    public ReadCommand(FileSystemController fileSystemController) {
        this.fileSystemController = fileSystemController;
    }

    @Override
    public void execute() {
        fileSystemController.readFile();
    }
}
