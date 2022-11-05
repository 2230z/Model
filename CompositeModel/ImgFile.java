package CompositeModel;

public class ImgFile extends FileType{


    public ImgFile(String name) {
        super(name);
    }

    @Override
    public void addFile(FileType file) { }

    @Override
    public void deleteFile(FileType file) { }

    @Override
    public void showFile() {
        super.showName(this);
        // 显示图片

    }
}
