package CompositeModel;

public class MainCLass {
    public static void main(String[] args) {
        FileType root = new Folder("rootFolder");
        FileType text = new TxtFileType("text.txt");
        FileType img = new ImgFile("img.jpg");
//        img.showFile();
        root.addFile(text);
        root.addFile(img);
        FileType first = new Folder("FirstFolder");
        root.addFile(first);
        FileType img2 = new ImgFile("img2.jpg");
        first.addFile(img2);

        root.showFile();
        System.out.println("----------------");
        first.showFile();
        System.out.println("----------------");
        root.deleteFile(text);
        root.showFile();
    }

}
