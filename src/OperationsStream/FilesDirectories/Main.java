package OperationsStream.FilesDirectories;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try{
            File file = new File("test.txt");

            if(!file.exists()){
                file.createNewFile();
            }

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
