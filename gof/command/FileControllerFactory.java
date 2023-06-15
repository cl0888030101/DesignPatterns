package gof.command;

import com.sun.jdi.InvalidTypeException;

public class FileControllerFactory {
    public static FileSystemController create(String type) throws InvalidTypeException {
        if(type.equals("unix")){
            return new UnixFileController();
        }else if(type.equals("windows")){
            return new WindowsFileController();
        }else {
            throw new InvalidTypeException("type is invalid");
        }
    }
}
