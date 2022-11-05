package CompositeModel;


public abstract class FileType {
    protected String name;  // 文件/文件夹名称
    protected String path;  // 文件路径
    public FileType(String name){
        this.name = name;
    }

    public abstract void addFile(FileType file);
    public abstract void deleteFile(FileType file);
    public abstract void showFile();

    public void showName(FileType file) {
        System.out.println(file.name);
    }
}
