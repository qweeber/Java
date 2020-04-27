package OperationsStream.FilesDirectories;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        try{
            //File directory = new File("dir");
            //directory.mkdir();
            File directory = new File("video" + File.separator + "php" + File.separator + "mysql");
            directory.mkdirs();

            File file2 = new File("video" + File.separator + "php" + File.separator + "mysql", "class1");
                if(!file2.exists()){
                    file2.createNewFile();
                }

            File file = new File("test.txt");

            if(!file.exists()){
                file.createNewFile();
            }

            System.out.println("-------------------------------");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getCanonicalPath());

            System.out.println("-------------------------------");

            System.out.println("Can I write? " + file.canWrite());
            System.out.println("Can I execute? " + file.canExecute());
            System.out.println("Can I read? " + file.canRead());
            System.out.println("Is it hidden? " + file.isHidden());
            System.out.println("Is it a file? " + file.isFile());
            System.out.println("Last modification: " + new Date(file.lastModified()));
            System.out.println("File length in bytes: " + file.length());
            System.out.println("-------------------------------");
            Main.writePaths(new File(System.getProperty("user.dir")));

            //file.delete();

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        //properties
//        System.out.println(System.getProperty("user.dir"));
//        System.out.println(System.getProperty("user.home"));
//        System.out.println(System.getProperty("java.home"));

    }

    static void writePaths(File pathName){
        String[] nameFilesDirectories = pathName.list();
        //System.out.println(pathName.getPath());
        for(int i = 0; i<nameFilesDirectories.length; i++){
            File p = new File(pathName.getPath(), nameFilesDirectories[i]);
            System.out.println(p.getPath());

//            if(p.isFile()) // only files
//                System.out.println(p.getPath());

            if(p.isDirectory()){
                writePaths(new File(p.getPath()));
            }
        }
    }

}
