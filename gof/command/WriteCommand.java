package gof.command;

public class WriteCommand implements FileCommand{
    private FileSystemController fileSystemController;

    public WriteCommand(FileSystemController fileSystemController) {
        this.fileSystemController = fileSystemController;
    }

    @Override
    public void execute() {
        fileSystemController.writeFile();
    }
}
