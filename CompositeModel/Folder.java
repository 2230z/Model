package CompositeModel;

import java.util.ArrayList;

public class Folder extends FileType{

    private ArrayList<FileType> files = new ArrayList<FileType>();


    public Folder(String name) {
        super(name);
    }


    @Override
    public void addFile(FileType file) {
        files.add(file);
    }

    @Override
    public void deleteFile(FileType file) {
        files.remove(file);
    }

    @Override
    public void showFile() {
        for(FileType ft : files) {
            super.showName(ft);
        }
    }
}
