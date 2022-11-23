import java.io.File;

public class file1 {
    public static void main(String[] args) {
        File  dir=new File("C:\\Users\\Lenovo\\Desktop\\person");
        dir.mkdir();
        String dirloc=dir.getAbsolutePath();
        System.out.println(dirloc);
        String dirName=dir.getName();
        System.out.println(dir.getName());

    }
}
