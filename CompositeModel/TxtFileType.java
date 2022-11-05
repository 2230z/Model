package CompositeModel;

public class TxtFileType extends FileType {

    public TxtFileType(String name) {
        super(name);
    }

    @Override
    public void addFile(FileType file) { }

    @Override
    public void deleteFile(FileType file) { }

    @Override
    public void showFile() {
        super.showName(this);
        // I/O流读取文件
    }
}
